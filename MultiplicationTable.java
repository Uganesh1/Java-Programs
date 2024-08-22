import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Table no : ");
        int num = input.nextInt();
        System.out.println("Enter the Limit : ");
        int Limit = input.nextInt();
        int result =0;
        for(int i=1;i<=Limit;i++)
        {
            result = i * num;
            System.out.println(num+" x "+i+" = "+result);
        }
    }
}
