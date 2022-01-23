import java.util.Scanner;
/*
Write a program to find out and return the number of digits present in a number recursively.
Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1
 */
public class Recursive {
    public static int num(int n){
        if(n==0){
            return 0;
        }
       return 1+ num(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int x = num(n);
        System.out.println(x);
    }
}
