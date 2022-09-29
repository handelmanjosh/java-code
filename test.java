public class test{
    public static void main ( String [] args ) {
        int[] testList  = new int[1000000];
        testList[0] = 0;
        testList[9999] = 999999;
        long time1 = System.nanoTime();
        System.out.println(testList[0]);
        long time2 = System.nanoTime();
        System.out.println(time2 - time1);
        time1 = System.nanoTime();
        System.out.println(testList[999999]);
        time2 = System.nanoTime();
        System.out.println(time2 - time1);

    }
}
