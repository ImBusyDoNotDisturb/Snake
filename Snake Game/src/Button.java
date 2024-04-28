import java.awt.*;


import java.awt.event.*;
import javax.swing.*;

public class Button extends JFrame implements addActionListener{  
    
    button = new JButton();
    button.setBounds(100, 100, 250, 100);
    button.addActionListener(this);
    button.setText("START");
    
    button.setFocusable(false);
    button.setHorizontalTextPosition(JButton.CENTER);
    button.setVerticalTextPosition(JButton.BOTTOM);
    button.setFont(new Font("Comic Sans",Font.BOLD,25));
    button.setForeground(Color.cyan);
    button.setBackground(Color.lightGray);
    button.setBorder(BorderFactory.createEtchedBorder());
    
void actionPerformed(ActionEvent e) {
    Object button;
    if(e.getSource()==button) {
        System.out.println("play");
        ((Component) button).setEnabled(false);
        Window l;
        l.setVisible(true);
        }	
    }
}

