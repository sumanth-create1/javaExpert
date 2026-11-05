class A{
    public A()
    {
        System.out.println("in A");
    }

    public A(int num)
    {
        System.out.println("in int A");
    }
}

class B extends A{
    public B()
    {
        System.out.println("in B");
    }

    public B(int num)
    {
        super(10);
        System.out.println("in int B");
    }
}

/*
Here it is calling default constructor

so how to call a parameterized construtor...

this is how we call a parameterised constructor using  super key word by passing parameters...
 */


public class Main {
    public static void main(String[] args) {

        B obj = new B(10);

    }
}