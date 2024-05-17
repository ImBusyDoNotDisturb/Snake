import java.awt.*;
//import java.io.File;
//import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JPanel;

public class Frame extends JFrame {
    Frame() {

        //JFrame f = new JFrame();
        JButton StartButton = new JButton();
        JButton button2 = new JButton();
        //JPanel p = new JPanel(new FlowLayout());

        /*try{
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("Snake Game/src/vt323/VT323-Regular.ttf")).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }*/

        

        StartButton.setBounds(165, 250, 95, 25);
        button2.setBounds(145, 280, 135, 25);
        //button.addActionListener(e -> System.out.println());
        //button2.addActionListener(e -> System.out.println());
        StartButton.setText("START");
        button2.setText("SETTINGS");
        StartButton.setFocusable(false);
        button2.setFocusable(false);
        //button.setHorizontalTextPosition(JButton.CENTER);
        //button.setVerticalTextPosition(JButton.BOTTOM);
        StartButton.setFont(new Font("Monospaced", Font.BOLD, 20));
        button2.setFont(new Font("Monospaced", Font.BOLD, 20));
        Color customColor = new Color(0, 204, 0);
        StartButton.setBackground(customColor);
        button2.setBackground(customColor);
        StartButton.setOpaque(true);
        button2.setOpaque(true);
        StartButton.setBorderPainted(false);
        button2.setBorderPainted(false);
        
        this.setTitle("Snake Game"); // title of the game on the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of appliaction
        this.setResizable(false); // prevent frame from resizing
        this.setSize(450, 450); // sets x-axis and y-axis of the frame
        this.setLocationRelativeTo(null);
        //this.setLayout(null);
        //this.setVisible(true);
        // this.add(l);
        // this.pack();

        ImageIcon i = new ImageIcon("Snake Game/src/images here/logo.png"); // create an image icon
        this.setIconImage(i.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(11, 148, 54)); // change color of the background

        JLabel l = new JLabel();
        ImageIcon image = new ImageIcon("Snake Game/src/images here/logo.png");
        // Border b = BorderFactory.createLineBorder(Color.green,3);

        l.setText("SNAKE"); // set text of label
        //l.setFont(new Font("press-start", Font.BOLD, 100 ));
        l.setIcon(image);
        l.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, right of image
        l.setVerticalTextPosition(JLabel.TOP); // set text top, center, botton of image
        l.setForeground(new Color(0, 0, 0)); // set font color of text
        //l.setFont(new Font("ST323", Font.BOLD, 100));
        //l.setFont(customFont); // set font of text
        l.setFont(new Font("Serif", Font.BOLD,100));
        l.setIconTextGap(-40); // set gap of text to image
        l.setBackground(new Color(11, 148, 54));
        l.setOpaque(true);
        // l.setBorder(border); // sets border of label(not image and text)
        l.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon and text within the label
        l.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon and text within the label
        l.setBounds(0, 0, 450, 450);

        this.add(StartButton);
        this.add(button2);
        this.add(l);
        this.setVisible(true); // makes the frame visible

        

        StartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                GameFrame gameFrame = new GameFrame();
                gameFrame.setVisible(true);
                /*JFrame f = new JFrame();
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setSize(450, 450);
                f.setVisible(true);
                f.setLocationRelativeTo(null);
                f.setResizable(false);*/
            }
        });
        
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Setting settings = new Setting(Frame.this);
                settings.setVisible(true);
                if(settings.isSoundEnabled()) {
                    // Code to enable sound based on user selection
                } else {
                    // Code to disable sound
                }
            }
        });
        
        /*button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (e.getSource()==button){
                f.dispose();
                JFrame NewFrame = new JFrame();
                }
            }
        });*/

        
        

        /*@Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==button){
                System.out.println();
            }
        }*/
        }
}

        



