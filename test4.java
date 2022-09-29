
public class test4 {
    public static void main(String[] args) {

    }
    public class MyList {
        private Node head;
        private class Node {
            int value;
            Node next;
        }
        public int count(int x) {
            int count = 0;
            Node current = head;
            while (current.next != null) {
                if (current.value == x) {
                    count++;
                }
                current = current.next;
            }
            return count;
        }
    }
}
