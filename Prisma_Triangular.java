import java.util.Scanner;

public class Prisma_Triangular extends Figuras {
    public Prisma_Triangular() {
    }

    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los tres puntos que forman el triángulo de la base del prisma triangular:");

        // Limpiar la lista antes de ingresar nuevos puntos
        this.listaPuntos.clear();

        // Ingresar los tres puntos que forman la base del prisma triangular
        for (int i = 0; i < 3; i++) {
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
        // Obtener los puntos de la base
        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);
        Punto p3 = this.listaPuntos.get(2);

        // Calcular el área de la base (triángulo)
        double areaBase = 0.5 * Math.abs(p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() * (p1.getY() - p2.getY()));

        // Obtener la altura del prisma (distancia vertical entre la base y la tapa)
        Punto p4 = this.listaPuntos.get(3);  // Asumiendo que p4 es el punto opuesto a la base
        double altura = Math.abs(p1.getZ() - p4.getZ());

        // Calcular el volumen del prisma multiplicando el área de la base por la altura
        this.volumen = areaBase * altura;
        return this.volumen;
    }

    double calcularArea() {
        // Obtener el área de la base (triángulo)
        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);
        Punto p3 = this.listaPuntos.get(2);

        double areaBase = 0.5 * Math.abs(
                p1.getX() * (p2.getY() - p3.getY()) +
                        p2.getX() * (p3.getY() - p1.getY()) +
                        p3.getX() * (p1.getY() - p2.getY())
        );

        // Obtener la altura del prisma (distancia vertical entre la base y la tapa)
        Punto p4 = this.listaPuntos.get(3);  // Asumiendo que p4 es el punto opuesto a la base
        double altura = Math.abs(p1.getZ() - p4.getZ());

        // Calcular el área lateral del prisma
        double areaLateral = 2 * areaBase;

        // Calcular el área total sumando el área de la base y el área lateral
        this.area = areaBase + areaLateral;
        return this.area;
    }
}
