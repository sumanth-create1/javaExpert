class Mobile{
    String brand;
    String color;

    static String name;

    public void show()
    {
        System.out.println(brand + " : " + color + " : " + name);
    }
}

/*
this is a static key word once it is static then it is available to all its instances

it belongs to class not to objects or instances we create...
 */


public class Main {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();

        obj1.brand = "Apple";
        obj1.color = "Red";

        obj2.brand = "samsung";
        obj2.color = "Gold";


        Mobile.name = "phone";

        obj1.show();
        obj2.show();






    }
}