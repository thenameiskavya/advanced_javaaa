package lab4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonEventDemo implements ActionListener{
	

	    JFrame frame;
	    JButton btnIndia, btnSrilanka;
	    JLabel label;

	    // Constructor
	    public ButtonEventDemo() {

	        // Create Frame
	        frame = new JFrame("Button Event Demo");

	        // Create Buttons
	        btnIndia = new JButton("India");
	        btnSrilanka = new JButton("Srilanka");

	        // Create Label
	        label = new JLabel("Press a button");
	        label.setBounds(100, 50, 300, 30);

	        // Set Button Positions
	        btnIndia.setBounds(100, 100, 100, 40);
	        btnSrilanka.setBounds(220, 100, 100, 40);

	        // Add ActionListener
	        btnIndia.addActionListener(this);
	        btnSrilanka.addActionListener(this);

	        // Add components to frame
	        frame.add(label);
	        frame.add(btnIndia);
	        frame.add(btnSrilanka);

	        // Frame settings
	        frame.setSize(450, 250);
	        frame.setLayout(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }

	    // Event Handling Method
	    public void actionPerformed(ActionEvent e) {

	        if (e.getSource() == btnIndia) {
	            label.setText("India is pressed");
	        } else if (e.getSource() == btnSrilanka) {
	            label.setText("Srilanka is pressed");
	        }
	    }

	    // Main method
	    public static void main(String[] args) {
	        new ButtonEventDemo();
	    }
	}

