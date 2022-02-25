package com.raju;

public class RegularExp {
    public static void main(String[] args) {
        String name1 = "aa";
        String name2 = "a";
        boolean isCheck = name1.equals(name2);
        System.out.println(isCheck);
        boolean isChecked = (name1.startsWith(name2) && name1.endsWith(name2));
        System.out.println(isChecked);
    }
}
