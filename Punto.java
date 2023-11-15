public class Punto {
    public double x, y, z;

    public Punto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    double calculoDistancia(Punto punto2) {
        return Math.sqrt(Math.pow(this.x - punto2.getX(), 2) + Math.pow(this.y - punto2.getY(), 2) + Math.pow(this.z - punto2.getZ(), 2));
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
