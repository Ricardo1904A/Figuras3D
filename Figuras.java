import java.util.ArrayList;
import java.util.List;

    public class Figuras {
        double volumen, area;
        List<Punto> listaPuntos = new ArrayList<>();

        public Figuras(double volumen, double superficie, List<Punto> listaPuntos) {
            this.volumen = volumen;
            this.area = area;
            this.listaPuntos = listaPuntos;
        }

        public Figuras() {
        }
    double calcularDistancia (Punto punto1,Punto punto2) {
        double dist =Math.sqrt(Math.pow(punto1.getX() - punto2.getX(), 2) +
                Math.pow(punto1.getY() - punto2.getY(), 2) +
                Math.pow(punto1.getZ() - punto2.getZ(), 2));
return dist;
    }
    public void imprimirVolumen (String figura) {
        System.out.println("El volumen de la " + figura +" es "+volumen);
    }
        public void imprimirArea (String figura) {
            System.out.println("El area de la " + figura +" es "+area);
        }


    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

        public List<Punto> getListaPuntos() {
            return listaPuntos;
        }

        public void setListaPuntos(List<Punto> listaPuntos) {
            this.listaPuntos = listaPuntos;
        }
    }

