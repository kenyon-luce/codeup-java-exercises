package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student (String name){
        this.name = name;
        this.grades = new ArrayList<Integer>(); //every time a new name is passed through it will generate a new empty array that we will be adding grades to
    }

    //initialize grades property as empty array

    // returns the student's name
    public String getName(){
//        System.out.print(this.name);
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for(double grade : grades){
            total += grade; //add numbers to total while iterating through the array
        }

        double average = total/grades.size();
//        System.out.printf("Current Average: %.2f\n", average);
        return average;
    }
}
