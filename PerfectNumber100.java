// Write a program to find the perfect numbers between 1 to 100.
// The Addition of the Factors of the given Number is equal to given umber.
public class PerfectNumber100 {
    public static void main(String[] args){
        
        for( int n=1; n<=100; n++ ){
            int sum =0;
        for(int i=1; i<n; i++){
            if( n % i == 0 ){
                sum += i;
            }
            }
            if( sum == n){
                System.out.println("The Number '"+n+"' is Perfect Number");
            }
        }
    }
}
