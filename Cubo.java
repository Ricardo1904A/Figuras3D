import java.util.Scanner;
public class Cubo extends Figuras {
    public Cubo() {
    }
    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        this.listaPuntos.clear(); // Limpiar la lista antes de ingresar nuevos puntos
        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese el componente x del punto " + i);
            double x = sc.nextDouble();
            System.out.println("Ingrese el componente y del punto " + i);
            double y = sc.nextDouble();
            System.out.println("Ingrese el componente z del punto " + i);
            double z = sc.nextDouble();
            Punto punto = new Punto(x, y, z);
            this.listaPuntos.add(punto);
        }
    }
    double calcularVolumen() {
        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);
        double l1 = p1.calculoDistancia(p2);

        this.volumen = Math.pow(l1,3);
        return this.volumen;

    }
    double calcularArea() {
        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);
        double l1 = p1.calculoDistancia(p2);

        this.area = (Math.pow(l1,2)*6);
        return this.area;
}
}