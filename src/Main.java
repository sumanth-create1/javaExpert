import java.io.IOException;

class Example
{
    static int value;

    static
    {
        value = 100;

        System.out.println("in static block-1");
    }

    static
    {
        System.out.println("in static block 2");
    }
}


public class Main {
    public static void main(String[] args) throws  ClassNotFoundException {
        Class.forName("Example");

    }
}