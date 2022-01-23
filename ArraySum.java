import java.util.Scanner;

/*
Write a program to find and return the sum of all elements of the array. Do this recursively.
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7
 */
public class ArraySum {
    public static int Asum(int arr[],int i){
        if (i<=0){
            return 0;
        }
        return Asum(arr,i-1) + arr[i-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        int sum =Asum(arr, arr.length);
        System.out.println(sum);
    }
}
