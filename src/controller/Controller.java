package controller;

import model.Model;
import view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        this.view.buttonMultiply.addActionListener(this);
    }

    /*
    public void init() {
        view.frame.setTitle("MVC Multiply");
        view.frame.setLocationRelativeTo(null); //Start on the middle of Desktop
    }
    */

    public void actionPerformed(ActionEvent e) {
        model.setNumberOne(Integer.parseInt(view.textNumberOne.getText()));
        model.setNumberTwo(Integer.parseInt(view.textNumberTwo.getText()));
        model.multiply();
        view.textResult.setText(String.valueOf(model.getResult()));
    }

}
