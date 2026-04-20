package lab1;
import java.util.*;
public class SearchColor {
	


	    public static void main(String[] args) {

	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");

	        // Search for "Red"
	        if (colors.contains("Red")) {
	            System.out.println("Red is available in the list");
	        } else {
	            System.out.println("Red is NOT available in the list");
	        }
	    }
	}

