
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class test extends JFrame {

    protected JFrame testFrame;
    protected JPanel mainPanel;
    protected JButton cencelButton, okButton;

    protected void addComponents() {
        testFrame = new JFrame("การคำนวนเกรด");
        mainPanel = new JPanel();
        cencelButton = new JButton("Cencle");
        okButton = new JButton("Ok");

        mainPanel.add(cencelButton);
        mainPanel.add(okButton);
        testFrame.add(mainPanel);
    }

    protected void setFrameFeature() {
        testFrame.pack();
        testFrame.setLocation(null);
        testFrame.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void createAndshowGUI() {
        gg main = new gg();
        main.addComponents();
        main.addComponents();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndshowGUI();
            }

        });
    }
}
