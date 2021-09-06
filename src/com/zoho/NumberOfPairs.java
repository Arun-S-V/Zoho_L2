package com.zoho;

import java.util.Scanner;

public class NumberOfPairs {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int size = scan.nextInt();
        int array[] = new int[size];
        for(int i =0;i<size;i++){
            array[i] = scan.nextInt();
        }
        int sum = scan.nextInt();
        for(int j =0;j<size;j++){
            for(int k = j+1;k<size;k++){
                int result = array[j] +array[k];
                if(sum == result){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
