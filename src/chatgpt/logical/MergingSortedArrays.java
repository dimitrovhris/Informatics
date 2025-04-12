package chatgpt.logical;

import java.util.Arrays;

public class MergingSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 8, 9, 11};
        int[] arr2 = {1, 2, 3, 7, 8, 12, 15, 16};
        System.out.println(Arrays.toString(mergeSortedArrays(arr1, arr2)));
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2){
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] mergedArray = new int[length1 + length2];

        int i = 0, j = 0, k = 0;

        while(i < length1 && j < length2){
            if(arr1[i] <= arr2[j]){
                mergedArray[k++] = arr1[i++];
            } else{
                mergedArray[k++] = arr2[j++];
            }
        }
        while(i < length1){
            mergedArray[k++] = arr1[i++];
        }
        while(j < length2){
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }
}
