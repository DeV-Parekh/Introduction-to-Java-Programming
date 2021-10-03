/*
 *
 * QUESTION:-------------------------- Exercise05_03--------------------------------
 *
 * (Palindrome integer) Write the methods with the following headers
 *
 * // Return the reversal of an integer, i.e., reverse(456) returns 654
 *    public static int reverse(int number)
 * 
 * // Return true if number is a palindrome
 *    public static boolean isPalindrome(int number)
 * 
 * Use the reverse method to implement isPalindrome. A number is a palindrome if its 
 * reversal is the same as itself.
 * Write a test program that prompts the
 * user to enter an integer and reports whether the integer is a palindrome.
 *
 *
 * @author :-  DEV PAREKH (20CS043)
 * 
 * 
 */

package Exercise05;
import java.util.Scanner;

public class Exercise05_03 
{
    // Method that returns the reversal of an integer, 
    // i.e., reverse(456) returns 654
    public static int reverse(int number)
    {
        int digit;
        int reverse_no = 0;

        //logic to get reverse of a number
        while(number != 0)
        {
            digit = number % 10;
            reverse_no = reverse_no * 10 + digit;
            number /= 10;
        }
        return reverse_no;
    }

    // Method that returns true if the number is a palindrome
    public static boolean isPalindrome(int number)
    {
        return (number == reverse(number));
    }

    //main method
    public static void main(String[] args)
    {
        //declaration of a number variable
        int number;

        //Reading user's input number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number to check whether it is a Palindrome number or not: ");
        number = scanner.nextInt();

        System.out.println("\n----------------------------OUTPUT----------------------------\n");

        //checks whether number is palindrome or not 
        //and print its respective statement output
        if(isPalindrome(number))
            System.out.println("Your number " + number + " is a Palindrome.");
        else
            System.out.println("Your number " + number + " is NOT a Palindrome."); 
    }
}
