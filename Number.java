import java.util.Scanner;
/*
Write a program to print numbers from 1 to n in increasing order recursively.

Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
 */
public class Number {
    public static void Num(int n)
    {
       if (n==0){
           return;
       }
        Num(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Num(n);
    }
}
