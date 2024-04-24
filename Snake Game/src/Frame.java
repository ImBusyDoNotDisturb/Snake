import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame {

    Frame() {

        JFrame f = new JFrame();

        this.setTitle("Snake Game"); // title of the game on the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of appliaction
        this.setResizable(false); // prevent frame from resizing
        this.setSize(450, 450); // sets x-axis and y-axis of the frame

        this.setLocationRelativeTo(null);
        // this.setLayout(null);
        // this.add(l);
        // this.pack();

        ImageIcon i = new ImageIcon("Snake Game/src/images here/logo.png"); // create an image icon
        this.setIconImage(i.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(11, 148, 54)); // change color of the background

        JLabel l = new JLabel();
        ImageIcon image = new ImageIcon("Snake Game/src/images here/logo.png");
        // Border b = BorderFactory.createLineBorder(Color.green,3);

        l.setText("Snake"); // set text of label
        l.setIcon(image);
        l.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, right of image
        l.setVerticalTextPosition(JLabel.TOP); // set text top, center, botton of image
        l.setForeground(new Color(0, 0, 0)); // set font color of text
        l.setFont(new Font("Ariel", Font.BOLD, 50)); // set font of text
        l.setIconTextGap(-10); // set gap of text to image
        l.setBackground(new Color(11, 148, 54));
        l.setOpaque(true);
        // l.setBorder(border); // sets border of label(not image and text)
        l.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon and text within the label
        l.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon and text within the label
        l.setBounds(0, 0, 450, 450);
        this.add(l);
        this.setVisible(true); // makes the frame visible

    }

}
