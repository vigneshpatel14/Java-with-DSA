package Stacks;

public class UsingArrays {
    public static class Stack
    {
        private int[] arr = new int[5];
        private int idx = 0;
        void push(int x)
        {
            if(isfull())
            {
                System.out.println("Stack is full");
                return;
            }
            arr[idx++] = x;
        }

        int peek()
        {
            if(idx == 0)
            {
                System.out.println("Stack is empty");
                return  -1;
            }

            return arr[idx -1];
        }

        int pop()
        {
            if(idx == 0)
            {
                System.out.println("Stack is empty");
                return  -1;
            }
            int top = arr[idx -1];
            arr[idx -1] = 0;
            idx --;
            return top;
        }

        void display()
        {
            for(int i = 0 ;i<=idx -1;i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int size()
        {
            return  idx;
        }
        boolean isEmpty()
        {
            if(idx == 0)
            {
                return true;
            }
            return  false;
        }
        boolean isfull()
        {
            if(idx == arr.length)
            {
                return  true;
            }
            return  false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display();
        st.pop();
        st.peek();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        System.out.println(st.isfull());
        System.out.println(st.isEmpty());
    }
}
