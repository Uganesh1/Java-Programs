import java.util.Scanner;

public class FactorofNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter The Number : ");
        int num = input.nextInt();
        int f=0;
        if( num == 0 ){
        System.out.println("Please Enter the numbe above '0'.");
        }else{System.out.println(" The Factors of the Number '"+num+"' is : ");}
        for(int i=1;i<=num;i++){
            if( num % i == 0 ){
                f++;
                System.out.println(i);
            } 
        }if( f==2 ){
            System.out.println(" Also The Number '"+num+"' is a Prime Number.");
        }
    }
}
