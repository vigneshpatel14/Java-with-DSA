package basics;

class Userdefinedexception extends Exception{ Userdefinedexception(String s){
    super(s);
    }
}
public class LI4 {
    public static void main(String[] args) {
        try {
            throw new Userdefinedexception("user defined exception was thrown and handeled");
        }
        catch (Userdefinedexception e)
        {
            e.printStackTrace();
        }
    }
}
