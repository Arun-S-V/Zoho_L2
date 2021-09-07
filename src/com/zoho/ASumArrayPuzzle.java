package com.zoho;
/*
Given an array arr[] of n integers, construct a Sum Array sum[] (of same size) such that sum[i] is equal to the sum of all the elements of arr[] except arr[i]. Solve it without subtraction operator and in O(n).

Examples:

Input : arr[] = {3, 6, 4, 8, 9}
Output : sum[] = {27, 24, 26, 22, 21}

Input : arr[] = {4, 5, 7, 3, 10, 1}
Output : sum[] = {26, 25, 23, 27, 20, 29}
 */

import java.util.Arrays;

public class ASumArrayPuzzle{
    public static void sumArray(int arr[], int len) {    //Time : O(n) Space : O(1)
        int i = 0;
        int temp = 0;
        int sum[] = new int[len];
        //Arrays.fill(sum, 0);
        for (i = 0; i < len; i++) {
            sum[i] = temp;
            temp = temp + arr[i];
        }
        temp = 0;
        for (i =len-1;i >= 0;i--) {
            sum[i] = sum[i] + temp;
            temp = temp + arr[i];
        }
        for (i = 0; i < len; i++) {
            System.out.print(sum[i] + " ");
        }
    }

    public static void sumArray1(int arr[], int len){        //Time : O(n) Space : O(n)
        int []leftSum = new int [len];
        int []rightSum = new int [len];
        int []sum = new int [len];
        leftSum[0] = 0;
        rightSum[len-1] = 0;
        for(int i =1;i<len;i++){
            leftSum[i] = arr[i-1] +leftSum[i-1];
        }
        for(int j =len-2;j>=0;j--){
            rightSum[j] = arr[j+1] + rightSum[j+1];
        }
        for (int i =0;i<len;i++){
            sum[i] = leftSum[i] + rightSum[i];
        }
        for (int i = 0; i < len; i++) {
            System.out.print(sum[i] + " ");
        }
    }
    public static void main(String[] args) {

        int array[] = {3,6,4,8,9};
        int len = array.length;
        sumArray(array, len);
        sumArray1(array, len);

    }
}
