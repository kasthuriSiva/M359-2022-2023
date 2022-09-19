package U2_Objects;

public class StudentDriver {
    public static void main(String[] args) {
        System.out.println("Hello");

        Student s1 = new Student( "Kasthuri",  11,  3.78);
        Student s2 = new Student("Varsha");

        s1.printInfo();
        s2.printInfo();

        s1.setGradeLevel(12);
        s1.printInfo();

        System.out.println(s1.getGradeLevel());
    }
}
