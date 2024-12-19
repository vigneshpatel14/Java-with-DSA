package Trees;

public class Implementation {
    public static class Node{
        int val;
        Node left;
        Node right; //At first these are null
        public Node(int val)
        {
            this.val = val;
        }
    }


    public static void display(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.val+" -> ");
        if(root.left != null) System.out.print(root.left.val + "  ");
        if(root.right != null) System.out.print(root.right.val);
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        a.left = c;
        Node e = new Node(7);
        b.right = e;
        display(root);
    }
}
