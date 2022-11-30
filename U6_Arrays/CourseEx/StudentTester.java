package U6_Arrays.CourseEx;

public class StudentTester {
    public static void main(String[] args) {
        Course per1 = new Course("Zimolzak", "AP Physics C", "A",1);
        Course per2 = new Course("Fudala", "AP LIT", "A",2);
        Course per3 = new Course("Kent", "AP Econ", "A",3);
        Course per4 = new Course("Edmunds", "Art", "A",4);
        Course per5 = new Course("Snyder", "AP French", "A",5);
        Course per6 = new Course ("Hansen", "Gym", "A+", 6);
        Course per7 = new Course ("Moon", "APCSA", "A+", 7);
        Course per8 = new Course ("Moon", "Calc BC", "A+", 8);

        Course[] schedule = {per1, per2, per3, per4,per5, per6, per7, per8};

        Student st1 = new Student ("Kasthuri", schedule);
        System.out.println(st1);

        per5.setCurrentGrade("F");
        Student st2 = new Student ("Isac", schedule);
        System.out.println(st2);

        System.out.println(st1);
    }
}
