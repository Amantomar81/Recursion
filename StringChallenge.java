import java.util.Arrays;
import java.util.Scanner;

/*
Have the function fun(str) take the str parameter being which will be a string of numbers,
and return a new string with the numbers in reverse order.

EXAMPLES
Input:- "1 2 3"
Output:- 3 2 1

Input :- "10 20 30"
Output :- 30 20 10
 */
public class StringChallenge {
    public static int[] method(String str){
        //code goes here
        String[] splitArray = str.split(" ");
        int[] arr = new int[splitArray.length];

        for (int i = 0; i < splitArray.length; i++) {
            arr[i] = Integer.parseInt(splitArray[i]);
        }
        return arr;

    }
    public static void main(String[] args) {
        //keep this function call here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] array = method(str);
        for (int j =array.length-1;j>=0;j--) {
            System.out.print(array[j] + " ");
        }
    }
}
