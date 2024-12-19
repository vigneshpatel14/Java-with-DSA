package Queues;

public class circularQueueArrays {

    public static class Cqueue{
        private int front = -1,rear = -1 , size = 0;

        private int[] arr = new int[8];

        public void add(int val) throws Exception
        {
            if(size == arr.length)
            {
                throw  new Exception("Queue is full");
            }

            else if(size == 0)
            {
                front = rear = 0;
                arr[0] = val;
            }
            else if( rear < arr.length -1) //Normal case
            {
                arr[++rear] = val;
            } else if ((rear == arr.length -1)) {

                rear = 0;
                arr[0] = val;
            }
            size++;
        }

        public  int remove() throws  Exception
        {
            if(size == 0)
            {
                throw  new Exception("Queue is Empty");
            } else{
                int val = arr[front];
                if(front == arr.length -1)
                {
                    front = 0;
                }
                else
                {
                    front++;
                }
                size--;
                return  val;
            }
        }

        public  int peek() throws  Exception{
            if(size == 0)
            {
                throw  new Exception("Queue is Empty");
            }
            else  return  arr[front];
        }

        public  boolean isEmpty()
        {
            if(size == 0)
            {
                return true;
            }
            return false;
        }

        public void display()
        {
            if(size == 0)
            {
                System.out.print("Empty stack ni print chesi em chestav bro");
            } else if (front <= rear) {

                for( int i = front ;i<=rear ;i++)
                {
                    System.out.print(arr[i] + " ");
                }
            }
            else {
                for ( int i = front;i<arr.length;i++)
                {
                    System.out.print(arr[i] + " ");
                }

                for (int i = 0 ;i<=rear;i++)
                {
                    System.out.print(arr[i] + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) throws  Exception {
        Cqueue q = new Cqueue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.display();
        q.remove();
        q.add(10);
        q.display();
        System.out.println(q.peek());
        //Orginal Queue

        for( int i =0 ;i<q.arr.length;i++)
        {
            System.out.print(q.arr[i]+" ");
        }
    }
}