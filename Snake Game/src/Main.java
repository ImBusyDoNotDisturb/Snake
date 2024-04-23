import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) throws Exception {

        // Frame f = new Frame();
        // Frontpage p = new Frontpage();

        // JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("Snake/Snake Game/src/images here/logo.png");
        // Border b = BorderFactory.createLineBorder(Color.green,3);

        JLabel l = new JLabel();
        l.setText("Snake"); // set text of label
        l.setIcon(image);
        l.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, right of image
        l.setVerticalTextPosition(JLabel.TOP); // set text top, center, botton of image
        l.setForeground(new Color(0, 0, 0)); // set font color of text
        l.setFont(new Font("Ariel", Font.BOLD, 50)); // set font of text
        l.setIconTextGap(-10); // set gap of text to image
        l.setBackground(new Color(6, 137, 2));
        l.setOpaque(true);
        // l.setBorder(border); // sets border of label(not image and text)
        l.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon and text within the label
        l.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon and text within the label
        l.setBounds(0, 0, 450, 450);// sets x,y position within frame as well as dimensions

        JFrame f = new JFrame(); // creates a frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of appliaction
        f.setSize(450, 450); // sets x-axis and y-axis of the frame
        f.setLayout(null);
        f.setResizable(false);
        f.setVisible(true); // makes the frame visible
        f.add(l);
    
        // f.pack();

    }
}
