package Queues;

public class UsingArray {
    public static class  QueuesA{
        int f = -1 , r = -1 , size = 0;
        int[] arr = new int[100];

        public void add(int val)
        {
            if( r == arr.length -1)
            {
                System.out.println("Full ayindi bayya");
                return;
            }
            if(f == -1)
            {
                f = r = 0;
                arr[0] = val;
            }
            else {
                arr[++r] = val;
            }
            size++;
        }

        public int remove()
        {
            if(size == 0)
            {
                System.out.println("Stack is empty");
                return -1;
            }
            f++;
            size--;
            return arr[f - 1];
        }

        public int peek()
        {
            if(size == 0)
            {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[f];
        }

        public boolean isEmpty()
        {
            if(size == 0)
            {
                return true;
            }
            return  false;
        }

        public  void display()
        {
            if(size == 0)
            {
                System.out.println("Stack is empty");
            }
            else
            {
                for( int i = f;i<= r;i++)
                {
                    System.out.print((arr[i] + " "));
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        QueuesA q = new QueuesA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
