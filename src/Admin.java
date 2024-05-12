import javax.swing.*;
import java.util.List;

public class Admin extends JFrame {
    private String AUser;
    private String APass;

public Admin() {
    this.AUser = "admin";
    this.APass = "admin";
}

public boolean validate(String AUser, String APass) {
    if (AUser.equals(this.AUser) && APass.equals(this.APass)) {
        return true;
    } else {
        return false;
    }
}

    // getters and setters
    public String getAUser() {
        return AUser;
    }

    public void setAUser(String AUser) {
        this.AUser = AUser;
    }
    public void setAPass(String APass) {
        this.APass = APass;
    }

  public String getAPass() {
    return APass;
}

    //Creat Code to view all applications
 public void viewApplicationsByDepartment(University university, String department) {

    }
}

