package com.saurab;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] num ={{1,2,3},{2,5,6}};
        System.out.println(maximumWealth(num));
    }
    static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum =0;
            for (int money = 0; money < accounts[person].length; money++) {
                sum += accounts [person][money];
            }
            if(sum >ans){
                ans = sum;
            }
        }
        return ans;
    }

}

