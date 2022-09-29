import java.util.Random;
//package lab2;
//do not change the name of the package
//the autograder will fail, if the package is not named properly

// add your own name below:
//
// author: Josh Handelman
//
public class SumOfNumbers {
    public static void main(String[] args) {
        //ASCII: 32 --> 126
        System.out.println(sumOfNumbers(null));
        StringBuilder sb = new StringBuilder();
        for (;;) {
            sb.setLength(0);
            for (int i = 0; i < 20; i ++) {
                Random r = new Random();
                int num = r.nextInt(126 - 32) + 32;
                char ch = (char) num;
                sb.append(ch);
            }
            String testString = sb.toString();
            System.out.println(testString);
            try {
                int x = sumOfNumbers(testString);
            } catch (Exception e) {
                System.out.println(testString);
                continue;
            }
        } 
    }
    public static int sumOfNumbers(String str) {
        if (str == null) {
            return 0;
        }
        int total = 0;
        for (int index = 0; index < str.length(); index++) {
            if (Character.isDigit(str.charAt(index))) {
                int[] temp = iterNumbers(str, index);
                total = total + temp[0];
                index = temp[1];
            }
        }
        return total;
    }
    public static int[] iterNumbers(String str, int index) {
        int f[] = {Character.getNumericValue(str.charAt(index)), index};
        StringBuilder s = new StringBuilder();
        for (int i = f[1]; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                s.append(c);
            } else {
                f[0] = Integer.parseInt(s.toString());
                f[1] = i;
                return f;
            }
        }
        f[0] = Integer.parseInt(s.toString());
        f[1] = str.length();
        return f;
    }
}
