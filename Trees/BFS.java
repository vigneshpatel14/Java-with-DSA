package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val)
        {
            this.val = val;
        }
    }
    public static void bfs(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);

        while(q.size()>0)
        {
            Node temp = q.peek();
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            System.out.print(temp.val + " ");
            q.remove(); //Ah temp ante top element remove aypotadi
        }
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.left = e;
        bfs(root);
    }
}
