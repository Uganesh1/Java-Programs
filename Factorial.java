import java.util.Scanner;
public class Factorial {
    public static Long FindFactorial(Long n){
        if( n == 0 ){return 1L;}
        Long result =1L;
        for(Long i=1L;i<=n;i++){
             result *= i ;
        }
        return(result);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number to find the Factorial : ");
        long num = input.nextLong();
        System.out.println("The factorial of the Number '"+num+"' is : "+FindFactorial(num));

    }
}
