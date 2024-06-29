import java.util.Date;
import java.util.HashMap;

public class Student {
    private static int studentCounter = 0; //counting students to assign indexNumber
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;
    private Date birthDate;
    private HashMap<Integer, String> grades;
    private String indexNumber;
    private int semester;
    private String status; // kandydat (sem <= 1), student (sem > 1 && sem < 7), absolwent (sem > 7)


    //constructor
    public Student(String firstName, String lastName, String email, String address, String phone, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.birthDate = birthDate;
        this.grades = getGrades();
        this.indexNumber = assignIndexNumber();
        this.semester = //?
        this.status = //?

    }

    //getters and setters

    public static int getStudentCounter() {
        return studentCounter;
    }

    private static void setStudentCounter(int studentCounter) {
        Student.studentCounter = studentCounter;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    private void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public HashMap<Integer, String> getGrades() {
       return grades;
      }

    private void setGrades(HashMap<Integer, String> grades) {
        this.grades = grades;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    private void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getSemester() {
        return semester;
    }

    private void setSemester(int semester) {
        this.semester = semester;
    }

    public String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
    }

    //methods
    private String assignIndexNumber(){
        studentCounter++;
        return "s"+studentCounter;
    }

    public void enrollStudent(StudyProgramme semester) {
        this.semester = 1;
    }

    public void addGrade(int grade, String subject){
        grades.put(grade, subject);
    }

    public void promoteToNextSemester(){
        //check eligibility and promote
        if(semester <= 1){
            this.status = "kandydat";
        }
        if(semester > 1 && semester < 7){
            this.status = "student";
        }
        if(semester > 7){
            this.status = "absolwent";
        }
        //if ITN's exceed allowed number -> return Illegal
    }



}
