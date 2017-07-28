package controller;

import model.Model;
import view.View;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {


    private Model model;
    private View view;

    /**
     * Constructs Controller object with next params set to controller's params
     * @param model
     * @param view
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Creates a new instance of Model and set it to method param
     */
    public void addNote() {
        Scanner sc = new Scanner(System.in);
        InputNoteController inputNoteController = new InputNoteController(view, sc);
        model = inputNoteController.inputDataAndReturn();
        view.printModel(model);
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

}

