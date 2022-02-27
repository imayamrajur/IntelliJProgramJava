package com.raju;

import java.util.Arrays;

public class TwoAddArrayLinkEx2 {
    public static void main(String[] args) {
        int[] l1 = {0};
        int[] l2 = {0};
        int size = (l1.length+l2.length)/2;
        int[] l3 = new int[size];
        l3[0] = l1[0]+l2[0];
        System.out.println(Arrays.toString(l3));
    }
}
