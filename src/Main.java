class Example
{
    void display(int a, long b) {
        System.out.println("print(int ,long) is called");
    }

    void display(long a, int b)
    {
        System.out.println("print(long , int) called");
    }

}

public class Main {
    public static void main(String[] args) {

        /*
        this is ambiguity and compile time erros
         */

        Example ex = new Example();

        ex.display(10,2000);
        ex.display(100000, 20);// compile time error : reference to display is ambiguious...


    }
}