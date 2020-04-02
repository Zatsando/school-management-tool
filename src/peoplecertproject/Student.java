package peoplecertproject;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String courses;

// oi konstraktores gia na valoume to onoma/epwnymo/mathima
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the first name of the student: ");
        this.firstName = sc.nextLine();
        System.out.println("Insert the last name of the student: ");
        this.lastName = sc.nextLine();
        System.out.println("Insert the student's course: ");
        System.out.println("1 - JAVA\n2 - JavaScript\n3 - C#\n4 - MySQL");
        this.courses = sc.nextLine();
        System.out.println(firstName + " " + lastName + " " + courses);

    }
// edw einai gia tin eggrafi se neo mathima

    public void enrollNewCourse() {
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner sc = new Scanner(System.in);
            String courses = sc.nextLine();
            //i loupa gia na fortwnoume mathimata
            if (courses.equals("Q")) { 
                courses = courses + "\n" + courses;
            } else {
                System.out.println("The End!");
                break;
            }
        } while (1 != 0);

        System.out.println("Enrolled in new course: " + courses);
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName
                + "\nCourses Enrolled: ";
    }
}
