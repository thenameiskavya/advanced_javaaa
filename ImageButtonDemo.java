package lab4;
import javax.swing.*;
import java.awt.event.*;
public class ImageButtonDemo {
	


JFrame frame;
	    JButton btnClock, btnHourGlass;
	    JLabel label;

	    public ImageButtonDemo() {

	        // Create Frame
	        frame = new JFrame("Image Button Demo");

	        // Load Images (Make sure images are in project folder)
	        ImageIcon clockIcon = new ImageIcon("clock.png");
	        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

	        // Create Buttons with Images
	        btnClock = new JButton(clockIcon);
	        btnHourGlass = new JButton(hourglassIcon);

	        // Create Label
	        label = new JLabel("Press an image button");
	        label.setBounds(100, 50, 300, 30);

	        // Set Button Positions
	        btnClock.setBounds(80, 100, 100, 100);
	        btnHourGlass.setBounds(220, 100, 100, 100);

	        // Add Action Listener
	        btnClock.addActionListener(this);
	        btnHourGlass.addActionListener(this);

	        // Add components
	        frame.add(label);
	        frame.add(btnClock);
	        frame.add(btnHourGlass);

	        // Frame settings
	        frame.setSize(450, 300);
	        frame.setLayout(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }

	    // Event Handling
	    public void actionPerformed(ActionEvent e) {

	        if (e.getSource() == btnClock) {
	            label.setText("Digital Clock is pressed");
	        } else if (e.getSource() == btnHourGlass) {
	            label.setText("Hour Glass is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        new ImageButtonDemo();
	    }
	}

