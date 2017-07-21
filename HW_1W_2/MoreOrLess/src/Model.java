
public class Model {

    private int min;
    private int max;
    private int lowEdge;
    private int topEdge;
    private int randomValue;

    Model(){
        this.min = 0;
        this.max = 100;
        lowEdge = min;
        topEdge = max;
    }

    public int getRandomValue() {
        return randomValue;
    }

    public void setRandomValue() {
        int maxLocal = max - min;
        this.randomValue = (int) (Math.random() * ++maxLocal) + min;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getLowEdge() {
        return lowEdge;
    }

    public void setLowEdge(int lowEdge) {
        this.lowEdge = lowEdge;
    }

    public int getTopEdge() {
        return topEdge;
    }

    public void setTopEdge(int topEdge) {
        this.topEdge = topEdge;
    }

}
