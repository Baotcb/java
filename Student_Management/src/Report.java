public class Report {
    private int id;
    private String courseName;
    private int totalCourse;

    public Report(int id, String courseName) {
        this.id = id;
        this.courseName = courseName;
        this.totalCourse=1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getTotalCourse() {
        return totalCourse;
    }

    public void setTotalCourse(int totalCourse) {
        this.totalCourse = totalCourse;
    }
}
