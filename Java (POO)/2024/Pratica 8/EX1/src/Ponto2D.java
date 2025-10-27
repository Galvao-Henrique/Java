public class Ponto2D {
    protected double x, y;

    public Ponto2D( double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}
