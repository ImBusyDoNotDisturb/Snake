import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid extends JPanel {

	private static final long serialVersionUID = 1L;

	static final int cols = 8;
	static final int rows = 8;

	static final int originX = 23;
	static final int originY = 37;
	static final int cellSide = 60;

	private int i;

	@Override
	protected void paintComponent(Graphics g) {
     super.paintComponent(g);

	 for (int i = 0; i < rows + 1; i++) {
		g.drawLine(originX, originY + i * cellSide, originX + cols * cellSide, originY + i * cellSide);
	 }
      for (int i = 0; i < cols + 1; i++); {
	g.drawLine(originX + i * cellSide, originY, originX + i * cellSide, originY + rows * cellSide);
	  }

	}
	
	}



/* 
class DataGrid{
    //create a 8x8 grid
   int[][] grid = new int[8][8];

   //Initialize the grid with values
   int counter = 1;
   for(int row = 0; row < grid.length;row++) {
    for(int col = 0; col < grid[row].length; col++) {
        grid[row][col] = counter++; //Incrementing numbers
    }
   }
   //Print the grid
   for( int row = 0; row < grid.length; row++){
    for(int col =0; col <grid[row].length; col++ ){
        System.out.print(grid[row][col] + "\t"); // use tab for spacing
    }
    System.out.println();// new line for each row
   }
}    
  

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid{

	public static void main(String[] args) {

		// Layout Manager = Defines the natural layout for components within a container
		
		// GridLayout = 	places components in a grid of cells. 
		//					Each component takes all the available space within its cell, 
		//					and each cell is the same size. 

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new GridLayout(3,3,0,0));
		
		frame.add(new JButton(""));
		frame.add(new JButton(""));
		frame.add(new JButton(""));
		frame.add(new JButton(""));
		frame.add(new JButton(""));
		frame.add(new JButton(""));
		frame.add(new JButton(""));
		frame.add(new JButton(""));
		frame.add(new JButton(""));
		
		frame.setVisible(true);

	}
}
*/