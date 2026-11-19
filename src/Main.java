class Iphone
{
    void cameraFeature()
    {
        System.out.println("Standard Iphone Camera");
    }
}

class Iphone17 extends Iphone
{
    @Override
    void cameraFeature()
    {
        System.out.println("Iphone 17: AI - enhanced photography");
    }
}

class Iphone18 extends Iphone
{
    @Override
    void cameraFeature()
    {
        System.out.println("Iphone 18: Periscope Zoom camera");
    }
}

public class Main {
    public static void main(String[] args) {

        Iphone myPhone;

        myPhone = new Iphone();
        myPhone.cameraFeature();

        myPhone = new Iphone17();
        myPhone.cameraFeature();

        myPhone = new Iphone18();
        myPhone.cameraFeature();



    }
}