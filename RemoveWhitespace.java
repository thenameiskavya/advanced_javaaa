package lab3;

public class RemoveWhitespace {
	

	    public static String removeWhitespace(String str) {
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        String str = "Java Programming Language";

	        System.out.println("After removing spaces: " + removeWhitespace(str));
	    }
	}

