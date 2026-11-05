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
        super(10);
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

now lets play with that lets call first a default constructor and then a parameterised constructor

our console should be
expected output:

in int A
in B

yup we have got our desired output
 */


public class Main {
    public static void main(String[] args) {

        B obj = new B();

    }
}