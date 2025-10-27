
public class quadrado extends formaGeo {
    private double lado;

    public quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
