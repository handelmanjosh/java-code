//package lab2;
//do not change the name of the package
//the autograder will fail, if the package is not named properly

// add your own name below:
//
// author: Josh Handelman
//
public class SumOfNumbersOld {
    public static long sumOfNumbers(String str) {
        long total = 0;
        for (long index = 0; index < str.length(); index++) {
            if (Character.isDigit(str.charAt((int)index))) {
                long[] temp = iterNumbers(str, index);
                total = total + temp[0];
                index = temp[1];
            }
        }
        return total;
    }
    public static long[] iterNumbers(String str, long index) {
        long f[] = {Character.getNumericValue(str.charAt((int) index)), index};
        StringBuilder s = new StringBuilder();
        for (long i = f[1]; i < str.length(); i++) {
            char c = str.charAt((int)i);
            if (Character.isDigit(c)) {
                s.append(c);
            } else {
                f[0] = Integer.parseInt(s.toString());
                f[1] = i;
                return f;
            }
        }
        f[1] = str.length();
        f[0] = Long.parseLong(s.toString());
        
        return f;  
        }  
    }

