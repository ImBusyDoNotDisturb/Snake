import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameFrame extends JFrame{

    private static final long serialVersionUID = 1L;

	static final int cols = 8;
	static final int rows = 8;

	static final int originX = 23;
	static final int originY = 37;
	static final int cellSide = 60;

	private int i;

    public GameFrame(){
        this.setTitle("Snake Game"); // title of the game on the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of appliaction
        this.setResizable(false); // prevent frame from resizing
        this.setSize(450, 450); // sets x-axis and y-axis of the frame
        this.setLocationRelativeTo(null);
        ImageIcon i = new ImageIcon("Snake Game/src/images here/logo.png"); // create an image icon
        this.setIconImage(i.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(11, 148, 54)); // change color of the background


        setVisible(true);
    }

}
