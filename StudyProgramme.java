import java.util.Date;

public class StudyProgramme extends Student {
    public String programmeName;
    public String programmeDescription;
    public int semester;
    public int requiredITN;

    //constructor
    public StudyProgramme(String programmeName, String programmeDescription, int semester, int requiredITN) {
        this.programmeName = programmeName;
        this.programmeDescription = programmeDescription;
        this.semester = semester;
        this.requiredITN = requiredITN;
    }

    //getters and setters
    public String getProgrammeName() {
        return programmeName;
    }

    private void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    public String getProgrammeDescription() {
        return programmeDescription;
    }

    private void setProgrammeDescription(String programmeDescription) {
        this.programmeDescription = programmeDescription;
    }

    public int getSemester() {
        return semester;
    }

    private void setSemester(int semester) {
        this.semester = semester;
    }

    public int getRequiredITN() {
        return requiredITN;
    }

    private void setRequiredITN(int requiredITN) {
        this.requiredITN = requiredITN;
    }
}

    //methods

