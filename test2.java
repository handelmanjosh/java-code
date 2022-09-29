import java.util.Random;
import static java.lang.Math.sqrt;

public class test2 {
    public static void main(String[] args) {
        Random r = new Random();
        Point[] myPoints = new Point[10];
        for (int i = 0; i < myPoints.length; i++) {
            myPoints[i] = new Point(r.nextDouble(), r.nextDouble());
        }
        print_all(myPoints);
        myPoints = sort_1(myPoints);
        System.out.println("\n________________");
        print_all(myPoints);
    }
    static void print_all(Point[] p) {
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i].distance);
            System.out.print(" | ");
        }
    }
    static boolean check_1(Point[] p) {
        //should be in descending order
        for (int i = 0; i < p.length; i++) {
            if (i != p.length - 1) {
                if (p[i].distance < p[i+1].distance) {
                    return false;
                }
            }
        }
        return true;
    }
    static Point[] sort_1(Point[] p) {
        while (check_1(p) == false) { 
            for (int i = 0; i < p.length; i++) {
                if (i != 0) {
                    if (p[i].distance > p[i-1].distance) {
                        Point temp = p[i];
                        p[i] = p[i-1];
                        p[i-1] = temp;
                    }
                }
            }
        }
        return p;
    }

    static class Point {
        private double[] position = {0.0, 0.0};
        private double distance;
        public Point(double x, double y) {
            position[0] = x;
            position[1] = y;
            distance = sqrt(x * x + y * y);
        }

    }
}
