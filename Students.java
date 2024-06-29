import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Students extends Student{

    private static List<Student> studentsList = new ArrayList<>();

    public Students(String firstName, String lastName, String email, String address, String phone, Date birthDate) {
        super(firstName, lastName, email, address, phone, birthDate);
    }

    public static void addStudent(Student student){
        studentsList.add(student);
    }
    public static void promoteAllStudents(){
        for (Student student : studentsList){
            student.promoteToNextSemester();
        }
    }
    public static void displayInfoAboutAllStudents(){
        for (Student student : studentsList){
            System.out.println("Student: "+student.getFirstName()+" "+student.getLastName()+" "+student.getIndexNumber()+" "+student.getStatus()+" "+student.getSemester());
        }
    }
}
