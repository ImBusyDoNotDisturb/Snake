import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.random.*;
import javax.swing.JPanel;

public class Panel extends JPanel implements ActionListener {
    // JPanel = a GUI component that functions as a container to hold other
    // components

    private static final long serialVersionUID = 1L;

	static final int cols = 8;
	static final int rows = 8;

	static final int originX = 23;
	static final int originY = 37;
	static final int cellSide = 60;

	private int i;

    Panel() {

    }

    public void Start(){

    }

    public void paintComponent(Graphics g) {
            super.paintComponent(g);
       
            for (int i = 0; i < rows + 1; i++) {
               g.drawLine(originX, originY + i * cellSide, originX + cols * cellSide, originY + i * cellSide);
            }
             for (int i = 0; i < cols + 1; i++); {
           g.drawLine(originX + i * cellSide, originY, originX + i * cellSide, originY + rows * cellSide);
             }
       
           
    }

    public void draw(Graphics g){

    }

    public void move(){

    }

    public void checkFood(){

    }

    public void checkCollision(){

    }

    public void gameOver(Graphics g){

    }



    @Override
    public void actionPerformed(ActionEvent e){

    }

    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){

        }
    }



}
      /*p.setBackground(null);
        p.setBounds(0, 0, 250, 250);
        p.setLayout(new BorderLayout());
        add(p);*/