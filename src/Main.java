class Lazyload
{
    static
    {
        System.out.println("Lazyload class is now initialized");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Main method starts");

        Lazyload obj;

        System.out.println("still no class loading");

        obj = new Lazyload();



    }
}