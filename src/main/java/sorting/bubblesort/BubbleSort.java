package sorting.bubblesort;
/**
 * Bubble sort, also referred to as comparison sort, is a simple sorting algorithm that repeatedly goes through the list,
 * compares adjacent elements and swaps them if they are in the wrong order.
 * This is the most simplest algorithm and inefficient at the same time.
 * Yet, it is very much necessary to learn about it as it represents the basic foundations of sorting.
*/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
         sort(arr);
    }

    public static void sort(int[] arr){
        int buf;
        for (int i = arr.length - 1; i > 0; i-- ){
            for (int j = 0; j <  i; j++){
                if (arr[j] > arr[j+1]){
                    buf= arr[j+1];
                    arr[j+1] = arr[j] ;
                    arr[j] = buf;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i);
        }
    }
}

