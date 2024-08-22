import java.util.Scanner;
public class SumAndAverage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the Limit : ");
        int n = input.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            System.out.println("Enter the Number '"+i+"'");
            int num = input.nextInt();
            sum += num;
        }
        System.out.println(" Sum of the given '"+n+"' Numbers is : "+sum);
        int avg = sum/n;
        System.out.println(" Average of the given '"+n+"' Numbers is : "+avg);
    }
}