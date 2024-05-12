import javax.swing.*;

public class GUI extends JFrame{
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private Admin admin;

    public GUI() {
        admin = new Admin();
        panel1 = new JPanel(null);
        add(panel1);
        setTitle("University Application System");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\islam-bilisim\\IdeaProjects\\Admission\\src\\IconCode.JFIF");
        int x = (800 - imageIcon.getIconWidth()) / 2;
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0, 0, 800, 300);
        panel1.add(label);

        button1 = new JButton("Admin Login");
        button1.setBounds(325, 350, 150, 25);
        button1.addActionListener(e -> {
            String username = JOptionPane.showInputDialog(this, "Enter admin username:");
            String password = JOptionPane.showInputDialog(this, "Enter admin password:");
            if (admin.validate(username, password)) {
                // If the credentials are valid, display the Admin panel
                AdminPanel adminPanel = new AdminPanel();
                adminPanel.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid admin credentials.");
            }
        });
        panel1.add(button1);

        button2 = new JButton("Student Application");
        button2.setBounds(325, 300, 150, 25);
        button2.addActionListener(e -> {
            Departments departments = new Departments();
            departments.setVisible(true);
            dispose();
        });
        panel1.add(button2);
    }

    public static void main(String[] args) {
        GUI example = new GUI();
        example.setVisible(true);
    }
}