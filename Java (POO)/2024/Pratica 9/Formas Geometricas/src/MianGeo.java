public class MianGeo {
    public static void main(String[] args) {
        formaGeo[] formas = new formaGeo[3];
        formas[0] = new quadrado(4);
        formas[1] = new triangulo(3, 6);
        formas[2] = new Circunferencia(5);

        for (formaGeo f : formas) {
            System.out.println("Área: " + f.calcularArea());
        }
    }
}
