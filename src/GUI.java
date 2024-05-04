
import javax.swing.*;


public class GUI extends JFrame{
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JButton button1;
    private JButton button2;

    public GUI() {
        panel1 = new JPanel(null);
        add(panel1);
        setTitle("University Application System");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("Admin Login");
        button1.setBounds(325, 300, 150, 25);

        button1.addActionListener(e -> {
            System.out.println("Button clicked");
        });

        panel1.add(button1);
    }

    public static void main(String[] args) {
        GUI example = new GUI();
        example.setVisible(true);
    }
}

