
import java.util.ArrayList;
public class test6 {
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList();
        int a = 100;
        int b = (a == 10)? 20 : 30;
        System.out.println(b);
    }
    static class Test {
        final int x = 9;
        public String toString() {
            return "hi";
        }
    }
    
}
