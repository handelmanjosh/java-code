
import java.util.Scanner;

public class pyramid {
    public static void main(String args[]) {
        int x = 0;
        while (x < 5) {
            String y = Integer.toString(x);
            print(y);
            x++;
        }
        for (int xx = 0; xx < 5; xx++){
            print(Integer.toString(xx));
        }
        balls person = new balls();
        print(person.amount);
    }
    static void print(String x){
        System.out.println(x);
    }
    static class balls {
        String amount = "2";
    }
}
