import java.util.Objects;

class Laptop implements Cloneable
{
    String model;
    String brand;


    public boolean equals(Object o) {
       if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(model, laptop.model) && Objects.equals(brand, laptop.brand);
    }


    public int hashCode() {
        return Objects.hash(model, brand);
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

    Laptop obj = new Laptop();
    obj.model = "Dell";
    obj.brand = "Dell inspiron";

    Laptop obj1 = (Laptop) obj.clone();
    System.out.println(obj1.model + " : " + obj1.brand);

    boolean res = obj.equals(obj1);

    System.out.println(res);



    /*
    here equals method is coming from object class which is super class for every class in java

    what it actually do behind the scenes...???

    By default it compares references(memory addresses) of the objects...


    clone method will create and return  the shallow copy of the object ....
     */



    }
}