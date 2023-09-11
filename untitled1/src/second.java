import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class second extends Main {
    protected static JTextArea east = new JTextArea();
    protected static JScrollPane scrolleast = new JScrollPane(east);
    protected static JPanel buttomcenter = new JPanel();// พาเนลกลาง
    protected static JPanel buttomcesouth = new JPanel();
    protected static JPanel panel1 = new JPanel();
    protected static JPanel buttomwest1 = new JPanel();
    protected static JPanel buttomwest2 = new JPanel();
    protected static JPanel buttomwest3 = new JPanel();
    protected static JPanel buttomwest4 = new JPanel();
    protected static JPanel mixbuttomwest = new JPanel();
    protected static JFrame frame2 = new JFrame("แสดงผลข้อมูล");
    protected static JLabel title = new JLabel("Registered course details");
    protected static JLabel idSubject, namesub, unitsub, grade, aver;
    protected static JTextField iids, inamesub, iunitsub, igrade;
    protected static JButton addButton = new JButton("Add");
    protected static JButton calculateButton = new JButton("Calculate");
    // ออบเจค อเวอเรจ
    protected static average avg = new average();
    protected static course c = new course();

    public void face2() {
        idSubject = new JLabel("รหัสวิชา");
        namesub = new JLabel("ชื่อวิชา");
        unitsub = new JLabel("หน่วยกิต");
        grade = new JLabel("เกรด");

        iids = new JTextField(20);
        inamesub = new JTextField(20);
        iunitsub = new JTextField(5);
        igrade = new JTextField(5);
        // กำหนดค่าให้เลื่อนได้ในแนวตั้ง
        scrolleast.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        // พาเนลกลางขวา

        buttomcenter.add(scrolleast);
//        buttomcenter.add(calculateButton);
        buttomcesouth.add(calculateButton);
        // พาเนลบนสุด
        panel1.setBackground(Color.red);
        panel1.add(title);
        title.setFont(new Font("Arial", Font.BOLD, 24));

        // พาเนลตรงกลางซาย
        buttomwest1.setBackground(Color.white);
        buttomwest1.add(idSubject);
        buttomwest1.add(iids);
        buttomwest2.setBackground(Color.white);
        buttomwest2.add(namesub);
        buttomwest2.add(inamesub);
        buttomwest3.setBackground(Color.white);
        buttomwest3.add(unitsub);
        buttomwest3.add(iunitsub);
        buttomwest4.setBackground(Color.white);
        buttomwest4.add(grade);
        buttomwest4.add(igrade);
        buttomwest4.add(addButton);

        // ค่าที่เอามาจาก datastudent
        east.append(x.iid);
        east.append("  " + x.iname);
        east.append("  " + x.isur+"\n");
        east.append("คณะ " + x.ifaculty);
        east.append("  ชั้นปีที่ " + x.iclassyear + "\n\n");// แสดงค่าที่ผู้ใช้ป้อนเข้ามาในเฟรมเเรก ในหน้าteatAreaของเฟรม2

        addButton.addActionListener(new ActionListener() { // เพิ่มฟังชั่นเมื่อเวลากดปุ่มadd โดยรับค่าจากพารามิดเตอร์
                                                           // method data
            @Override
            public void actionPerformed(ActionEvent e) {

                c.datasub(iids.getText(), inamesub.getText(), (Integer.parseInt(iunitsub.getText())),
                        (Double.parseDouble(igrade.getText())));
                east.append(" รหัสวิชา:  " + c.iids + "\n");
                east.append(" ชื่อวิชา:  " + c.inamesub + "\n");
                east.append(" หน่วยกิต:  " + c.iunitsub + "\n");
                east.append(" เกรด:  " + Double.toString(c.igrade) + "\n\n");

                avg.setSum(c.igrade);
                // ล้างข้อมูลในเทกฟิลหลังจากaddเสร็จ
                iids.setText("");
                inamesub.setText("");
                iunitsub.setText("");
                igrade.setText("");
            }
        });
        calculateButton.addActionListener(new ActionListener() { // เพิ่มฟังชั่นเมื่อเวลากดปุ่มadd
                                                                 // โดยรับค่าจากพารามิดเตอร์ method data
            @Override
            public void actionPerformed(ActionEvent e) {

                east.append(" \n\n -----------------------------\n\n");
                east.append(" เกรดเฉลี่ย:  " + avg.getAvg() + "\n\n");// ได้ค่ามาจากรีเทิรน์
                east.setFont(new Font("TH SarsbunPSK", Font.BOLD, 20));

            }

        });

        mixbuttomwest.setLayout(new GridLayout(0, 1));
        mixbuttomwest.add(buttomwest1);
        mixbuttomwest.add(buttomwest2);
        mixbuttomwest.add(buttomwest3);
        mixbuttomwest.add(buttomwest4);

        frame2.setSize(600, 400);

        buttomcenter.setLayout(new GridLayout(0, 1));
        frame2.add(panel1, BorderLayout.NORTH);
        frame2.add(mixbuttomwest, BorderLayout.WEST);
        frame2.add(buttomcenter, BorderLayout.CENTER);
        frame2.add(buttomcesouth, BorderLayout.SOUTH);

        // ตัวปิด
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // ตัวเซ็ตสำหรับการทำงานของเฟรม
        frame2.setVisible(true);
    }

    public static class course {
        protected String iids, inamesub;
        protected int iunitsub;
        protected double igrade;

        public void datasub(String idsubject, String namesubject, int unitsubject, double grade) {
            iids = idsubject;
            inamesub = namesubject;
            iunitsub = unitsubject;
            igrade = grade;
        }
    }

    public static class average {
        protected double sum = 0;// เก็บผลรวมเกรด
        protected double count = 0;

        protected double avg;

        // เอาไว้เก็บค่าของเกรดและจำนวนครั้ง
        public void setSum(double sum) {
            this.sum += sum;
            this.count += 1;// จำนวนครั้งที่ป้อนข้อมูล
        }

        // ค่าเฉลีย
        public double getAvg() {//
            this.avg = this.sum / this.count;
            return avg;
        }
    }
}