import java.time.LocalDate;
import java.util.ArrayList;

public class IndustrialEng extends Applicants{
    private String DEPARTMENT = "Industrial Engineering";
    static public ArrayList<Applicants> applicantsIndust = new ArrayList<>();

    public IndustrialEng(String Sname, int IDnumber, String email, String filePath, LocalDate BDay, int SPhone) {
        super(Sname, IDnumber, email, filePath, BDay, SPhone);
        applicantsIndust.add(this);

    }





    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public void setDEPARTMENT(String DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT;
    }

    @Override
    public String toString() {
        return "IndustrialEng{" + "DEPARTMENT=" + DEPARTMENT + '}';
    }


}
