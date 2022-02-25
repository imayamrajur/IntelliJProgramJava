package com.raju;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] num1 = {8,6,1,2};
        int[] num2 = {3,4,5,9};
        int sizelength = num1.length + num2.length;
        int[] mergeList = new int[sizelength];

        for(int i=0;i<num1.length;i++){
            mergeList[i]=num1[i];
        }
        for (int i = 0; i < num2.length; i++) {
           // int len = (mergeList.length-num2.length)+i;
            mergeList[num1.length+i] = num2[i];
        }

        Arrays.sort(mergeList);
        for (int i = 0; i < mergeList.length; i++) {
            System.out.print(" "+mergeList[i]+" ");
        }
        // System.arraycopy(num1,0,mergeList,0,num1.length);
        //  System.arraycopy(num2,0,mergeList,num1.length,num2.length);
        float mediam;
        int lens = mergeList.length;
        if (lens%2==0) {
           int totlen = mergeList[lens/2]+mergeList[lens/2-1];
           mediam =(float) totlen/2;
        }else {
            mediam = mergeList[lens/2];
        }
        System.out.println("Median ="+mediam);

       /* for (int i = 0; i < mergeList.length; i++) {
            System.out.println(mergeList[i]);
        }*/
    }
}
