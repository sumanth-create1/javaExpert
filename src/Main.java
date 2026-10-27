class Computer
{
    public void playMusic()
    {
        System.out.println("Music is playing...");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10)
            return "Pen";

        return "Nothing";
    }
}

class Calculator
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2)
    {
        return n1 + n2;
    }
}



public class Main {
    public static void main(String[] args) {

//        Computer com = new Computer();
//
//        com.playMusic();
//        String res = com.getMeAPen(1);
//
//        System.out.println(res);

        Calculator cal = new Calculator();

        double r1 = cal.add(1.00, 2);

        System.out.println(r1);

    }
}