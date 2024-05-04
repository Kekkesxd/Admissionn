import java.util.List;

public class Departments {
    public String DName;
    int Dcost;
    private List<Student> applications;

    public Departments(String UName, List<Student> applications) {
        this.DName = UName;
        this.applications = applications;
    }

}
