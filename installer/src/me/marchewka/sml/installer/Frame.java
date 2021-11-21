package me.marchewka.sml.installer;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Frame extends JFrame {
	
	public Frame() {
        JFrame frame= new JFrame(); 
        frame.setTitle("SML installer 1.8.8");
         
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
 
        JPanel headingPanel = new JPanel();
        JLabel headingLabel = new JLabel("SML installer");
        headingPanel.add(headingLabel);
         
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constr = new GridBagConstraints();
        constr.insets = new Insets(5, 5, 5, 5);     
        constr.anchor = GridBagConstraints.WEST;

         
        constr.gridwidth = 2;
        constr.anchor = GridBagConstraints.CENTER;
  
                // Button with text "Register"
        JButton button = new JButton("install for 1.8.8");
        // add a listener to button
        button.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
            headingLabel.setText("installed!");
          }
        });
  
               // Add label and button to panel
               panel.add(button, constr);
  
        mainPanel.add(headingPanel);
        mainPanel.add(panel);
 
        // Add panel to frame
        frame.add(mainPanel);
        frame.pack();
                frame.setSize(400, 400);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}

}
