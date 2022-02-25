package com.raju;

public class SampleArray {
    public static void main(String[] args) {
        int[] number = {21,34,56,21,31,95,57,59};
        int total=0;
//        int num = System.in.read("a");
        for (int i = 0; i < number.length; i++) {
            System.out.println(i+"-"+number[i]);
            total+=number[i];
           if(number[i]%2==0){
               System.out.println("Even Number ="+number[i]);
           }else{
               System.out.println("Odd number ="+number[i]);
           }
        }
        System.out.println(total);
//        System.out.println("I am Raju -  Hi sara "+num);
        System.out.println("I am Raju -  Hi sara ");
        System.out.println("I am Raju -  Hi sara ");
    }
}
