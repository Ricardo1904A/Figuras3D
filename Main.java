import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancias de las clases
        Cubo cubo = new Cubo();
        Prisma_Rectangular prismaRectangular = new Prisma_Rectangular();
        Esfera esfera = new Esfera();
        Prisma_Triangular prismaTriangular = new Prisma_Triangular();

        // Ingresar puntos para el cubo
        System.out.println("Ingresar puntos para el Cubo:");
        cubo.ingresarPuntos();

        // Calcular y mostrar resultados para el cubo
        System.out.println("\nResultados para el Cubo:");
        System.out.println("Volumen: " + cubo.calcularVolumen());
        System.out.println("Área Total: " + cubo.calcularArea());

        // Ingresar puntos para la esfera
        System.out.println("\nIngresar puntos para la Esfera:");
        esfera.ingresarPuntos();

        // Calcular y mostrar resultados para la esfera
        System.out.println("\nResultados para la Esfera:");
        System.out.println("Volumen: " + esfera.calcularVolumen());
        System.out.println("Área Total: " + esfera.calcularArea());
        // Ingresar puntos para el prisma rectangular
        System.out.println("\nIngresar puntos para el Prisma Rectangular:");
        prismaRectangular.ingresarPuntos();

        // Calcular y mostrar resultados para el prisma rectangular
        System.out.println("\nResultados para el Prisma Rectangular:");
        System.out.println("Volumen: " + prismaRectangular.calcularVolumen());
        System.out.println("Área Total: " + prismaRectangular.calcularArea());

        //Ingresar puntos para el prisma triangular
        System.out.println("\nIngresar puntos para el Prisma Triangular:");
        prismaTriangular.ingresarPuntos();

        // Calcular y mostrar resultados para el prisma triangular
        System.out.println("\nResultados para el Prisma Triangular:");
        System.out.println("Volumen: " + prismaTriangular.calcularVolumen());
        System.out.println("Área Total: " + prismaTriangular.calcularArea());
    }
}
