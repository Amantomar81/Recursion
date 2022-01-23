import java.util.Scanner;

public class SumN {
//    public static void sum(int i,int n,int sum){
//        if(i==n){
//            sum += i;
//            System.out.println(sum);
//            return;
//        }
//        sum +=i;
//        sum(i+1,n,sum);
    public static int sum1(int n){

        return (int)n*(n+1)/2;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(sum1(n));
//        sum(1,5,0);
    }
}
