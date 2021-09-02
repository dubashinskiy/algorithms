package sorting.selectionsort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
    }

    private static void sort(int[] arr) {
        int buf;
        int min;
        for(int i = 0; i < arr.length ; i++){
            min = i;
            for (int j = i; j < arr.length ; j++){
                if(arr[min] > arr[j]) {
                    min = j ;
                }
            }
            buf= arr[i];
            arr[i] = arr[min] ;
            arr[min] = buf;
        }
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
