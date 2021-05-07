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
        System.out.println(this.name + "  " + this.grades);
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
        System.out.printf("%s's grade average is: %.2f\n", this.getName(), average);

        return average;
    }

//    public static void main(String[] args){
//        Student kenyon = new Student("Kenyon");
//        kenyon.addGrade(100);
//        kenyon.addGrade(85);
//        kenyon.addGrade(95);
//        kenyon.addGrade(90);
//        kenyon.getGradeAverage();
//
//        System.out.println();
//
//        Student max = new Student("Maximillion");
//        max.addGrade(100);
//        max.addGrade(100);
//        max.addGrade(100);
//        max.addGrade(100);
//        max.getGradeAverage();
//    }
}
