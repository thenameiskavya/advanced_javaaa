package lab1;
import java.util.*;

public class SubListExample {
	
	    public static void main(String[] args) {

	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");

	        // Extract 1st and 2nd elements (index 0 to 2)
	        List<String> sub = colors.subList(0, 2);

	        System.out.println("SubList (1st & 2nd): " + sub);
	    }
	}

