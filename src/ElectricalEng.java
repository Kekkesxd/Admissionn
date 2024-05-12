import java.time.LocalDate;
import java.util.ArrayList;

public class ElectricalEng extends Applicants{
    private String DEPARTMENT = "Electrical Engineering";
    static public ArrayList<Applicants> applicantsElec = new ArrayList<>();

    public ElectricalEng(String Sname, int IDnumber, String email, String filePath, LocalDate BDay, int SPhone) {
        super(Sname, IDnumber, email, filePath, BDay, SPhone);
        applicantsElec.add(this);

    }

    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public void setDEPARTMENT(String DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT;
    }

    @Override
    public String toString() {
        return "ElectricalEng{" + "DEPARTMENT=" + DEPARTMENT + '}';
    }


}
