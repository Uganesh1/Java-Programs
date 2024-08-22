// Write a program to find the given Number is Strong Number or not 

import java.util.Scanner;
// If the Adiition of each digit Factorial in the Number is equal to the Number Then it is a Strong Number.    
public class StrongNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int f = 1;
        int result=0;
        while(num>0){
            int rem ;
            rem = num % 10;
            for(int i = 1; i<+rem; i++){
                f *= i;
                result += f;
                num /= 10;
            }
        }if( result == num ){
            System.out.println(" The Number '"+num+"' is a StrongNumber.");
        }else{
            System.out.println(" The Number '"+num+"' is not a StrongNumber.");
        }       
    }
}
