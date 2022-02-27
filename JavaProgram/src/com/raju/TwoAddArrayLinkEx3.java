package com.raju;

import java.util.Arrays;

public class TwoAddArrayLinkEx3 {
    public static void main(String[] args) {
        int l1[] = {9,9,9,9,9,9,9};
        int l2[] = {9,9,9,9};
        int sz1=l1.length;
        int sz2=l2.length;
        int sze = 0;
        if(l1[sz1-1]>=5 && l2[sz2-1]>=5){
            if(sz1>sz2){
                sze=sz1 +1;
            }else{
                sze=sz2 +1;

            }

        }else if(sz1>sz2){
            sze=sz1;
        }else{
            sze=sz2;

        }
        int rst[] = new int[sze];
        int sumA = 0;
        int tot=0;
        int rem = 0;
        int qu = 0;
        for (int i = 0; i < sze; i++) {
            if(i<sz2) {
                for (int j = i; j < sz2; j++) {
                    tot = l1[i]+l2[j] + qu;
                    if(tot/10!=0){
                        rem = tot%10;
                        rst[i]=rem;
                        qu = tot/10;
                        tot=0;
                        break;
                    }else{
                        rst[i]=tot;
                        qu=0;
                        tot=0;
                        break;
                    }

                }
            }else {
                if (i < sz1){
                    tot = l1[i] + qu;
                if (tot / 10 != 0) {
                    rem = tot % 10;
                    rst[i] = rem;
                    qu = tot / 10;
                    tot=0;
                    continue;
                } else {
                    rst[i] = tot;
                    qu = 0;
                    tot=0;
                    continue;
                }
            }else{
                    rst[i] = tot+qu;
                    tot=0;
                    qu=0;
                    continue;
                }
            }
        }
        System.out.println(Arrays.toString(rst));
    }
}
