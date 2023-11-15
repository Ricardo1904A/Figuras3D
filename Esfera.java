import java.util.Scanner;

public class Esfera extends Figuras {
    public Esfera() {
    }

    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        // Para el calculo de la esfera necesitamos tanto los puntos del centro como un punto en el borde de la esfera

        System.out.println("Ingrese el componente x del centro de la esfera");
        double x = sc.nextDouble();
        System.out.println("Ingrese el componente y del centro de la esfera");
        double y = sc.nextDouble();
        System.out.println("Ingrese el componente z del centro de la esfera");
        double z = sc.nextDouble();

        Punto centro = new Punto(x, y, z);
        this.listaPuntos.add(centro);
// ingreso de los puntos del borde
        System.out.println("Ingrese el componente x de un punto en la superficie de la esfera");
        double Sx = sc.nextDouble();
        System.out.println("Ingrese el componente y de un punto en la superficie de la esfera");
        double Sy = sc.nextDouble();
        System.out.println("Ingrese el componente z de un punto en la superficie de la esfera");
        double Sz = sc.nextDouble();

        Punto puntoS = new Punto(Sx, Sy, Sz);
        this.listaPuntos.add(puntoS);
    }

    double calcularVolumen() {
        // aqui aseguramos que el primer valor ingresado sea el del valor del centro
        Punto centro = this.listaPuntos.get(0);
        // aqui obtenemos que el valor ingresado = 1 es el punto de la superficie
        Punto puntoS = this.listaPuntos.get(1);
// calculo del radio
        double r = centro.calculoDistancia(puntoS);
        this.volumen = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        return this.volumen;
    }

    double calcularArea() {
        // aqui aseguramos que el primer valor ingresado sea el del valor del centro
        Punto centro = this.listaPuntos.get(0);
        // aqui obtenemos que el valor ingresado = 1 es el punto de la superficie
        Punto puntoSuperficie = this.listaPuntos.get(1);

        double radio = centro.calculoDistancia(puntoSuperficie);
        this.area = 4 * Math.PI * Math.pow(radio, 2);
        return this.area;
    }
}
