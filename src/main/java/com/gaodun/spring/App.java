package com.gaodun.spring;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        int[] array0 = {1,312,31,2,3};
        bubsort(array0);
        int[] array1 = {1,123,12,2,3};
        selectSort(array1);
        int[] array2 = {1,312,1,12,3};
        insertSort(array2);
        int[] array3 = {123,412,12,312,31};
        int start = 0;
        int end = array3.length-1;
        quickSort(array3,start,end);
        System.out.println(Arrays.toString(array3));
        System.out.println( "Hello World!" );
    }


    public static void bubsort(int[] array){
        /**
         * 实现冒泡排序
         */
//        System.out.println(array.length);
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length-i-1;j++){
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                }
            }
        }
        System.out.println(Arrays.toString(array));

    }

    public static void selectSort(int[] array){
        /**
         * 实现选择排序
         */
        if (array.length == 0){
            System.out.println(Arrays.toString(array));
            return;
        }
        for (int i=0;i<array.length;i++){
            int minIndex = i;
            for (int j=i;j<array.length;j++){
                if (array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = tmp;

        }
        System.out.println(Arrays.toString(array));
    }

    public static void insertSort(int[] array){
        /**
         *插入排序
         */
        if (array.length ==0){
            return;
        }
        for (int i= 0; i< array.length-1 ;i++){
//            int cur = array[i+1];
            for(int j = i; j >= 0;j--){
                if (array[j+1]<array[j]){
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));


    }

    public static void quickSort(int[] array,int start ,int end){

        if (array.length < 0){
            return;
        }
        if (start>end){
            return;
        }
        int left = start;
        int right = end;
        int mid = array[left];
        while (left<right){
            while (left<right && array[right]>mid){
                right --;
            }
            array[left] = array[right];
            while (left<right && array[left]<mid){
                left ++;
            }
            array[right] = array[left];
        }
        array[left] = mid;
//        System.out.println(Arrays.toString(array));
        quickSort(array,start,left-1);
        quickSort(array,right+1,right);

    }

}
