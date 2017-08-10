package _Exercises.task12_GRASP_PEN_PAPER;

public class Human implements Writer{

    public void write(Pen pen, String text) {
        System.out.println("Writing with pen(color:" + pen.getColor() + ", " +
                "width:" + pen.getWidthInMM() + "): " + text);
    }
}
