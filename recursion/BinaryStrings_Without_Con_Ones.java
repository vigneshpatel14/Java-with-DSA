package recursion;

public class BinaryStrings_Without_Con_Ones {

    static void generate(int k , char[] ch ,int len)
    {
        if(len == k)
        {
            String ss = new String(ch);
            System.out.println(ss + " ");

            return;
        }


        if(ch[len -1] == '1')
        {
            ch[len] = '0';
            generate(k , ch , len + 1);
        }

        if(ch[len - 1] == '0')
        {
            ch[len] = '1';
            generate(k , ch , len + 1);

            ch[len] = '0';
            generate(k , ch , len + 1);
        }
    }



    public static void main(String[] args) {

        int k = 3;


        if(k <= 0)
        {
            return;
        }

        char[] ch = new char[k];

        ch[0] = '0';
        generate(k , ch , 1 );


        ch[0] = '1';
        generate(k , ch , 1 );
    }



}
