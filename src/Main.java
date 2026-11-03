class SuperClass
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3)
    {
        return n1 + n2+ n3;
    }
}

class SubClass1 extends SuperClass
{
    public int sub(int n1, int n2)
    {
        return n1 - n2;
    }

    public int multi(int n1, int n2)
    {
        return n1 * n2;
    }
}

class SubClass2 extends SubClass1
{
    public int div(int n1, int n2)
    {
        return n1/n2;
    }
}

public class Main {
    public static void main(String[] args) {

        SubClass2 obj = new SubClass2();

        int r1 = obj.add(1,2,3);
        int r2 = obj.add(12, 20);
        int r3 = obj.multi(12, 30);

        System.out.println(r1 + " : " + r2 + " : " + r3);
    }
}