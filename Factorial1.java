import java.util.Scanner;
public class Factorial1 {
    public static Long FindFactorial(Long n){
        Long result =1L;
        if( n ==0 ){
            return result;
        }
        for(Long i = 1L;i<=n;i++){
            result *= i;
        }return result;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the Number to Find the Factorial : ");
        Long num = input.nextLong();
        System.out.println("The Factorial of the Number '"+num+"' is "+FindFactorial(num));
    }
}
