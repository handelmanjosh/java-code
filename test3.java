
public class test3 {
    public static void main(String[] args) {
        int[] testArray = {10, 1, 3, 8, 9, 2, 1};
    }
    public class Node {
        public int value;
        public Node firstChild;
        public Node lastChild;
        public Node nextChild;
        public int treeSum(Node parent, Node current) {
            //to initialize program call with the same node twice 
            if (parent.lastChild == null) {
                //if no children return value of node, end recursion
                return current.value;
            } else if (current == parent.lastChild) {
                //if node is last child, add its value and add value of its nodes
                return current.value + treeSum(current, current);
            } else {
                //if current is not last child, add its value and the value of its nodes and the value of the other
                //nodes at same depth
                return parent.value + treeSum(current, current) + treeSum(parent, current.nextChild);
            }
            
        }
        public void addLeaf(int x) {
            Node z = new Node();
            z.value = x;
            this.lastChild.nextChild = z;
            this.lastChild = z;
        }
    }
}
