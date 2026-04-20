package lab5;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDemo {
	

	    public static void main(String[] args) {

	        // Create Frame
	        JFrame frame = new JFrame("Country List");

	        // List of countries
	        String countries[] = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa",
	            "Greenland", "Singapore"
	        };

	        // Create JList
	        JList<String> list = new JList<>(countries);

	        // Set selection mode (single selection)
	        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	        // Add ScrollPane
	        JScrollPane scrollPane = new JScrollPane(list);

	        // Add ListSelectionListener
	        list.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {

	                // Avoid duplicate events
	                if (!e.getValueIsAdjusting()) {

	                    // Get selected value
	                    String selected = list.getSelectedValue();

	                    // Print to console
	                    System.out.println("Selected Country: " + selected);
	                }
	            }
	        });

	        // Add to frame
	        frame.add(scrollPane);

	        // Frame settings
	        frame.setSize(300, 250);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}

