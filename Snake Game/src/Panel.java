import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Arrays;
import java.util.Random;

public class Panel extends JPanel implements ActionListener {
    // JPanel = a GUI component that functions as a container to hold other
    // components
    static final int SCREEN_WIDTH = 440;
    static final int SCREEN_HEIGHT = 430;
    static final int UNIT_SIZE = 25; //
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75; // speed the lower the faster
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;

    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;
    private ImageIcon appleImage;

    int appleEaten;
    int appleX;
    int appleY;
    char direction = 'D';
    boolean running = true;
    Timer timer;
    Random random;

    Panel() {
      random = new Random();
      this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
      this.setBackground(new Color(11, 148, 54));
      this.setFocusable(true);
      this.addKeyListener(new MyKeyAdapter());
      Start();
      appleImage = new ImageIcon("Snake Game/src/images here/apple.png");

    }

    public void Start(){
      newApple();
      running = true;
      timer = new Timer(DELAY,this);
      timer.start();
    }

    public void paintComponent(Graphics g) {
       super.paintComponent(g);
       draw(g);    
    }

    public void draw(Graphics g){
      if(running){
        /* 
        for (int i = 0; i<SCREEN_HEIGHT/UNIT_SIZE; i++){
          g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
          g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
        }
        */
        g.drawImage(appleImage.getImage(), appleX, appleY, UNIT_SIZE, UNIT_SIZE, this);

          for(int i = 0; i<bodyParts; i++){
            if(i == 0){
              g.setColor(Color.BLUE);
              g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
          }
          else{
            g.setColor(Color.ORANGE);
            g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
          } 
        }
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", Font.ITALIC,20));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("SCORE: " + appleEaten, (SCREEN_WIDTH - metrics.stringWidth("SCORE: " + appleEaten))/2, g.getFont().getSize());
      }
      else{
        gameOver(g);
      }
    }

    public void newApple(){
      appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
      appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
    }

    public void move(){
      for(int i = bodyParts; i>0; i--){
        x[i] = x[i-1];
        y[i] = y[i-1];
      }

      if(upDirection){
        y[0] -= UNIT_SIZE;
      }

      if(downDirection){
        y[0] += UNIT_SIZE;
      }

      if(leftDirection){
        x[0] -= UNIT_SIZE;
      }

      if(rightDirection){
        x[0] += UNIT_SIZE;
      }

      /*switch (direction) {
        case 'W':
          y[0] = y[0] - UNIT_SIZE;
          break;
        case 'S':
          y[0] = y[0] + UNIT_SIZE;
          break;
        case 'A':
          x[0] = x[0] - UNIT_SIZE;
          break;
       case 'D':
          x[0] = x[0] + UNIT_SIZE;
          break;
      }*/
    }

    public void checkFood(){
      if((x[0] == appleX) && (y[0] == appleY)){
        bodyParts++;
        appleEaten++;
        newApple();
      }
    }

    public void checkCollision(){
      //check if head collides with body
      for(int i = bodyParts; i>0; i--){
        if((x[0] == x[i]) && (y[0] == y[i])){
          running = false;
        }
      }
      //check if head touches left border
      if(x[0] < 0){
        running = false;
      }
      //check if head touches right border
      if(x[0] > SCREEN_WIDTH){
        running = false;
      }
      //check if touches top border
      if(y[0] < 0){
        running = false;
      }
      //check if head touches bottom border
      if(y[0] > SCREEN_HEIGHT){
        running = false;
      }
      //stop
      if(!running){
        timer.stop();
      }
    }

