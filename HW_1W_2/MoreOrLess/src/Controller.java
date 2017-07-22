import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void play(int from, int to){
        Scanner sc = new Scanner(System.in);

        model.setMin(from);
        model.setLowEdge(from);
        model.setMax(to);
        model.setTopEdge(to);
        model.setRandomValue();
        view.printMessage(View.RULES, model);

        int inputNumber;
        do {
            inputNumber = inputNumberFromConsole(sc);
        } while (!compareNumberAndUpdateEdges(inputNumber)) ;

        view.printMessage(View.SUCCESS, model.getRandomValue());
        view.printAllInputValues(model.getInputNumbers());
    }

    private int inputNumberFromConsole(Scanner sc) {
         int input = -1;

         while (input == -1) {
             try {
                 input = Integer.parseInt(sc.nextLine());
             } catch (NumberFormatException e) {
                 view.printMessage(View.WRONG_VALUE);
                 view.printMessage(View.STEP, model);
             }
         }
        return input;
    }

    private boolean compareNumberAndUpdateEdges(int number) {
        if (!isInRange(number)) {
            view.printMessage(View.OUT_OF_RANGE);
            view.printMessage(View.STEP, model);
            return false;
        }
        if (number == model.getRandomValue()) {
            model.getInputNumbers().add(number);
            return true;
        }
        if (number > model.getRandomValue()) {
            model.setTopEdge(number);
            model.getInputNumbers().add(number);
            view.printMessage(View.SMALLER_VALUE, model);
            return false;
        }
        else {
            model.setLowEdge(number);
            model.getInputNumbers().add(number);
            view.printMessage(View.BIGGER_VALUE, model);
            return false;
        }
    }

    private boolean isInRange(int number) {
        return number > model.getLowEdge() && number < model.getTopEdge();
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
