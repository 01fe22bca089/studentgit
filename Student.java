import java.time.LocalDate;
import java.time.Period;

public class Student extends student_course_info
{  
public static void main(String[] args)
{
        String stud_name = "Sahishnu";

LocalDate pdt = LocalDate.of(2004,02,13);
LocalDate tdt = LocalDate.now();
Period diff = Period.between(pdt, tdt);
        System.out.println("Name:" +stud_name);
System.out.println("Date of Birth : "+pdt);
System.out.println("Age : "+diff.getYears());
System.out.println("Course and marks of semester 4:");
student_course_info sc = new student_course_info();
sc.stud_info();

}
}
class student_course_info {

    public void stud_info(){

        String[] courses = {"Devops", "C#", "Machine Learning"};
   
        int[] marks = {85, 80, 90};

       
        for (int i = 0; i < courses.length; i++) {
           
               
            System.out.println(courses[i] + ": " + marks[i]);
        }
    }
}