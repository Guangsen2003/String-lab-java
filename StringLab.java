
import java.util.Scanner;

public class StringLab {
    public static void main(String[] args) {

        String text = " Welcome to the Java String Lab! ";

        System.out.println("Length: " + text.length());
        System.out.println("Character: " + text.charAt(7));
        System.out.println("Substring: " + text.substring(16, 20));
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Index: " + text.indexOf("Java"));
        System.out.println("Contains: " + text.contains("Lab"));
        System.out.println("Replace: " + text.replace("Java", "Java Programming"));

        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("Trim: " + text.trim());

        System.out.println("Equals: " +
                text.equals("java string lab!"));

        System.out.println("Ignore Case: " +
                text.equalsIgnoreCase("java string lab!"));


        int count = 0;
        String lower = text.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u') {
                count++;
            }
        }

        System.out.println("Vowels: " + count);

       
        String word = "racecar";
        int left = 0;
        int right = word.length() - 1;
        boolean palindrome = true;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Is Palindrome: " + palindrome);

      
        Scanner input = new Scanner(System.in);
        String sentence;

        do {
                System.out.print("Enter a sentence containing Java: ");
                sentence = input.nextLine();

                 if (!sentence.contains("Java")) {
                 System.out.println("Please include the word Java. Try again!");
                    }

        } while (!sentence.contains("Java"));

                System.out.println("Thank you!");
                input.close();



       
        StringBuilder builder = new StringBuilder("StringBuilder Lab");

        builder.append(" - Learning Java");
        builder.insert(builder.indexOf("Lab") + 3, " is fun");
        builder.delete(builder.indexOf("Learning"),
                       builder.indexOf("Learning") + 8);
        builder.reverse();

        System.out.println("StringBuilder: " + builder);


        StringBuffer buffer = new StringBuffer("Multithreading Lab");

        buffer.append(" - Learning Java");
        buffer.insert(buffer.indexOf("Lab") + 3, " is fun");
        buffer.delete(buffer.indexOf("Learning"),
                      buffer.indexOf("Learning") + 8);
        buffer.reverse();

        System.out.println("StringBuffer: " + buffer);
    }
}
