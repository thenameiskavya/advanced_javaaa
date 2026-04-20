package lab5;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
public class TabbedPaneDemo {
	



	    public static void main(String[] args) {

	        // Create Frame
	        JFrame frame = new JFrame("Tabbed Pane Demo");

	        // Create TabbedPane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create Panels
	        JPanel redPanel = new JPanel();
	        JPanel bluePanel = new JPanel();
	        JPanel greenPanel = new JPanel();

	        // Set Background Colors
	        redPanel.setBackground(Color.RED);
	        bluePanel.setBackground(Color.BLUE);
	        greenPanel.setBackground(Color.GREEN);

	        // Add Tabs
	        tabbedPane.addTab("RED", redPanel);
	        tabbedPane.addTab("BLUE", bluePanel);
	        tabbedPane.addTab("GREEN", greenPanel);

	        // Add ChangeListener to detect tab selection
	        tabbedPane.addChangeListener(new ChangeListener() {
	            public void stateChanged(ChangeEvent e) {

	                int index = tabbedPane.getSelectedIndex();
	                String title = tabbedPane.getTitleAt(index);

	                System.out.println("Selected Tab: " + title);
	            }
	        });

	        // Add to Frame
	        frame.add(tabbedPane);

	        // Frame settings
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}

