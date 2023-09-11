import java.awt.*;
import javax.swing.*;

public class Calculategrade {
    protected static JFrame f;
    protected static JPanel field;
    protected static JPanel huge;
    protected static JLabel idname, firstName, surname, classyear;
    protected static JTextField iid, iname, isur;

    public static void gui() {
        f = new JFrame("Student grade calculation program");
        idname = new JLabel("StudentID");
        iid = new JTextField();
        firstName = new JLabel("Studentname");
        iname = new JTextField();
        surname = new JLabel("surname");
        isur = new JTextField();

        f.setSize(600, 500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        gui();

    }
}
