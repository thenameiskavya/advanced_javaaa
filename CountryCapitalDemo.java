package lab5;
import javax.swing.*;
import javax.swing.event.*;
import java.util.HashMap;
public class CountryCapitalDemo {
	
	    public static void main(String[] args) {

	        // Create Frame
	        JFrame frame = new JFrame("Country Capitals");

	        // Countries List
	        String countries[] = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa",
	            "Greenland", "Singapore"
	        };

	        // Create JList
	        JList<String> list = new JList<>(countries);

	        // Scroll Pane
	        JScrollPane scrollPane = new JScrollPane(list);

	        // Create Map for Country → Capital
	        HashMap<String, String> capitalMap = new HashMap<>();

	        capitalMap.put("USA", "Washington D.C.");
	        capitalMap.put("India", "New Delhi");
	        capitalMap.put("Vietnam", "Hanoi");
	        capitalMap.put("Canada", "Ottawa");
	        capitalMap.put("Denmark", "Copenhagen");
	        capitalMap.put("France", "Paris");
	        capitalMap.put("Great Britain", "London");
	        capitalMap.put("Japan", "Tokyo");
	        capitalMap.put("Africa", "Not a single capital"); // continent
	        capitalMap.put("Greenland", "Nuuk");
	        capitalMap.put("Singapore", "Singapore");

	        // Add Listener
	        list.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {

	                if (!e.getValueIsAdjusting()) {

	                    String country = list.getSelectedValue();
	                    String capital = capitalMap.get(country);

	                    System.out.println("Country: " + country);
	                    System.out.println("Capital: " + capital);
	                    System.out.println("----------------------");
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

