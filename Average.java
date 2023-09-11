import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.util.Scanner;

public class Average {
    protected JPanel buttonPanel;
    protected JLabel firstName;
    protected JTextField nameInput;
    protected JLabel surname;
    protected JTextField surInput;
    protected JLabel classyear;
    protected JTextField classyearInput;
    protected JRadioButton maleButton;
    protected JRadioButton femaleButton;
    protected ButtonGroup buttongGroup;

    protected void addComponent() {

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double sum = 0; // sum เก็บผลบวกชุดข้อมูล
        int k = 0; // k ไว้นับจำนวนรอบ
        while (true) {
            if (k >= 4)
                break;
            System.out.print("จำนวนที่ " + (k + 1) + " = ");
            sum += kb.nextDouble(); // อ่านข้อมูล แล้วเพิ่มเข้าผลรวม
            k++;
        }
        System.out.println("ค่าเฉลี่ย = " + (sum / 4));
        kb.close();
    }

    protected Average() {

        System.out.print(" Input total score : ");
        int Score = 0;

        String Grade;
        if (Score >= 80) {
            Grade = "A";
        } else if (Score >= 75) {
            Grade = "B+";
        } else if (Score >= 70) {
            Grade = "B";
        } else if (Score >= 65) {
            Grade = "C+";
        } else if (Score >= 60) {
            Grade = "C";
        } else if (Score >= 55) {
            Grade = "D+";
        } else if (Score >= 50) {
            Grade = "D";
        } else {
            Grade = "F";
        }

        System.out.println(" The Grade is " + Grade);

    }

}