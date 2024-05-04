public class Student {
    private String SName;
    private int IDnumber;
    private int BDay;
    private int SPhone;
    private String email;
    private String Sfile;

    public Student(String Sname, int IDnumber,String email, String filePath, int BDay, int SPhone) {
        this.SName = Sname;
        this.IDnumber = IDnumber;
        this.email = email;
        this.Sfile = Sfile;
        this.BDay = BDay;
        this.SPhone = SPhone;
    }
   public int getBDay() {
        return BDay;
    }
    public void setBDay(int BDay) {
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

    public void setSfile(String sfile) {
        this.Sfile = sfile;
    }
}

