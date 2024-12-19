package OOPS;


abstract class Vechile{
    public String Brand,model,engine;
    public int gears,speed;
}
class car extends Vechile{

    public car(String bbb)
    {
        this.Brand = bbb;
        this.model = "model1";
        this.engine = "wqea";
    }

    public void stop()
    {
        System.out.println("Vechile is stopping");
        this.speed = 0;
        this.gears = 0;
    }

    public void start()
    {
        System.out.println("Vechile is starting");
    }

    public int increase_gears(int x)
    {
        this.gears += x;
        return  this.gears;
    }

    public int decrease_gears(int x)
    {
        this.gears -= x;
        return  this.gears;
    }

    public int acclerate(int k)
    {
        this.speed += k;

        return  this.speed;
    }

    public int decclerate(int k)
    {
        this.speed -= k;

        return  this.speed;
    }

}
public class emodelete {
    public static void main(String[] args) {
        car swift = new car("Swift");
        System.out.println(swift.gears);
        swift.start();
        System.out.println(swift.increase_gears(1));
        System.out.println(swift.acclerate(20));

        swift.stop();
        System.out.println(swift.gears);
        System.out.println(swift.speed);
    }
}
