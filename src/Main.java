
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("50001", "Satya Suamnth", 2017);
        Student student2 = new Student("50002", "John wick", 2018);
        Student student3 = new Student("50003", "Bruce wayne", 2019);

//        student1.getInfo();

        student1.setName("Robert Pattinson");

        student1.getInfo();

        student2.getInfo();
        student3.getInfo();




    }
}