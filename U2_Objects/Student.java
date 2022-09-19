package U2_Objects;

public class Student {
    //Instance variables
    private String name;
    private double gpa;
    private int gradeLevel;

    //Constructor
    public Student (String stuName, int stuGradeLevel, double stuGpa) {
        name = stuName;
        gradeLevel = stuGradeLevel;
        gpa = stuGpa;



    }
    public Student(String stuName) {
        name = stuName;
        gradeLevel = 9;
        gpa = -1;
    }

    //method
    public void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Grade: " +gradeLevel);
        System.out.println("GPA: " +gpa);
        System.out.println();

}
    public void setGradeLevel(int newGradeLevel){
        gradeLevel = newGradeLevel;
    }
    public int getGradeLevel(){
        return gradeLevel;
    }


}
