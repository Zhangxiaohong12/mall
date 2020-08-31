package com.study.mall.controller;

public class test {
    public static void main(String[] args) {
        /**
         * 1+100
         */
        int sum = 0;
        int n = 1;
        int x = 20;
        int y = 100;
        while (x<=y){
            sum += x ;
            x++;
        }
        System.out.println(sum+x);
        System.out.println(x+1);
        int [] ns = {1,2,3,5,6,7,8};
        for(int i = ns.length - 1; i>=0;i--){
            int s = ns[i];
            System.out.println(s);
        }
        for (int in : ns
             ) {
            System.out.println(in+",");
        }

    }
}
