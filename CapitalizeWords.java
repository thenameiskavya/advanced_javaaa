package lab3;

public class CapitalizeWords {

	    public static String capitalizeWords(String str) {
	        String[] words = str.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                result.append(Character.toUpperCase(word.charAt(0)))
	                      .append(word.substring(1).toLowerCase())
	                      .append(" ");
	            }
	        }
	        return result.toString().trim();
	    }

	    public static void main(String[] args) {
	        String str = "java programming language";

	        System.out.println("Capitalized: " + capitalizeWords(str));
	    }
	}

