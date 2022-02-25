package com.raju;

public class PalindromicExp {
    public static void main(String[] args) {
        String name = "madam";
        char[] cl = name.toCharArray();
        String nm = "";
        String nn = "";
        for (int i = 0; i < name.length(); i++) {
            char a = name.charAt(i);
            for (int j = 0; j < name.length(); j++) {
                char b = name.charAt(j);
                if (a != b) {
                    nm += a;
                    break;
                } else {
                    nn += b;
                }
            }
        }
        System.out.println(nm);
        System.out.println(nn);
    }
}
