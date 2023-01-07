public class Calculation implements Runnable {

    double radius;
    double sisi;
    double area;
    double phi = 3.14;

    // Method Square
    public void setSquare(double sisi) {
        if (sisi > 0) {
            this.area = sisi*sisi;
        } 
        else if (sisi < 1) {
            throw new IllegalArgumentException();
        }
    } 

    public double getSquare() {
        return area;
    }

    // Method Circle
    public void setCircle(double radius) {
        if (radius > 0) {
            this.area = phi*(radius*radius);
        } 
        else if (radius < 1) {
            throw new IllegalArgumentException();
        }
    }

    public double getCircle() {
        return area;
    }

    // Method Trapezoid
    public void setTrapezoid(double a, double b, double t) {
        if (a > 0 && b > 0 && t > 0) {
            this.area = ((a+b)*t)*0.5;
        } 
        else {
            throw new IllegalArgumentException();
        }
    }

    public double getTrapezoid() {
        return area;
    }

    @Override
    public void run() {
        System.out.println("\n====Program will start in====");
        for (int i = 3; i > 0; i--) {
            System.out.println("Starting with thread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
