package U6_Arrays.CourseEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingEx {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File ("studentScheduleData.txt");
        Scanner fileIn = new Scanner(myFile);

        //The very first line has the number rof students
        int numStudents = fileIn.nextInt(); //6
        fileIn.nextLine();                  //Dummy read for nextLine after #

        //Create an array of student objects to store our class
        Student[] myStudents = new Student[numStudents];

        for(int j=0; j < numStudents; j++) {
            //First read in the student's name
            String stName = fileIn.nextLine();  //Molly Jones
            Course[] sched = new Course[8];

            for (int i = 0; i < 8; i++) {
                String teacherName = fileIn.nextLine();
                String className = fileIn.nextLine();
                String letterGrade = fileIn.nextLine();
                int periodNum = fileIn.nextInt();
                if (fileIn.hasNextLine()) {
                    fileIn.nextLine();      //Dummy read to clear newLine after #
                }

                Course myCourse = new Course(teacherName, className, letterGrade, periodNum);
                sched[i] = myCourse;
            }
            //Now that we know this student's name and courses, we can create the student object
            Student curStudent = new Student(stName, sched);
            myStudents[j] = curStudent;
        }
        //Now go through and display the whole class
        for(Student s: myStudents){
            System.out.println(s);
        }
    }
}
