import java.util.Scanner;

/*
Create an array of 5 elements with values {1,2,4,2,6}.search value 2 in the given array and print the first
occurrence(index) of search value. Do it recursively
The prototype of the method is as follows
public static int find(int arr[ ], int currentIndex, int search_value)
{
	// set of statements;
}
 */
public class Occurence {
    public static int find(int arr[ ], int currentIndex, int search_value)
    {
        if(currentIndex < arr.length) {

            if (arr[currentIndex] == search_value) {
                //int x = find(arr, currentIndex + 1, search_value);
                return currentIndex;
            }
        }
        return currentIndex = find(arr,currentIndex+1,search_value);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,2,6};
        System.out.println(find(arr,0,2));
    }
}
