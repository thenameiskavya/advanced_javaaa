package lab3;

public class PalindromeCheck {

	    public static boolean isPalindrome(String str) {

	        // Remove punctuation and spaces
	        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        String reversed = new StringBuilder(str).reverse().toString();

	        return str.equals(reversed);
	    }

	    public static void main(String[] args) {
	        String str = "Madam, I'm Adam";

	        if (isPalindrome(str)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not a Palindrome");
	        }
	    }
	}

