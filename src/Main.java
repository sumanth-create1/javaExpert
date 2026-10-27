class Example
{
   void print(Integer a)
   {
       System.out.println("print(Integer) is called");
   }

   void print(long a)
   {
       System.out.println("print(long) is called");
   }
}

public class Main {
    public static void main(String[] args) {

        Example ex = new Example();

        ex.print(10);// here int is widened to long so and one more important point is java priortizies widening over boxing
                        // so that's why int is promoted to long instead of being boxed to Integer




    }
}