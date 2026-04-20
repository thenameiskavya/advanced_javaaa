package lab1;
import java.util.*;

public class SortColors {
	

	
	    public static void main(String[] args) {

	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");

	        // Sorting
	        Collections.sort(colors);

	        System.out.println("Sorted colors: " + colors);
	    }
	}

