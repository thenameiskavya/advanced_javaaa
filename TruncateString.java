package lab3;

public class TruncateString {


	    public static String truncate(String str, int maxLength) {
	        if (str.length() <= maxLength) {
	            return str;
	        }
	        return str.substring(0, maxLength) + "...";
	    }

	    public static void main(String[] args) {
	        String str = "Java Programming Language";

	        System.out.println("Truncated: " + truncate(str, 10));
	    }
	}
