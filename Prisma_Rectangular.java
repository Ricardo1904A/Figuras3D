import java.util.Scanner;
public class Prisma_Rectangular extends Figuras{
    public Prisma_Rectangular() {
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
        double Lb = p1.calculoDistancia(p2);  // Longitud de la base

        Punto p4 = this.listaPuntos.get(4);  // Punto en la esquina inferior izquierda de la tapa
        double Ab = Lb;  // Ancho de la base

        Punto p0 = this.listaPuntos.get(0);
        double a = p0.calculoDistancia(p4);  // Altura entre el punto 0 y la esquina inferior izquierda de la tapa

        this.volumen = Lb * Ab * a;
        return this.volumen;
    }

    double calcularArea() {
        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);
        double Lb = p1.calculoDistancia(p2);  // Longitud de la base

        Punto p3 = this.listaPuntos.get(2);
        Punto p4 = this.listaPuntos.get(3);
        double a = p3.calculoDistancia(p4);  // Altura

        double Ab = Math.pow(Lb, 2);  // Área de la base
        double Al = 2 * (Lb * a);  // Área lateral
        this.area = 2 * Ab + Al;
        return this.area;
    }
}