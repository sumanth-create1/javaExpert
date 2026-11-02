class Calc
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public int sub(int n1, int n2)
    {
        return n1 - n2;
    }
}

class AdvCalc extends Calc
{
    public int multi(int n1, int n2)
    {
        return n1 * n2;
    }
    public int div(int n1, int n2)
    {
        return n1/n2;
    }
}

public class Main {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int r1 = obj.add(12,24);
        int r2 = obj.sub(24,12);

        AdvCalc obj1 = new AdvCalc();
        int r3 = obj1.multi(12, 2);
        int r4 = obj1.div(12, 6);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);

    }
}