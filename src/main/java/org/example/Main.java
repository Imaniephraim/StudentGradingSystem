package org.example;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //create an instance of the scanner
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList();

        char userChoice;

        do {
            //Ask the teacher for the student name
            System.out.print("Enter Student name: ");
            String name = scanner.nextLine();
            //create a new student object to save the student name
            Student student = new Student(name);

            //get the number of subjects for the student
            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();
            scanner.nextLine();

            for (int i = 1; 1 <= numSubjects; i++) {
                System.out.print("Enter grade for subject: " + i + ": ");
                int grade = scanner.nextInt();
                student.addGrade(grade);

            }

            students.add(student);

            //ask the user if they want to add another student
            System.out.println("Add another Student? (y/n): ");
            userChoice = scanner.next().charAt(0);
            scanner.nextLine();

        } while(userChoice == 'y');

        //Display student grade summary
        System.out.println("Student Grade Summary: ");
        for (Student student : students){
            System.out.println("Student: " + student.studentName + "Average Score: " + student.calculateAverage());
        }

        //close scanner object
        scanner.close();

    }
}