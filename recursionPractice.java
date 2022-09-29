
public class recursionPractice {
    public static void main(String[] args) {
        System.out.println(count8(88188));

    }
    public static int count8(int n) {
        return count8Counter(n, false);
    }
    public static int count8Counter(int n, boolean seen) {
        int iter = 1;
        if (seen == true) {
            iter++;
        }
        if (n%10 == n) {
            if (n == 8) {
                return iter;
            } else {
                return 0;
            }
        } else if (n%10 == 8) {
            return iter + count8Counter(n/10, true);
        } else {
            return 0 + count8Counter(n/10, false);
        }
    }
    public static int count7(int n) {
        if (n%10 == n) {
            if (n == 7) {
                return 1;
            } else {
                return 0;
            }
        } else if (n%10 == 7) {
            return 1 + count7(n/10);
        } else {
            return 0 + count7(n/10);
        }
    }
    public static String pairStar(String str) {
        StringBuilder sb = new StringBuilder();
        return starrer(str, sb, 0).toString();
    }
    public static StringBuilder starrer(String str, StringBuilder sb, int index) {
        if (str.length() == 0) {
            return sb;
        } else if (index == 0) {
            return starrer(str, sb.append(str.charAt(index)), index+1);
        } else if (index == str.length()) {
            return sb;
        } else if (str.charAt(index) == str.charAt(index - 1)) {
            return starrer(str, sb.append('*').append(str.charAt(index)), index + 1);
        } else {
            return starrer(str, sb.append(str.charAt(index)), index + 1);
        }
    }
    public static String changeXY(String s) {
        StringBuilder sb = new StringBuilder();
        return changer(s, sb, 0).toString();
    }
    public static StringBuilder changer(String s, StringBuilder sb, int index) {
        if (index == s.length()) {
            return sb;
        } else if (s.charAt(index) == 'x') {
            return changer(s, sb.append('y'), index + 1);
        } else {
            return changer(s, sb.append(s.charAt(index)), index + 1);
        }
    }
    public static int bunnyEars(int bunnies) {
        if (bunnies == 1) {
            return 2;
        } else if (bunnies == 0) {
            return 0;
        } else {
            bunnies--;
            return 2 + bunnyEars(bunnies);
        }
    }
    public static int powerN(int base, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return base;
        } else {
            return base * powerN(base, n-1);
        }
    }
}
