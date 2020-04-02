package peoplecertproject;

import java.util.Scanner;

public class PeopleCertProject {

    public static void main(String[] args) {

        //rwtaei posous 8eleis na valeis
        System.out.println("Enter the number of students you want: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        Student[] students = new Student[numOfStudents];
        //ftiaxnoume enan ari8mo mathitwn
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enrollNewCourse();
            System.out.println(students.toString());
            System.out.println(students[n].toString());
        }
        //oi ekpedeutikoi
        TrainersPerCourse tr1 = new TrainersPerCourse();
        System.out.println(tr1.toStringT());
        TrainersPerCourse tr2 = new TrainersPerCourse();
        System.out.println(tr2.toStringT());
    }

}
