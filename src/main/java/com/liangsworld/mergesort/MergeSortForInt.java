package com.liangsworld.mergesort;

/**
 * Created with IntelliJ IDEA.
 * User: liliangli
 * Date: 5/8/13
 * Time: 10:42 PM
 * To change this template use File | Settings | File Templates.
 */

//the merge sort in wrost case is O(n log n), due to copying of the collection
//merge sort is in the average case slower than quicksort
public class MergeSortForInt {
    private int[] numbers;
    private int[] helper;

    private int number;

    public void sort(int[] values){
        if(values == null || values.length == 0){
            return;
        }
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        mergeSort(0, number-1);
    }

    private void mergeSort(int low, int high){
        if(low < high){
            int middle = (high + low)/2;
            mergeSort(low, middle);
            mergeSort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high){
        for(int i = 0; i <= high; i ++){
            helper[i] = numbers[i];
        }
        int i = low, j = middle + 1, k = low;
        while(i <= middle && j <= high){
            if(helper[i] <= helper[j]){
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }

        //copy the rest of left side of the array into the target array
        while(i <= middle){
            numbers[k] = helper[i];
            i++;
            k++;
        }
    }
}
