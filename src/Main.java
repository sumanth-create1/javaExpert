class Calculator
{
    void print(int a) {
        System.out.println("print(int) is called");
    }

    void print(double a)
    {
        System.out.println("print(double) is called");
    }

    void print(int a, int b)
    {
        System.out.println("print(int) called :" + (a+b));
    }

    void print(double a, double b)
    {
        System.out.println("print(double) is called : " + (a+b));
    }
}

class Example
{
    void display(long a)
    {
        System.out.println("print (long) is called");
    }

    void display(double a)
    {
        System.out.println("print(double) is called");
    }
}


public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Example ex = new Example();



        /* EXACT MATCH
        * where Arguments types  passed are matched with parameters we sayy exact match.
        * Java uses this method directly
        * */

//        calc.print(10);
//        calc.print(1.1);
//
//        calc.print(10,20.1);
//        calc.print(11.1,10);

        /*
        Type Promotion: When there is no exact match , java tries to promote the type to next wider type..
         */

        ex.display(10); // int is promoted to long and display(long) is called....
        ex.display(10.444444444444);// float is promoted to double hence display(double) is called.....



    }
}