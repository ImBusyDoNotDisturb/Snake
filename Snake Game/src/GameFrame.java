import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameFrame extends JFrame{

    public GameFrame(){

        this.add(new Panel());
        this.setTitle("Snake Game"); // title of the game on the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of appliaction
        this.setResizable(false); // prevent frame from resizing
        this.pack();
        this.setSize(450, 450); // sets x-axis and y-axis of the frame
        this.setLocationRelativeTo(null);
        ImageIcon i = new ImageIcon("Snake Game/src/images here/logo.png"); // create an image icon
        this.setIconImage(i.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(11, 148, 54)); // change color of the background
        
        setVisible(true);

    }

}
