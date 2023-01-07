// Import packages
import java.util.Scanner;
import java.util.InputMismatchException;

// Main class
public class MainApp {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        Thread thr = new Thread(calc);
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;

        // Struktur do while
        do {
            System.out.println("\n===Menu Program===");
            System.out.println("\n1. Square\n2. Circle\n3. Trapezoid");
            System.out.print("\nSelect menu: ");

            try {
                int menu = sc.nextInt();
                System.out.println();
                switch (menu) {

                    case 1:
                        System.out.print("Enter the length of the side of the square: ");
                        double side = sc.nextDouble();
                        calc.setSquare(side);
                        thr.start();
                        thr.join();
                        System.out.println("\nThe calculation result: " + calc.getSquare());
                        break;

                    case 2:
                        System.out.print("Enter the radius of the circle: ");
                        double radius = sc.nextDouble();
                        calc.setCircle(radius);
                        thr.start();
                        thr.join();
                        System.out.println("\nThe calculation result: " + calc.getCircle());
                        break;

                    case 3:
                        System.out.print("Insert the side of the base of the trapezoid: ");
                        double base = sc.nextDouble();
                        System.out.print("Enter the upper side of the trapezoid: ");
                        double upper = sc.nextDouble();
                        System.out.print("Enter the height of the trapezoid: ");
                        double height = sc.nextDouble();
                        calc.setTrapezoid(base, upper, height);
                        thr.start();
                        thr.join();
                        System.out.println("\nThe calculation result: " + calc.getTrapezoid());
                        break;
                    case 0:
                        System.out.println("The program is finished");
                    default:
                        System.out.println("\nOptions not available\n");

                        continue;
                }
                repeat = false;

            } catch (InputMismatchException e) {
                System.out.println("\n====Error: Input must be a number====\n");
                sc.next();
            } catch (IllegalArgumentException e) {
                System.out.println();
                System.out.println(e);
                System.out.println();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        } while (repeat);
        sc.close();
    }
}
