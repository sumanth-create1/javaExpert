import style.*;

class A
{
    protected int average = 50;

    public void show()
    {
        System.out.println(average);
    }
}
public class Main {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();
    }
}