package com.raju;

import java.util.Arrays;

public class TwoAddArrayLink {
    public static void main(String[] args) {
        int[] listFirst = {2,4,3};
        int[] listSecond = {5,6,4};
        int sizeFirst = listFirst.length;
        int sizeSecond = listSecond.length;
        int size = (sizeFirst + sizeSecond)/2;
        int[] finalList = new int[size];
        int finalSize = finalList.length;
        int nextNum = 0;
        for (int i = 0; i < sizeFirst; i++) {
            for (int j = i; j < sizeSecond; j++){
                int add = listFirst[i]+listSecond[j];
                int div = add/10;
                if(add%10==0){
                    finalList[i] = 0;
                    nextNum = div;
                    break;
                }else{
                    finalList[i] = listFirst[i]+listSecond[j] + nextNum;
                    nextNum=0;
                    break;
                }

            }

        }
        System.out.println(Arrays.toString(finalList));

    }
}
