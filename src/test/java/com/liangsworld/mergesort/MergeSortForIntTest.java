package com.liangsworld.mergesort;

import com.liangsworld.mergesort.MergeSortForInt;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertTrue;
/**
 * Created with IntelliJ IDEA.
 * User: liliangli
 * Date: 5/8/13
 * Time: 11:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class MergeSortForIntTest {

    private int[] numbers;
    private final static int SIZE = 500;
    private final static int MAX = 100;
    private MergeSortForInt mergeSortForInt;

    @Before
    public void setUp(){
        this.mergeSortForInt = new MergeSortForInt();
        numbers = new int[SIZE];
        Random randomIntGenerator = new Random();
        for(int i = 0; i < numbers.length; i ++){
            numbers[i] = randomIntGenerator.nextInt(MAX);
        }
    }

    private boolean validateArray(int[] numbers){
        for (int i = 0; i < numbers.length-1; i++){
            if(numbers[i] > numbers[i+1])
                return false;
        }
        return true;
    }

    private void printResult(int[] numbers){
        for(int i : numbers){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Test
    public void testNull(){
        mergeSortForInt.sort(null);
    }

    @Test
    public void testEmpty(){
        mergeSortForInt.sort(new int[0]);
    }

    @Test
    public void testOneElementArray(){
        int[] oneElementArray = new int[1];
        oneElementArray[0] = 19;
        mergeSortForInt.sort(oneElementArray);
    }

    @Test
    public void testSpecialCase(){
        int[] interestingArray = {11,11,12,12,13,11,12,11,23,23,12,12,11,11};
        mergeSortForInt.sort(interestingArray);
        printResult(interestingArray);
        assertTrue(validateArray(interestingArray));
    }

    @Test
    public void testQuickSortForInt(){
//        printResult(numbers);
        long startTime = System.currentTimeMillis();
        mergeSortForInt.sort(numbers);
        long stopTime = System.currentTimeMillis();
        System.out.println("Quicksort took " + (stopTime - startTime) + " million seconds");
        assertTrue(validateArray(numbers));
    }

    @Test
    public void testRegularSortForInt(){
//        printResult(numbers);
        long startTime = System.currentTimeMillis();
        Arrays.sort(numbers);
        long stopTime = System.currentTimeMillis();
        System.out.println("Regular sort took " + (stopTime-startTime) + " million seconds");
        assertTrue(validateArray(numbers));
    }

}
