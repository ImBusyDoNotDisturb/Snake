import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Setting extends JDialog {
    private JCheckBox soundOption;

    public Setting(Frame parent) {
        super(parent, "Settings", true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(450, 450);
        setLocationRelativeTo(parent);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.add(new JLabel("Enable Sound"));
        soundOption = new JCheckBox();
        panel.add(soundOption);
        add(panel, BorderLayout.NORTH);

        JButton okButton = new JButton("OK");
        okButton.addActionListener(e -> dispose());
        add(okButton, BorderLayout.SOUTH);
    }

    public boolean isSoundEnabled() {
        return soundOption.isSelected();
    }
}
