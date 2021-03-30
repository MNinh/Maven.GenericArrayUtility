package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

    T[] inputArray;


    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
       Integer count = 0;

        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i].equals(valueToEvaluate)){
                count++;
            }
        }

        for(int i = 0; i < arrayToMerge.length; i++){
            if(arrayToMerge[i].equals(valueToEvaluate)){
                count++;
            }
        }
        return count;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {

        T mostcommon = null;

        for(int i = 0; i < inputArray.length; i++){
            for(int j = 0; j < arrayToMerge.length; j++){
                if(inputArray[i] == arrayToMerge[j]){
                        mostcommon = inputArray[i];
                    }
                }
            }
        return mostcommon;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer count = 0;

        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i].equals(valueToEvaluate)){
                count++;
            }
        }
        return count;
    }

    public T[] removeValue(T valueToRemove) {
        T[] remainder;
        Integer count = 0;
        Integer removeCount = getNumberOfOccurrences(valueToRemove);
        Integer newSize = inputArray.length - removeCount;

        remainder = Arrays.copyOf(inputArray, newSize);
        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] != valueToRemove){
                remainder[count] = inputArray[i];
                count++;
            }
        }
        return remainder;
    }
}
