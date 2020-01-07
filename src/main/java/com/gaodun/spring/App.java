package com.gaodun.spring;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        int[] array = {1,312,31,2,3};
        bubsort(array);

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
        for(int num:array) {
            System.out.println(num);
        }
    }
}
