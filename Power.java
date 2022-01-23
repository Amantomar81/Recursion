/*
Q1. Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Sample Input 1 :
 3 4
Sample Output 1 :
81
 */
 import java.util.Scanner;

public class Power {
    public static int power(int n, int x)
    {
        //if n^0 return 1
//        if (n==0)
//            return ;
//        if (x == 0)
//            return ;
//        else
//        {
//            return x * power(x,n-1);
//        }
        return (int)Math.pow(n, x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x, n));
    }
}
