class Human
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }


}



public class Main {
    public static void main(String[] args) {

        Human obj = new Human();

        obj.setAge(12);
        obj.setName("Satya Sumanth");


        System.out.println(obj.getAge()+ " : " + obj.getName());

        System.out.println("this is encapsulation in java.");


    }
}