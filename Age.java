

import java.util.Scanner;
public class Age {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String age = "";
        System.out.println("Enter your age (Positive Integer)");
        age = sc.nextLine();
        int age2 = checkAge(age);
        String name = "";
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        checkName(name);
        System.out.println(name + " is " + age2 + " years old ");
        sc.close();
        
    }
    static int checkAge(String s)  {
        //check if s exists, if s is a number, if s is within required range
        if (baseCheck(s)) {
            int num = 0;
            try {
                num = Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("Invalid integer detected");
                System.exit(0);
            }
            if (num > 125 || num < 1) {
                System.out.println("Invalid age entered");
                System.exit(0);
            } else {
                return num;
            }
        } else {
            System.out.println("No input detected");
            System.exit(0);
        }
        return 0;
       
    }
    static void checkName(String s)  {
        //check if s exists, if s is numeric, if s is within required range
        if (baseCheck(s)) {
            int value;
            for (int index = 0; index < s.length(); index++) {
                value = Character.getNumericValue(s.charAt(index));
                if ((value < 10 || value > 35) && s.charAt(index) != ' ') {
                    System.out.println("Invalid character detected");
                    System.exit(0);
                }
            }
        } else {
            System.out.println("No input detected");
            System.exit(0);
        }
        
    }
    static boolean baseCheck(String s) {
        if (s.length() == 0) {
            return false;
        }
        return true;
    }
}
