package peoplecertproject;

import java.util.Scanner;

public class TrainersPerCourse {

    private String firstNameT;
    private String lastNameT;
    private String coursesT;

    public TrainersPerCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the first name of the trainer: ");
        this.firstNameT = sc.nextLine();
        System.out.println("Insert the last name of the trainer: ");
        this.lastNameT = sc.nextLine();
        System.out.println("Insert the trainer's course: ");
        System.out.println("1 - JAVA\n2 - JavaScript\n3 - C#\n4 - MySQL");
        this.coursesT = sc.nextLine();
        System.out.println(firstNameT + " " + lastNameT + " " + coursesT);
    }

    public String toStringT() {
        return "Name: " + firstNameT + " " + lastNameT
                + "\nReady for a lesson: ";

    }
}
