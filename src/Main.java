class Human
{
    private int age;
    private String name;

    public Human()
    {
        System.out.println("this is a default constructor");
        age = 30;
        name = "Sumanth";
    }

    public Human(int age, String name)
    {
        System.out.println("this is a parameterized constructor");
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {

        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());

        Human obj1 = new Human(12, "satya sumanth");
        System.out.println(obj1.getName() + " : " + obj1.getAge());



    }
}