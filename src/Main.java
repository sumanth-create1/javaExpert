class Student
{
    final void show() {
        System.out.println("in Student");
    }

    void add(int a, int b){
        System.out.println(a+b);
    }
}

class Student2 extends Student
{
    void show()
    {
        System.out.println("In Student2");
    }

    void add(double a, double b)
    {
        System.out.println(a + b);
    }
}

public class Main {
    public static void main(String[] args) {

//        final int num = 10;
//        num = 20;
//        String name = "sumanth";
//
//        System.out.println(num);


    // final keyword with variable:
    //  Basically it prevent modifications means we cant reassign new values to them like a Constant.
    /*
    when we make a class final , it stops inheritance means we cannot extend that class

    when we make a method final it stops method overriding.....
     */

        Student2 obj = new Student2();
        obj.show();
        obj.add(10,2);

    }
}