    public void gameOver(Graphics g){
      //SCORE
      g.setColor(Color.BLACK);
      g.setFont(new Font("Serif", Font.ITALIC,30));
      FontMetrics metrics1 = getFontMetrics(g.getFont());
      g.drawString("SCORE: " + appleEaten, (SCREEN_WIDTH - metrics1.stringWidth("SCORE: " + appleEaten))/2, g.getFont().getSize());
      //Game Over TEXT
      g.setColor(Color.BLACK);
      g.setFont(new Font("Serif", Font.BOLD,65));
      FontMetrics metrics2 = getFontMetrics(g.getFont());
      g.drawString("GAME OVER", (SCREEN_WIDTH - metrics2.stringWidth("GAME OVER"))/2, SCREEN_HEIGHT/2);
       //PRESS SPACE TO RESTART
       g.setColor(Color.BLACK);
       g.setFont(new Font("Serif", Font.BOLD,20));
       //FontMetrics metrics = getFontMetrics(g.getFont());
       if (appleEaten >= 0 ) { // Only show restart option if the player had eaten any apples
        g.drawString("Press SPACE to RESTART", (SCREEN_WIDTH - g.getFontMetrics().stringWidth("Press SPACE to RESTART")) / 2, 500 / 2);
    }
       //g.drawString("Press SPACE to RESTART", (SCREEN_WIDTH - metrics.stringWidth("Press SPACE to RESTART"))/2, 500/2 );
    }

    @Override
    public void actionPerformed(ActionEvent e){
      if(running){
        move();
        checkFood();
        checkCollision();
      }
      repaint();
    }

     public void resetGame() {
        // Reset game state
        bodyParts = 6; // Reset snake length
        appleEaten = 0; // Reset score
        appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        appleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
        running = true;
        timer.stop(); // Stop current timer
        timer.start(); // Restart timer
        // Reset snake's position and size
        x[0] = (SCREEN_WIDTH / 2) / UNIT_SIZE * UNIT_SIZE;
        y[0] = (SCREEN_HEIGHT / 2) / UNIT_SIZE * UNIT_SIZE;
        Arrays.fill(x, 1, bodyParts, -1); // Clear the rest of the snake's body parts
    }
  
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){

          int key = e.getKeyCode();

          if (key == KeyEvent.VK_SPACE) {
            resetGame(); // Call resetGame when spacebar is pressed
        }
//-------------------ARROW KEYS---------------------------
/* 
          if ((key == KeyEvent.VK_LEFT) && (!rightDirection)){
            leftDirection = true;
            upDirection = false;
            downDirection = false;
          }

          if((key == KeyEvent.VK_RIGHT) && (!leftDirection)){
            rightDirection = true;
            upDirection = false;
            downDirection = false;
          }

          if((key == KeyEvent.VK_UP) && (!downDirection)){
            upDirection = true;
            rightDirection = false;
            leftDirection = false;
          }

          if((key == KeyEvent.VK_DOWN) && (!upDirection)){
            downDirection = true;
            rightDirection = false;
            leftDirection = false;
          }
          */
//------------WASD KEYS FOR MOVING---------------------------------------------------
          if ((key == KeyEvent.VK_A) || (key == KeyEvent.VK_LEFT)){
            leftDirection = true;
            rightDirection = false;
            upDirection = false;
            downDirection = false;
          }

          if((key == KeyEvent.VK_D) || (key == KeyEvent.VK_RIGHT)){
            rightDirection = true;
            leftDirection = false;
            upDirection = false;
            downDirection = false;
          }

          if((key == KeyEvent.VK_W) || (key == KeyEvent.VK_UP)){
            upDirection = true;
            downDirection = false;
            rightDirection = false;
            leftDirection = false;
          }

          if((key == KeyEvent.VK_S) || (key == KeyEvent.VK_DOWN)){
            downDirection = true;
            upDirection = false;
            rightDirection = false;
            leftDirection = false;
          }

          /*switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
              if(direction != 'D'){
                direction = 'A';
              }
              break;
            case KeyEvent.VK_RIGHT:
              if(direction != 'A'){
                direction = 'D';
              }
              break;
            case KeyEvent.VK_UP:
              if(direction != 'S'){
                direction = 'W';
              }
              break;
            case KeyEvent.VK_DOWN:
              if(direction != 'W'){
                direction = 'S';
              }
              break;
          }*/

        }
        
    }
    
}
      /*p.setBackground(null);
        p.setBounds(0, 0, 250, 250);
        p.setLayout(new BorderLayout());
        add(p);*/