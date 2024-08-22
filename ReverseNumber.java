import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter The Number : ");
        Double num = input.nextDouble();
        Double reverse = 0D,rem;
        while(num!=0){
            rem = num%10;
            reverse = (reverse*10)+rem;
            num=num/10;
        }
        System.out.println(reverse);
    }
}
