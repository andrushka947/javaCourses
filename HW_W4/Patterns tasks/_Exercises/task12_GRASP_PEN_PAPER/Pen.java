package _Exercises.task12_GRASP_PEN_PAPER;

public class Pen {
    private String color;
    private int widthInMM;

    public Pen(String color, int widthInMM) {
        this.color = color;
        this.widthInMM = widthInMM;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getWidthInMM() {
        return widthInMM;
    }
    public void setWidthInMM(int widthInMM) {
        this.widthInMM = widthInMM;
    }
}
