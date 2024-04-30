import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame extends JFrame {
    Frame() {

        JFrame f = new JFrame();
        JButton button = new JButton();
        JButton button2 = new JButton();
        button.setBounds(165, 250, 100, 30);
        button2.setBounds(165, 290, 100, 30);
        button.addActionListener(e -> System.out.println());
        button2.addActionListener(e -> System.out.println());
        button.setText("START");
        button2.setText("EXIT");
        button.setFocusable(false);
        button2.setFocusable(false);
        //button.setHorizontalTextPosition(JButton.CENTER);
        //button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Monospaced", Font.BOLD, 20));
        button2.setFont(new Font("Monospaced", Font.BOLD, 20));
        Color customColor = new Color(0, 204, 0);
        button.setBackground(customColor);
        button2.setBackground(customColor);
        button.setOpaque(true);
        button2.setOpaque(true);
        button.setBorderPainted(false);
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
        l.setIcon(image);
        l.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, right of image
        l.setVerticalTextPosition(JLabel.TOP); // set text top, center, botton of image
        l.setForeground(new Color(0, 0, 0)); // set font color of text
        l.setFont(new Font("Serif", Font.BOLD, 100)); // set font of text
        l.setIconTextGap(-40); // set gap of text to image
        l.setBackground(new Color(11, 148, 54));
        l.setOpaque(true);
        // l.setBorder(border); // sets border of label(not image and text)
        l.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon and text within the label
        l.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon and text within the label
        l.setBounds(0, 0, 450, 450);
        this.add(button);
        this.add(button2);
        this.add(l);
        this.setVisible(true); // makes the frame visible


        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        /*@Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==button){
                System.out.println();
            }
        }*/

        

    }

}
