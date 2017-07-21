import java.util.InputMismatchException;
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
        view.printMessage(View.RULES, from, to);

        int inputNumber;
        do {
            inputNumber = inputNumberFromConsole(sc);
        } while (!compareAndUpdateEdges(inputNumber)) ;

    }

    private int inputNumberFromConsole(Scanner sc) {
         int input = -1;
         while (input == -1) {
             try {
                 input = Integer.parseInt(sc.nextLine());
             } catch (NumberFormatException e) {
                 view.printMessage(View.WRONG_VALUE);
                 view.printMessage(View.STEP, model.getLowEdge(), model.getTopEdge());
             }
         }
        return input;
    }

    private boolean compareAndUpdateEdges(int number) {
        if (!isInRange(number)) {
            view.printMessage(View.OUT_OF_RANGE);
            view.printMessage(View.STEP, model.getLowEdge(), model.getTopEdge());
            return false;
        }
        if (number > model.getRandomValue()) {
            model.setTopEdge(number);
            view.printMessage(View.SMALLER_VALUE, model.getLowEdge(), model.getTopEdge());
            return false;
        }
        else if (number < model.getRandomValue()) {
            model.setLowEdge(number);
            view.printMessage(View.BIGGER_VALUE, model.getLowEdge(), model.getTopEdge());
            return false;
        }
        else {
            view.printMessage(View.SUCCESS, number);
            return true;
        }
    }

    private boolean isInRange(int number) {
        return number >= model.getLowEdge() && number <= model.getTopEdge();
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
