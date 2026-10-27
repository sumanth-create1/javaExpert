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


public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        /* EXACT MATCH
        * where Arguments types  passed are matched with parameters we sayy exact match.
        * Java uses this method directly
        * */

        calc.print(10);
        calc.print(1.1);

        calc.print(10,20.1);
        calc.print(11.1,10);

    }
}