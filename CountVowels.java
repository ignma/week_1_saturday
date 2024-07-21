import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String S = scanner.nextLine();
        
        // Close the scanner after input
        scanner.close();
        
        // Call the function to count vowels and print the result
        int vowelCount = countVowels(S);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
    
    // Function to count the number of vowels in a string
    public static int countVowels(String S) {
        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        S = S.toLowerCase();
        
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        
        return count;
    }
}
