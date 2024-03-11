package org.example;
import java.util.ArrayList;
public class Student {
    String studentName;
    ArrayList<Integer>grades;

    //Class constructor
    public Student (String name) {
        this.studentName = name;
        this.grades = new ArrayList<>();
    }

    //method to add a grade
    public void addGrade(int grade){
        grades.add(grade);
    }

    //add method to calculate the average grades
    public double calculateAverage(){
        double total = 0;
        for (int grade : grades){
            total += grade;
        }
        return total / grades.size();
    }
}
