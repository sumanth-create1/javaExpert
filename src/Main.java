class Human
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }


}



public class Main {
    public static void main(String[] args) {

        Human obj = new Human();

        obj.setAge(29);
        obj.setName("Satya Sumanth");


        System.out.println(obj.getAge()+ " : " + obj.getName());

        System.out.println("this is encapsulation in java.");


    }
}