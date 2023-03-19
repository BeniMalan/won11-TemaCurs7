package Student;

public class Main {
    public static void main (String[] args){
        student st1=new student("Ion",9);
        student st2=new student("Vlad",10);
        System.out.println("Numele :"+st1.getName()+"; Nota "+st1.getGrade());
        System.out.println("Numele :"+st2.getName()+"; Nota "+st2.getGrade());

        double averageGrade = student.getAverageStudentGrade(student.sumOfGrades, student.numberOfStudents);
        System.out.println("Media notelor studentilor: " + averageGrade);
    }
}
