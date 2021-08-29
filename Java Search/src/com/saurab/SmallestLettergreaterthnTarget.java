package com.saurab;
// leetcode problem no 744 solution
//leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/
public class SmallestLettergreaterthnTarget {
    public  static void main(String[] args) {
        char num[] ={'c','d','j'};
        char target = 'j';
        char ans = nextGreatestLetter(num,target);
        System.out.println(ans);
    }
    // letter will rap around (a comes after z)
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < letters[mid] ){
                end = mid -1;
            }
            else{
                start = mid +1 ;
            }
        }
        return letters[start  % letters.length];
    }
}
