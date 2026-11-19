class Iphone
{
    // WireLess charging
    void charge()
    {
        System.out.println("Charging Iphone wirelessly");
    }
    // Fast Charging
    void charge(int watts)
    {
        System.out.println("charging Iphone with " + watts + "W fast Charger");
    }
    // normal Charging
    void charge(int volts, int amps)
    {
        System.out.println("Charging iPhone with " + volts + " V " + amps + " A power adapter.");
    }
}

public class Main {
    public static void main(String[] args) {

        Iphone obj = new Iphone();

        obj.charge();
        obj.charge(10);
        obj.charge(10,20);
    }
}