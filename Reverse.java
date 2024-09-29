package geeksforgeeks;

public class Reverse {

    // Complete the function
    // str: input string
    public static String reverseWord(String s) {
        StringBuilder reversedString = new StringBuilder();

        // Iterate through the string in reverse order and append characters to the StringBuilder
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString.append(s.charAt(i));
        }

        return reversedString.toString();

    }
}
