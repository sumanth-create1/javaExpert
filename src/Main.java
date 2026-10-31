class Parent
{
    static{
        System.out.println("Parent class");
    }
}

class Child extends Parent{
    static{
        System.out.println("child class");
    }
}
public class Main {
    public static void main(String[] args) {

        new Child();


    }
}