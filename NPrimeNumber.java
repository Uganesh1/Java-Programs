import java.util.Scanner;
import java.util.Arrays;

public class NPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Prime Numbers to Display: ");
        int n = input.nextInt();

        int[] arr = new int[n]; // Initialize array to hold 'n' prime numbers
        int count = 0;
        int num = 2; // Start checking from 2, the first prime number

        while (count < n) {
            if (isPrime(num)) {
                arr[count] = num;
                count++;
            }
            num++;
        }

        System.out.println("First " + n + " prime numbers: " + Arrays.toString(arr));
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
