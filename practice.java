
import java.util.Scanner;


public class practice {
    public static void main(String[] args) {
        String[] testA = {"a", "b", "z"};
        String[] testB = {"c", "e", "f"};

        System.out.println(mergeTwo(testA, testB, 3));
    }
    public static String[] mergeTwo(String[] a, String[] b, int n) {
        String[] c = new String[n];
        int aIndex = 0;
        int bIndex = 0;
        for (int i = 0; i < n; i++) {
            int iDelta = 0;
            if (aIndex == a.length) {
                c[i] = b[bIndex];
                bIndex++;
            } else if (bIndex == b.length) {
                c[i] = a[aIndex];
                aIndex++;
            }
            if (a[aIndex].charAt(0) < b[bIndex].charAt(0)) {
                if (i != 0) {
                    if (a[aIndex] != c[i-1]) {
                        c[i] = a[aIndex]; 
                    } else {
                        iDelta = 1;
                    }
                } else {
                    c[i] = a[aIndex];
                }
                aIndex++;
            } else {
                if (i != 0) {
                    if (b[bIndex] != c[i-1]) {
                        c[i] = b[bIndex];
                        iDelta = 0;
                    } else {
                        iDelta = 1;
                    }
                } else {
                    c[i] = b[bIndex];
                }
                bIndex++;
            }
            i = i - iDelta;
        }
        return c; 
    }
    public static boolean dividesSelf(int n) {
        String nString = Integer.toString(n);
        for (int i = 0; i < nString.length(); i++) {
            int tempVal = Character.getNumericValue(nString.charAt(i));
            if (tempVal == 0) {
                return false;
            } else if (n % tempVal != 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean canBalance(int[] nums) {
        if (nums.length == 1) {
            return false;
        }
        int position = nums.length/2;
        int frontTotal = 0;
        for (int i = 0; i < position; i++) {
            frontTotal = frontTotal + nums[i];
        }
        int backTotal = 0;
        for (int i = position; i < nums.length; i++) {
            backTotal = backTotal + nums[i];
        }
        //last num in frontTotal is position - 1
        int[] positions = new int[nums.length];
        int iterator = 0;
        positions[iterator] = position;
        iterator++;
        while (true) {
            if (frontTotal == backTotal) {
                break;
            } else if (frontTotal > backTotal) {
                frontTotal = frontTotal - nums[position-1];
                backTotal = backTotal + nums[position-1];
                position = position - 1;
            } else {
                frontTotal = frontTotal + nums[position];
                backTotal = backTotal - nums[position];
                position = position + 1;
            }
            positions[iterator] = position;
            iterator++;
            if (iterator > 2) {
                if (positions[iterator-1] == positions[iterator-3]) {
                    return false;
                }
            }
            if (position < 0 || position == nums.length) {
                return false;
            }
        }
        return true;
    }
    public static int sumDigits(String str) {
        int sum = 0;
        int digit;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                String s = Character.toString(str.charAt(i));
                digit = Integer.parseInt(s);
                sum = sum + digit;
            }
        }
        return sum;
    }
    public static int maxSpan(int[] nums) {
        if (nums.length == 0){
          return 0;
        }
        int maxCount = 1;
        int total;
        int commit;
        for (int i = 0; i < nums.length; i++) {
            total = 1;
            commit = 1;
            for (int ii = i + 1; ii < nums.length; ii++) {
                if (nums[ii] != nums[i]) {
                    commit++;
                } else {
                    total = total + commit;
                    commit = 1;
                }
            }
            if (total > maxCount) {
                maxCount = total;
            }
        }
        return maxCount;
    }
        
    
    public static int countTriple(String phrase) {
        int total = 0;
        for (int i = 0; i < phrase.length()-2; i++) {
            int count = 0;
            char current = phrase.charAt(i);
            for (int ii = 0; ii < 3; ii++) {
                    if (current == phrase.charAt(i + ii)) {
                        count++;
                        if (count == 3) {
                            total++;
                        }
                        continue;
                    } else {
                        break;
                    }
                }
            }
        return total;
        }
    }
    

