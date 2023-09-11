
import javax.swing.*;
import java.awt.*;

public class test1 {
    protected static JPanel hugePanel;
    protected static JPanel fieldPanel;
    protected static JPanel mainPanel;
    protected static JPanel buttonPanel;
    protected static JLabel idname;
    protected static JTextField inputid;
    protected static JLabel firstName;
    protected static JTextField nameInput;
    protected static JLabel surname;
    protected static JTextField surInput;
    protected static JLabel Male;
    protected static JLabel Female;
    protected static JRadioButton maleButton;
    protected static JRadioButton femaleButton;
    protected static ButtonGroup buttongGroup;
    protected static JLabel classyear;
    protected static JTextField classyearInput;

    public static void main(String[] args) {

        JFrame window = new JFrame();
        idname = new JLabel("StudentID");
        inputid = new JTextField();
        firstName = new JLabel("Studentname");
        nameInput = new JTextField();
        surname = new JLabel("surname");
        surInput = new JTextField();

        Male = new JLabel("Male");
        Female = new JLabel("Female");
        femaleButton = new JRadioButton();
        maleButton = new JRadioButton();

        fieldPanel = new JPanel();
        buttonPanel = new JPanel();
        hugePanel = new JPanel();

        window.setSize(500, 500);
        fieldPanel.add(idname);
        fieldPanel.add(firstName);
        fieldPanel.add(surname);
        fieldPanel.add(inputid);
        fieldPanel.add(nameInput);
        fieldPanel.add(surInput);

        buttonPanel.add(maleButton);
        buttonPanel.add(Male);
        buttonPanel.add(femaleButton);
        buttonPanel.add(Female);

        window.add(fieldPanel);
        window.add(hugePanel);

        hugePanel.setLayout(new BorderLayout());// เป็นจัดวางวัตถุ
        hugePanel.add(fieldPanel, BorderLayout.NORTH);
        hugePanel.add(mainPanel, BorderLayout.SOUTH);

        window.setVisible(true);
    }

}
