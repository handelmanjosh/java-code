
import java.util.InputMismatchException;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        while (num < 0 || num > 110) {
            try {
                num = sc.nextInt();
            } catch(Exception e) {
                System.out.println("Something went wrong");
            } finally {
                num = -1;
            }
        }      
        System.out.println(num);
        sc.close();
    }
}