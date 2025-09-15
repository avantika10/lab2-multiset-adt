public class Tree {
   private static final class Node {
       int key;
       int value;
       private Node left;
       private Node right;

       public Node(int key, int value) {
           this.key = key;
           this.value = value;
       }
   }

   private Node root;
   private int size;
}
