package com.zoho;

public class AProductArrayPuzzle {
    public static void sumArray(int arr[], int len) {    //Time : O(n) Space : O(1)
        int i = 0;
        int temp = 1;
        int sum[] = new int[len];
        //Arrays.fill(sum, 0);
        for (i = 0; i < len; i++) {
            sum[i] = temp;
            temp = temp * arr[i];
        }
        temp = 1;
        for (i =len-1;i >= 0;i--) {
            sum[i] = sum[i] * temp;
            temp = temp * arr[i];
        }
        for (i = 0; i < len; i++) {
            System.out.print(sum[i] + " ");
        }
    }

    public static void sumArray1(int arr[], int len){       //Time : O(n) Space : O(n)
        int []leftSum = new int [len];
        int []rightSum = new int [len];
        int []sum = new int [len];
        leftSum[0] = 1;
        rightSum[len-1] = 1;
        for(int i =1;i<len;i++){
            leftSum[i] = arr[i-1] * leftSum[i-1];
        }
        for(int j =len-2;j>=0;j--){
            rightSum[j] = arr[j+1] * rightSum[j+1];
        }
        for (int i =0;i<len;i++){
            sum[i] = leftSum[i] * rightSum[i];
        }
        for (int i = 0; i < len; i++) {
            System.out.print(sum[i] + " ");
        }
    }
    public static void main(String[] args) {

        int array[] = {10, 3, 5, 6, 2};
        int len = array.length;
        sumArray(array, len);
        System.out.println();
        sumArray1(array, len);
    }
}

