import java.util.List;
//Import gui necessary classes
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class AdminPanel extends JFrame{
    private JPanel CardPanel,MainPanel,ComputerEngPanel, ElectricalEngPanel, IndustrialEngPanel;
    private JButton ComputerEngButton, ElectricalEngButton, IndustrialEngButton, BackButton;
    private JButton ComputerEngApplyButton, ElectricalEngApplyButton, IndustrialEngApplyButton;
    private JButton BackToMainFromCompEng, BackToMainFromElecEng, BackToMainFromIndEng;
    private JTextField ComputerEngName, ComputerEngID, ComputerEngEmail, ComputerEngPhone, ComputerEngFile;
    private JTextField ElectricalEngName, ElectricalEngID, ElectricalEngEmail, ElectricalEngPhone, ElectricalEngFile;
    private JTextField IndustrialEngName, IndustrialEngID, IndustrialEngEmail, IndustrialEngPhone, IndustrialEngFile;
    private JLabel ComputerEngNameLabel, ComputerEngIDLabel, ComputerEngEmailLabel, ComputerEngBDayLabel, ComputerEngPhoneLabel, ComputerEngFileLabel;
    private JLabel ElectricalEngNameLabel, ElectricalEngIDLabel, ElectricalEngEmailLabel, ElectricalEngBDayLabel, ElectricalEngPhoneLabel, ElectricalEngFileLabel;
    private JLabel IndustrialEngNameLabel, IndustrialEngIDLabel, IndustrialEngEmailLabel, IndustrialEngBDayLabel, IndustrialEngPhoneLabel, IndustrialEngFileLabel;
    private JLabel ComputerEngTitle, ElectricalEngTitle, IndustrialEngTitle;
    private CardLayout cardLayout = new CardLayout();
    private Image CompEngImage, ElecEngImage, IndEngImage;
    private ImageIcon CompEngIcon, ElecEngIcon, IndEngIcon;
    private JTextArea CompEngTextArea, ElecEngTextArea, IndEngTextArea;
    private JComboBox<Integer> ComputerEngBDay, ComputerEngBMonth, ComputerEngBYear;
    private JComboBox<Integer> ElectricalEngBDay, ElectricalEngBMonth, ElectricalEngBYear;
    private JComboBox<Integer> IndustrialEngBDay, IndustrialEngBMonth, IndustrialEngBYear;

    public AdminPanel(){

        // Create an array of integers for the years
        Integer[] years = new Integer[100];
        for (int i = 0; i < 100; i++) {
            years[i] = 1922 + i;
        }

        // Create an array of integers for the days
        Integer[] days = new Integer[31];
        for (int i = 0; i < 31; i++) {
            days[i] = i + 1;
        }

        // Create an array of integers for the months
        Integer[] months = new Integer[12];
        for (int i = 0; i < 12; i++) {
            months[i] = i + 1;
        }


        //Create the Frame
        setTitle("University Application System");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        //Create the CardPanel which holds the MainPanel and the Department Panels
        CardPanel = new JPanel();
        CardPanel.setLayout(cardLayout);
        CardPanel.setBounds(0, 0, 1000, 700);
        add(CardPanel);

        //Create the MainPanel
        MainPanel = new JPanel();
        MainPanel.setLayout(null);
        MainPanel.setBackground(Color.WHITE);
        CardPanel.add(MainPanel, "MainPanel");
        //make background black
        // MainPanel.setBackground(Color.BLACK);

        //Create the Computer Engineering Panel
        ComputerEngPanel = new JPanel();
        ComputerEngPanel.setLayout(null);
        ComputerEngPanel.setBackground(Color.WHITE);
        CardPanel.add(ComputerEngPanel, "ComputerEngPanel");

        //Create the Electrical Engineering Panel
        ElectricalEngPanel = new JPanel();
        ElectricalEngPanel.setLayout(null);
        ElectricalEngPanel.setBackground(Color.WHITE);
        CardPanel.add(ElectricalEngPanel, "ElectricalEngPanel");

        //Create the Industrial Engineering Panel
        IndustrialEngPanel = new JPanel();
        IndustrialEngPanel.setLayout(null);
        IndustrialEngPanel.setBackground(Color.WHITE);
        CardPanel.add(IndustrialEngPanel, "IndustrialEngPanel");

        //Create the MainPanel Components

        ImageIcon computerEngIcon = new ImageIcon("path/to/computerEngIcon.png");
        ComputerEngButton = new JButton(computerEngIcon);
        ComputerEngButton.setBounds(45, 30, 300, 200);
        ComputerEngButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(CardPanel, "ComputerEngPanel");
            }
        });
        MainPanel.add(ComputerEngButton);

        ImageIcon electricalEngIcon = new ImageIcon("path/to/electricalEngIcon.png");
        ElectricalEngButton = new JButton(electricalEngIcon);
        ElectricalEngButton.setBounds(350, 30, 300, 200);
        ElectricalEngButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(CardPanel, "ElectricalEngPanel");
            }
        });
        MainPanel.add(ElectricalEngButton);

        ImageIcon industrialEngIcon = new ImageIcon(new ImageIcon("C:\\Users\\islam-bilisim\\Desktop\\Industry.jpg").getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT));
        IndustrialEngButton = new JButton(industrialEngIcon);
        IndustrialEngButton.setBounds(655, 30, 300, 200);
        IndustrialEngButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(CardPanel, "IndustrialEngPanel");
            }
        });
        MainPanel.add(IndustrialEngButton);

        //Create the text areas for the departments for the description of the departments under the images of the departments and
        //make it not editable
        //the text area should not go out of bounds of the area so when it's close to the edge it should go to the next line
        CompEngTextArea = new JTextArea("Computer Engineering Department is a department that focuses on the design, development, and testing of computer hardware and software. Computer engineering is a broad field that includes many subfields such as software engineering, computer networks, information security, and artificial intelligence.");
        CompEngTextArea.setBounds(45, 250, 300, 400);
        CompEngTextArea.setLineWrap(true);
        CompEngTextArea.setWrapStyleWord(true);
        CompEngTextArea.setEditable(false);
        MainPanel.add(CompEngTextArea);

        ElecEngTextArea = new JTextArea("Electrical Engineering Department is a department that focuses on the design, development, and testing of electrical systems. Electrical engineering is a broad field that includes many subfields such as power systems, electronics, telecommunications, and control systems.");
        ElecEngTextArea.setBounds(350, 250, 300, 400);
        ElecEngTextArea.setLineWrap(true);
        ElecEngTextArea.setWrapStyleWord(true);
        ElecEngTextArea.setEditable(false);
        MainPanel.add(ElecEngTextArea);

        IndEngTextArea = new JTextArea("Industrial Engineering Department is a department that focuses on the design, development, and testing of industrial systems. Industrial engineering is a broad field that includes many subfields such as manufacturing systems, supply chain management, quality control, and operations research.");
        IndEngTextArea.setBounds(655, 250, 300, 400);
        IndEngTextArea.setLineWrap(true);
        IndEngTextArea.setWrapStyleWord(true);
        IndEngTextArea.setEditable(false);
        MainPanel.add(IndEngTextArea);

        Font descriptionFont = new Font("Arial", Font.PLAIN, 16); // Change "Arial" to your preferred font and 16 to your preferred size

        CompEngTextArea.setFont(descriptionFont);
        ElecEngTextArea.setFont(descriptionFont);
        IndEngTextArea.setFont(descriptionFont);

        //Create the Computer Engineering Panel Components
        ComputerEngTitle = new JLabel("Computer Engineering Department");
        ComputerEngTitle.setBounds(50, 50, 300, 50);
        ComputerEngPanel.add(ComputerEngTitle);

        ComputerEngNameLabel = new JLabel("Name:");
        ComputerEngNameLabel.setBounds(50, 100, 100, 25);
        ComputerEngPanel.add(ComputerEngNameLabel);

        ComputerEngName = new JTextField();
        ComputerEngName.setBounds(150, 100, 200, 25);
        ComputerEngPanel.add(ComputerEngName);

        ComputerEngIDLabel = new JLabel("ID:");
        ComputerEngIDLabel.setBounds(50, 150, 100, 25);
        ComputerEngPanel.add(ComputerEngIDLabel);

        ComputerEngID = new JTextField();
        ComputerEngID.setBounds(150, 150, 200, 25);
        ComputerEngPanel.add(ComputerEngID);

        ComputerEngEmailLabel = new JLabel("Email:");
        ComputerEngEmailLabel.setBounds(50, 200, 100, 25);
        ComputerEngPanel.add(ComputerEngEmailLabel);

        ComputerEngEmail = new JTextField();
        ComputerEngEmail.setBounds(150, 200, 200, 25);
        ComputerEngPanel.add(ComputerEngEmail);

        ComputerEngBDayLabel = new JLabel("BirthDay:");
        ComputerEngBDayLabel.setBounds(50, 250, 100, 25);
        ComputerEngPanel.add(ComputerEngBDayLabel);

        // Create a JComboBox for the birthday
        JComboBox<Integer> ComputerEngBDay = new JComboBox<>(days);
        ComputerEngBDay.setBounds(150, 250, 60, 25);
        ComputerEngPanel.add(ComputerEngBDay);

        JComboBox<Integer> ComputerEngBMonth = new JComboBox<>(months);
        ComputerEngBMonth.setBounds(220, 250, 60, 25);
        ComputerEngPanel.add(ComputerEngBMonth);

        JComboBox<Integer> ComputerEngBYear = new JComboBox<>(years);
        ComputerEngBYear.setBounds(290, 250, 60, 25);
        ComputerEngPanel.add(ComputerEngBYear);

        ComputerEngPhoneLabel = new JLabel("Phone:");
        ComputerEngPhoneLabel.setBounds(50, 300, 100, 25);
        ComputerEngPanel.add(ComputerEngPhoneLabel);

        ComputerEngPhone = new JTextField();
        ComputerEngPhone.setBounds(150, 300, 200, 25);
        ComputerEngPanel.add(ComputerEngPhone);

        ComputerEngFileLabel = new JLabel("File:");
        ComputerEngFileLabel.setBounds(50, 350, 100, 25);
        ComputerEngPanel.add(ComputerEngFileLabel);

        ComputerEngFile = new JTextField();
        ComputerEngFile.setBounds(150, 350, 200, 25);
        ComputerEngPanel.add(ComputerEngFile);

        ComputerEngApplyButton = new JButton("Apply");
        ComputerEngApplyButton.setBounds(50, 400, 300, 50);
        ComputerEngApplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Add the student to the Computer Engineering Department
            }
        });
        ComputerEngPanel.add(ComputerEngApplyButton);

        BackToMainFromCompEng = new JButton("Back");
        BackToMainFromCompEng.setBounds(50, 500, 300, 50);
        BackToMainFromCompEng.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(CardPanel, "MainPanel");
            }
        });
        ComputerEngPanel.add(BackToMainFromCompEng);

        //Create the Electrical Engineering Panel Components
        ElectricalEngTitle = new JLabel("Electrical Engineering Department");
        ElectricalEngTitle.setBounds(50, 50, 300, 50);
        ElectricalEngPanel.add(ElectricalEngTitle);

        ElectricalEngNameLabel = new JLabel("Name:");
        ElectricalEngNameLabel.setBounds(50, 100, 100, 25);
        ElectricalEngPanel.add(ElectricalEngNameLabel);

        ElectricalEngName = new JTextField();
        ElectricalEngName.setBounds(150, 100, 200, 25);
        ElectricalEngPanel.add(ElectricalEngName);

        ElectricalEngIDLabel = new JLabel("ID:");
        ElectricalEngIDLabel.setBounds(50, 150, 100, 25);
        ElectricalEngPanel.add(ElectricalEngIDLabel);

        ElectricalEngID = new JTextField();
        ElectricalEngID.setBounds(150, 150, 200, 25);
        ElectricalEngPanel.add(ElectricalEngID);

        ElectricalEngEmailLabel = new JLabel("Email:");
        ElectricalEngEmailLabel.setBounds(50, 200, 100, 25);
        ElectricalEngPanel.add(ElectricalEngEmailLabel);

        ElectricalEngEmail = new JTextField();
        ElectricalEngEmail.setBounds(150, 200, 200, 25);
        ElectricalEngPanel.add(ElectricalEngEmail);

        ElectricalEngBDayLabel = new JLabel("BirthDay:");
        ElectricalEngBDayLabel.setBounds(50, 250, 100, 25);
        ElectricalEngPanel.add(ElectricalEngBDayLabel);

        //List for birthday
        JComboBox<Integer> ElectricalEngBDay = new JComboBox<>(days);
        ElectricalEngBDay.setBounds(150, 250, 60, 25);
        ElectricalEngPanel.add(ElectricalEngBDay); // Corrected line

        JComboBox<Integer> ElectricalEngBMonth = new JComboBox<>(months);
        ElectricalEngBMonth.setBounds(220, 250, 60, 25);
        ElectricalEngPanel.add(ElectricalEngBMonth); // Corrected line

        JComboBox<Integer> ElectricalEngBYear = new JComboBox<>(years);
        ElectricalEngBYear.setBounds(290, 250, 60, 25);
        ElectricalEngPanel.add(ElectricalEngBYear);

        ElectricalEngPhoneLabel = new JLabel("Phone:");
        ElectricalEngPhoneLabel.setBounds(50, 300, 100, 25);
        ElectricalEngPanel.add(ElectricalEngPhoneLabel);

        ElectricalEngPhone = new JTextField();
        ElectricalEngPhone.setBounds(150, 300, 200, 25);
        ElectricalEngPanel.add(ElectricalEngPhone);

        ElectricalEngFileLabel = new JLabel("File:");
        ElectricalEngFileLabel.setBounds(50, 350, 100, 25);
        ElectricalEngPanel.add(ElectricalEngFileLabel);

        ElectricalEngFile = new JTextField();
        ElectricalEngFile.setBounds(150, 350, 200, 25);
        ElectricalEngPanel.add(ElectricalEngFile);

        ElectricalEngApplyButton = new JButton("Apply");
        ElectricalEngApplyButton.setBounds(50, 400, 300, 50);
        ElectricalEngApplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Add the student to the Electrical Engineering Department
            }
        });
        ElectricalEngPanel.add(ElectricalEngApplyButton);

        BackToMainFromElecEng = new JButton("Back");
        BackToMainFromElecEng.setBounds(50, 500, 300, 50);
        BackToMainFromElecEng.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(CardPanel, "MainPanel");
            }
        });
        ElectricalEngPanel.add(BackToMainFromElecEng);

        //Create the Industrial Engineering Panel Components
        IndustrialEngTitle = new JLabel("Industrial Engineering Department");
        IndustrialEngTitle.setBounds(50, 50, 300, 50);
        IndustrialEngPanel.add(IndustrialEngTitle);

        IndustrialEngNameLabel = new JLabel("Name:");
        IndustrialEngNameLabel.setBounds(50, 100, 100, 25);
        IndustrialEngPanel.add(IndustrialEngNameLabel);

        IndustrialEngName = new JTextField();
        IndustrialEngName.setBounds(150, 100, 200, 25);
        IndustrialEngPanel.add(IndustrialEngName);

        IndustrialEngIDLabel = new JLabel("ID:");
        IndustrialEngIDLabel.setBounds(50, 150, 100, 25);
        IndustrialEngPanel.add(IndustrialEngIDLabel);

        IndustrialEngID = new JTextField();
        IndustrialEngID.setBounds(150, 150, 200, 25);
        IndustrialEngPanel.add(IndustrialEngID);

        IndustrialEngEmailLabel = new JLabel("Email:");
        IndustrialEngEmailLabel.setBounds(50, 200, 100, 25);
        IndustrialEngPanel.add(IndustrialEngEmailLabel);

        IndustrialEngEmail = new JTextField();
        IndustrialEngEmail.setBounds(150, 200, 200, 25);
        IndustrialEngPanel.add(IndustrialEngEmail);

        IndustrialEngBDayLabel = new JLabel("BirthDay:");
        IndustrialEngBDayLabel.setBounds(50, 250, 100, 25);
        IndustrialEngPanel.add(IndustrialEngBDayLabel);

        //List for the years

        JComboBox<Integer> IndustrialEngBDay = new JComboBox<>(days);
        IndustrialEngBDay.setBounds(150, 250, 60, 25);
        IndustrialEngPanel.add(IndustrialEngBDay);

        JComboBox<Integer> IndustrialEngBMonth = new JComboBox<>(months);
        IndustrialEngBMonth.setBounds(220, 250, 60, 25);
        IndustrialEngPanel.add(IndustrialEngBMonth);

        JComboBox<Integer> IndustrialEngBYear = new JComboBox<>(years);
        IndustrialEngBYear.setBounds(290, 250, 60, 25);
        IndustrialEngPanel.add(IndustrialEngBYear);

        IndustrialEngPhoneLabel = new JLabel("Phone:");
        IndustrialEngPhoneLabel.setBounds(50, 300, 100, 25);
        IndustrialEngPanel.add(IndustrialEngPhoneLabel);

        IndustrialEngPhone = new JTextField();
        IndustrialEngPhone.setBounds(150, 300, 200, 25);
        IndustrialEngPanel.add(IndustrialEngPhone);

        IndustrialEngFileLabel = new JLabel("File:");
        IndustrialEngFileLabel.setBounds(50, 350, 100, 25);
        IndustrialEngPanel.add(IndustrialEngFileLabel);

        IndustrialEngFile = new JTextField();
        IndustrialEngFile.setBounds(150, 350, 200, 25);
        IndustrialEngPanel.add(IndustrialEngFile);

        IndustrialEngApplyButton = new JButton("Apply");
        IndustrialEngApplyButton.setBounds(50, 400, 300, 50);
        IndustrialEngApplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Add the student to the Industrial Engineering Department
            }
        });
        IndustrialEngPanel.add(IndustrialEngApplyButton);

        BackToMainFromIndEng = new JButton("Back");
        BackToMainFromIndEng.setBounds(50, 500, 300, 50);
        BackToMainFromIndEng.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(CardPanel, "MainPanel");
            }
        });
        IndustrialEngPanel.add(BackToMainFromIndEng);

        BackButton = new JButton("Back");
        BackButton.setBounds(900, 5, 70, 20);
        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the GUI class and make it visible
                GUI gui = new GUI();
                gui.setVisible(true);

                // Dispose the current Departments frame
                dispose();
            }
        });
        MainPanel.add(BackButton);

        //Show the MainPanel
        cardLayout.show(CardPanel, "MainPanel");





    }

    public static void main(String[] args) {
        Departments departments = new Departments();
        departments.setVisible(true);
    }

}
