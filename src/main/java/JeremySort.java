/**
 * Get comfortable with bubble sort & binary search
 */

public class JeremySort {

    public int[] bubbleSortMe(int[] input){
        for (int i=0; i<input.length-1; i++){
            for (int j=0; j< input.length-1-i; j++){
                if (input[j] > input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        return input;
    }

    public int[] optimizedBubbleSortMe(int[] input){
        boolean swapped;
        for (int i=0; i<input.length-1; i++){
            swapped = false;
            for (int j=0; j<input.length-1-i; j++){
                if (input[j] > input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return input;
    }


    /**
     * useful for searching an array that is already sorted from smallest to greatest value
     */

    public boolean binarySearch(int array[], int key, int left, int right){
        int mid = left + (right-left)/2;
        if (key < array[mid])
            return binarySearch(array, key, left, mid-1);
        else if (key > array[mid])
            return binarySearch(array, key, mid+1, right);
        else if (key == array[mid])
            return true; // Found
        return false; // Not Found
    }

}
