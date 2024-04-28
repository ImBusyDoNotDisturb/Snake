import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JFrame {
    // JPanel = a GUI component taht functions as a container to hold other
    // components

    Panel() {

        JPanel p = new JPanel();

        p.setBackground(null);
        p.setBounds(0, 0, 250, 250);
        p.setLayout(new BorderLayout());
        add(p);

    }

}
