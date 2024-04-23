import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame extends JFrame {

    Frame() {

        this.setTitle("Snake Game"); // title of the game on the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of appliaction
        this.setResizable(false); // prevent frame from resizing
        this.setSize(450, 450); // sets x-axis and y-axis of the frame
        this.setVisible(true); // makes the frame visible
        //this.setLayout(null);
        //this.add(l);
        //this.pack();

        ImageIcon i = new ImageIcon("src/images here/logo.png"); // create an image icon
        this.setIconImage(i.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(6, 137, 2)); // change color of the background
    }

}
