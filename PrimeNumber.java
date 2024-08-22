import java.util.Scanner;
public class PrimeNumber{

    public static int PrimeNumberCheck(int n){
        int f =0;
        for(int i =1;i<=n;i++){
            if( n % i == 0 ){
                f++;
            }
        }return f;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the Number to Check that's a Prime number or not : ");
        int num = input.nextInt();
        Boolean isPrimeNumber = PrimeNumberCheck(num)==2;
        int num1 = (int)num;
        if(isPrimeNumber){
        System.out.println(" The Number '"+num+"' is a PrimeNumber.");
        }else{
            System.out.println(" The Number '"+num+"' is not a PrimeNumber.");
        }
    }
}