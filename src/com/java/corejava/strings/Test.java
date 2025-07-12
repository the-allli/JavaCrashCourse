package com.java.corejava.strings;

public class Test {
    public static void main(String[] args) {
        // String declaration and initialization
        String str1 = "Hello, World!";
        String str2 = "Java Programming";

        // String length
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str2: " + str2.length());

        // String concatenation
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenated);

        // String comparison
        boolean isEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + isEqual);

        // Substring
        String substring = str1.substring(0, 5);
        System.out.println("Substring of str1: " + substring);

        // Character at index
        char charAtIndex = str2.charAt(5);
        System.out.println("Character at index 5 in str2: " + charAtIndex);

        // String to char array
        char[] charArray = str1.toCharArray();
        System.out.print("Characters in str1: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // String to lower case
        String lowerCaseStr = str2.toLowerCase();
        System.out.println("str2 in lower case: " + lowerCaseStr);

        // String to upper case
        String upperCaseStr = str1.toUpperCase();
        System.out.println("str1 in upper case: " + upperCaseStr);

        // String replacement
        String replacedStr = str1.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);

        // String split
        String[] words = str1.split(" ");
        System.out.println("Words in str1:");
        for (String word : words) {
            System.out.println(word);
        }

        // String trim
        String strWithSpaces = "   Hello, Java!   ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed String: '" + trimmedStr + "'");

        // String format
        String formattedStr = String.format("Formatted String: %s - %d", str1, 2023);
        System.out.println(formattedStr);

        // String contains
        boolean containsWord = str2.contains("Java");
        System.out.println("Does str2 contain 'Java'? " + containsWord);
    }
}
