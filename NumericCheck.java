package lab3;

public class NumericCheck {


	    public static boolean isNumeric(String str) {
	        return str != null && str.matches("\\d+");
	    }

	    public static void main(String[] args) {
	        String str = "12345";

	        if (isNumeric(str)) {
	            System.out.println("String contains only numbers");
	        } else {
	            System.out.println("String is not numeric");
	        }
	    }
	}

