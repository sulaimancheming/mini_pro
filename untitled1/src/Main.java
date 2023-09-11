import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;// เป็นคำสั่งที่ใช้ในการดักฟังเหตุการณ์เมื่อมีการคลิกที่ Component
import java.awt.event.ActionListener;
//เป็น Interface ในการ ดักฟังเหตุการณ์ เหตุการณ์ใดๆบน component
//โดยมี abstract method คือ
//actionPerformed คือจะทำงานเมื่อ มีการกระทำใดๆเกิดกับ component คือทุกเหตุการณ์
public class Main {
    static datastudent x = new datastudent();
    protected static JFrame frame = new JFrame("Student grade calculation");
    protected static JPanel panel1 = new JPanel();
    protected static JPanel panelMixcenter = new JPanel();
    protected static JPanel panelCenter = new JPanel();
    protected static JPanel panelCenter1 = new JPanel();
    protected static JPanel panelCenter2 = new JPanel();
    protected static JPanel panelCenter3 = new JPanel();
    protected static JPanel panelCenter4 = new JPanel();
    protected static JPanel buttompanel = new JPanel();
    protected static JLabel idname, firstName, surname, classyear, faculty;// ของข้อความต่างๆ
    protected static JTextField iid, iname, isur, iclassyear, ifaculty;// ช่องกรอก
    protected static JButton subButton = new JButton("Ok");
    protected static JLabel title = new JLabel("Wellcome to grade calculation");

    public static void main(String[] args) {
        idname = new JLabel("รหัสนักศึกษา");
        firstName = new JLabel("ชื่อนักศึกษา");
        surname = new JLabel("นามสกุล");
        faculty = new JLabel("คณะ");
        classyear = new JLabel("ชั้นปี่ที่");

        iid = new JTextField(20);
        iname = new JTextField(20);
        isur = new JTextField(20);
        ifaculty = new JTextField(20);
        iclassyear = new JTextField(5);

        Border border = BorderFactory.createLineBorder(Color.black, 4);
        title.setBorder(border);// กรอบข้อความ

        panel1.setBackground(Color.green);
        panel1.add(title);
        title.setFont(new Font("TH SarsbunPSK", Font.BOLD, 24));// ส่วนของพาเนลเเรกบนสุด

        panelCenter.setBackground(Color.white);// พาเนลตรงกลาง
        panelCenter.add(idname);
        panelCenter.add(iid);
        panelCenter1.setBackground(Color.white);
        panelCenter1.add(firstName);
        panelCenter1.add(iname);
        panelCenter2.setBackground(Color.white);
        panelCenter2.add(surname);
        panelCenter2.add(isur);
        panelCenter3.setBackground(Color.white);
        panelCenter3.add(faculty);
        panelCenter3.add(ifaculty);
        panelCenter4.setBackground(Color.white);
        panelCenter4.add(classyear);
        panelCenter4.add(iclassyear);
        panelCenter4.add(subButton);


        subButton.addActionListener(new ActionListener() { // เพิ่มฟังชั่นเมื่อเวลากดปุ่มok โดยรับค่าจากพารามิดเตอร์ และ
                                                           // ไปแสดงในเฟรม2
                                                           // method data
            @Override
            public void actionPerformed(ActionEvent e) {

                x.datas(iid.getText(), iname.getText(), isur.getText(), ifaculty.getText(), iclassyear.getText());
                second a = new second();
                a.face2();// ไปยังหน้าsecond ฟังชั้นface2
            }
        });

        panelMixcenter.setLayout(new GridLayout(0, 1));
        panelMixcenter.add(panelCenter);
        panelMixcenter.add(panelCenter1);
        panelMixcenter.add(panelCenter2);// รวมพาเนลตรงเอาไว้ตรงกลาง
        panelMixcenter.add(panelCenter3);
        panelMixcenter.add(panelCenter4);

        buttompanel.setBackground(Color.red);

        frame.setSize(600, 400);
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panelMixcenter, BorderLayout.CENTER);
        frame.add(buttompanel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();

        frame.setVisible(true);
    }

    public static class datastudent {
        protected String iname, isur, ifaculty, iid, iclassyear;

        public void datas(String inputid, String inputname, String inputsur, String inputfaculty, String inputclassy) {
            iid = inputid;
            iname = inputname;
            isur = inputsur;
            ifaculty = inputfaculty;
            iclassyear = inputclassy;

        }

    }
}