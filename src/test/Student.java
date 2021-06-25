package test;

public class Student {

    int NumberStud,YearStudy;
    String StudName;
    int StudMath,StudEconom,StudIno;
    String Names = StudName;

}
class StudentTest{
    public static void main(String[] args) {
        Student oneStudent = new Student();
        Student twoStudent = new Student();
        Student threeStudent = new Student();

        oneStudent.NumberStud = 1000;
        oneStudent.StudName = "Nikita";
        oneStudent.StudMath = 3;
        oneStudent.StudEconom = 4;
        oneStudent.StudIno = 4;
        oneStudent.YearStudy = 2016;


        twoStudent.NumberStud = 1001;
        twoStudent.StudName = "Danya";
        twoStudent.StudMath = 4;
        twoStudent.StudEconom = 5;
        twoStudent.StudIno = 3;
        twoStudent.YearStudy = 2017;

        threeStudent.NumberStud = 1000;
        threeStudent.StudName = "Daniil";
        threeStudent.StudMath = 5;
        threeStudent.StudEconom = 5;
        threeStudent.StudIno = 2;
        threeStudent.YearStudy = 2018;
        System.out.println(oneStudent.StudName +  " " + "Год обучения: " + oneStudent.YearStudy + " " + (oneStudent.StudMath + oneStudent.StudEconom + oneStudent.StudIno) / 3);

    }
}