package Trees;

public class SizeMaxHeightSum {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val)
        {
            this.val = val;
        }
    }

    public static void preorder(Node root)
    {
        if(root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static  int size(Node root)
    {
        if(root == null) return 0;
        //Adhe last ayna kidha 1 + undi ga set
        return size(root.left) + size(root.right) + 1;
    }

    public static int sum(Node root)
    {
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public static int max(Node root)
    {
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max( max(root.left) , max(root.right)));
    }

    public static int height(Node root)
    {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0 ;

        return 1 + Math.max(height(root.left) , height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
//        Node a = new Node(2);
        Node b = new Node(3);
//        root.left = a;
        root.right = b;
//        Node c = new Node(4);
//        Node d = new Node(5);
//        a.left = c;
//        a.right = d;
        Node e = new Node(6);
        b.right = e;
        preorder(root);
        System.out.println("\n" + size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(height(root));
    }
}
