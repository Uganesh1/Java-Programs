import java.util.Scanner;
public class Palindrome{
    
    public static String PalindromeCheck(String str){
        str = str.toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        boolean isPalindrome = str.equals(reversed);
        if(isPalindrome){
            System.out.println("The Given String '"+str+"' is Palindrome");
        }else {System.out.println("The Given String '"+str+"' is not Palindrome");}
        return(reversed);
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the Word or Number to chect it's a Polindrome : ");
        String str = input.next();
        PalindromeCheck(str);
    }
}