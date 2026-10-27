class Example
{
    void diplay(int... numbers)
    {
        System.out.println("print (int...) called with " + numbers.length + "arguments");
    }
}

public class Main {
    public static void main(String[] args) {

        /*
        Varargs: if there is no exact match or promotable match java uses a Varargs method (Variable length augmented list)
         */
        Example ex = new Example();

        ex.diplay(0,1,2,3,4,5,6);

    }
}