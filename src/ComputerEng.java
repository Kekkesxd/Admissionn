import java.time.LocalDate;
import java.util.ArrayList;

public class ComputerEng extends Applicants{
    private String DEPARTMENT = "Computer Engineering";
    static public ArrayList<Applicants> applicantsComp = new ArrayList<>();

    public ComputerEng(String Sname, int IDnumber, String email, String filePath, LocalDate BDay, int SPhone) {
        super(Sname, IDnumber, email, filePath, BDay, SPhone);
        applicantsComp.add(this);

    }





    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public void setDEPARTMENT(String DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT;
    }

    @Override
    public String toString() {
        return "ComputerEng{" + "DEPARTMENT=" + DEPARTMENT + '}';
    }


}
