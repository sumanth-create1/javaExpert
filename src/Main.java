class Laptop
{
    String model;
    String brand;


}
public class Main {
    public static void main(String[] args) {

    Laptop obj = new Laptop();
    obj.model = "Dell inspiron";
    obj.brand = "Dell";

    Laptop obj1 = new Laptop();
    obj1.brand = "Dell inspiron";
    obj1.model = "Dell";

    boolean result = obj.equals(obj1);

    System.out.println(result);

    /*
    here equals method is coming from object class which is super class for every class in java

    what it actually do behind the scenes...???

    By default it compares references(memory addresses) of the objects...
     */



    }
}