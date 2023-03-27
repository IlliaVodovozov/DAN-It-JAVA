package homeWork.hw18;

public class Abstract {
    private String subjectName;
    private String studentName;
    private int numberOfPages;
    private int yearOfRelease;
    private String coverColor;
    private String institutionName;

    public String getSubjectName() {
        return subjectName;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    // Methods for setting values for each field of the class
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }
}

