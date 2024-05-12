import java.time.LocalDate;

abstract public class Applicants {
    private String SName;
    private int IDnumber;
    private LocalDate BDay;
    private int SPhone;
    private String email;
    private String Sfile;
    private String DEPARTMENT;

    public Applicants(String Sname, int IDnumber,String email, String filePath, LocalDate BDay, int SPhone) {
        this.SName = Sname;
        this.IDnumber = IDnumber;
        this.email = email;
        this.BDay = BDay;
        this.SPhone = SPhone;
        this.Sfile = filePath;
    }

    public LocalDate getBDay() {
        return BDay;
    }

    public void setBDay(LocalDate BDay) {
        this.BDay = BDay;
    }

    public int getSPhone() {
        return SPhone;
    }

    public void setSPhone(int SPhone) {
        this.SPhone = SPhone;
    }

    public String getSName() {
        return SName;
    }

    public int getIDnumber() {
        return IDnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public void setIDnumber(int IDnumber) {
        this.IDnumber = IDnumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSfile() {
        return Sfile;
    }

   abstract public String getDEPARTMENT();
}