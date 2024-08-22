import java.util.Scanner;
// Write a program to find the Given NUmber is Amstrong Number or Not.
// Addition of the Each digit power of the digitcount is Same to the Given number Then that is a Amstrong Number. 
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = input.nextInt();

        int originalNum = num;
        int sum = 0;
        int digits = 0;

        // Calculate the number of digits in the input number
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        // Calculate the sum of powers of each digit
        temp = num;
        while (temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }

        // Check if the sum equals the original number
        if (sum == originalNum) {
            System.out.println("The Number '" + originalNum + "' is an Armstrong Number.");
        } else {
            System.out.println("The Number '" + originalNum + "' is not an Armstrong Number.");
        }
    }
}
