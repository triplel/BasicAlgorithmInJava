package com.liangsworld.quicksort;

/**
 * Created with IntelliJ IDEA.
 * User: liliangli
 * Date: 5/8/13
 * Time: 10:41 PM
 * To change this template use File | Settings | File Templates.
 */

// O(n log n) on average
// best case is already sorted
// worst case is when quick sort on only one element in each iteration,
// that creates O(n) + O(n-1) + O(n-2) + ... + O(1) = O(n*n)
public class QuickSortForInt {
    private int[] numbers;
    private int number;

    public void sort(int[] values){
        if(values == null || values.length == 0){
            return;
        }
        this.numbers = values;
        number = values.length;
        quickSort(0, number-1);
    }

    private void quickSort(int low, int high){
        int i = low, j = high;
        int pivot = numbers[(high + low)/2];
        while(i <= j){
            while(numbers[i] < pivot){
                i++;
            }
            while (numbers[j] > pivot){
                j--;
            }
            if(i <= j){
                swap(i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(low, j);
        if (i < high)
            quickSort(i, high);
    }

    private void swap(int i, int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
