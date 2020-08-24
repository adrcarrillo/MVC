package mvc;

import controller.Controller;
import model.Model;
import view.View;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Model mod = new Model();
        View view = new View();
        Controller ctrl = new Controller(view, mod);
        //ctrl.init();

        JFrame frame = new JFrame("MVC Multiply");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(view.panelMain);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
