package com.zoho;

import java.util.ArrayList;
import java.util.Scanner;

public class checkString {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
       // int count=0;
        ArrayList<Character> list = new ArrayList<>();
        int n = scan.nextInt();
        scan.nextLine();
        String array[] = new String[n];
        for(int i =0;i<n;i++){
            array[i] = scan.nextLine();
        }
        for(int i =0;i<n;i++){
            String str = array[i];
            list.add(str.charAt(0));
            for(int j =0;j<str.length()-1;j++){
                char ch = str.charAt(j);
                if(ch != str.charAt(j+1)){
                    list.add(str.charAt(j+1));
                }
            }
            //System.out.println(count);
            if(str.length()-list.size() == 1){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
            //count = 0;
        }
    }
}
