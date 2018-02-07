package figuras;

public class Figura {

    protected double x, y;

    public Figura() {
        this.x = 0;
        this.y = 0;
    }

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + "," + y;
    }
}
