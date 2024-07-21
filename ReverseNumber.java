import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number to reverse: ");
        int num = scanner.nextInt();
        
        // Close the scanner after input
        scanner.close();
        
        // Call the function to reverse the number and print the result
        int reversedNumber = reverseNumber(num);
        System.out.println("Reversed number: " + reversedNumber);
    }
    
    // Function to reverse the digits of a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
