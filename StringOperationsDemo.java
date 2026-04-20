package lab2;
import java.util.*;
public class StringOperationsDemo {
	


	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = new String("World");
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("\nLength of str1: " + str1.length());
	        System.out.println("Character at index 1: " + str1.charAt(1));

	        // 3. String Comparison
	        String s1 = "Java";
	        String s2 = "java";
	        System.out.println("\nEquals: " + s1.equals(s2));
	        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));

	        // 4. String Searching
	        String text = "Java Programming";
	        System.out.println("\nIndex of 'Pro': " + text.indexOf("Pro"));
	        System.out.println("Contains 'Java'? " + text.contains("Java"));

	        // 5. Substring Operations
	        System.out.println("\nSubstring (0-4): " + text.substring(0, 4));

	        // 6. String Modification
	        String mod = "hello world";
	        System.out.println("\nUppercase: " + mod.toUpperCase());
	        System.out.println("Replace 'world' with 'Java': " + mod.replace("world", "Java"));

	        // 7. Whitespace Handling
	        String space = "   Java Programming   ";
	        System.out.println("\nBefore trim: '" + space + "'");
	        System.out.println("After trim: '" + space.trim() + "'");

	        // 8. String Concatenation
	        String concat = str1 + " " + str2;
	        System.out.println("\nConcatenated String: " + concat);

	        // 9. String Splitting
	        String fruits = "Apple,Banana,Orange";
	        String[] arr = fruits.split(",");
	        System.out.println("\nSplit result:");
	        for (String f : arr) {
	            System.out.println(f);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Java");
	        sb.append(" Programming");
	        sb.insert(5, "Language ");
	        System.out.println("\nStringBuilder Result: " + sb);

	        // 11. String Formatting
	        String name = "Kavya";
	        int age = 20;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("\nFormatted String: " + formatted);

	        // 12. Validate Email
	        String email = "example@gmail.com";

	        if (email.contains("@") &&
	            email.startsWith("example") &&
	            email.endsWith(".com")) {

	            System.out.println("\nValid Email");
	        } else {
	            System.out.println("\nInvalid Email");
	        }
	    }
	}

