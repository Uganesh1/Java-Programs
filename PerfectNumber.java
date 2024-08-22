import java.util.Scanner;
// Write a program to find the given numer is a perfect number or not.
public class PerfectNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the Nuber :");
        int n = input.nextInt();
        int sum =0;
        for( int i=1; i<n; i++ ){
            if( n % i == 0 ){
                sum += i;
            }
        } 
        if(sum == n){
            System.out.println(" The Number '"+n+"' is a PerfectNumber.");
        }else {
            System.out.println(" The Number '"+n+"' is not a PerfectNumber.");
        }
    }
}
