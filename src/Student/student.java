package Student;

public class student {
     private String Name;
     private int Grade;
    public static int sumOfGrades=0;
    public static  int numberOfStudents=0;

    student(String Name,int Grade){
        this.Name=Name;
        this.Grade=Grade;
       sumOfGrades+=Grade;
        numberOfStudents++;
    }


    public String getName(){
return Name;
    }
    public int getGrade(){
return Grade;
    }
    public static double getAverageStudentGrade(int sumOfGrades,int numberOfStudents)
    {
        return (double) sumOfGrades/numberOfStudents;
    }

}
