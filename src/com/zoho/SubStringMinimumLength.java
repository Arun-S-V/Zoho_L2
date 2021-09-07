package com.zoho;

public class SubStringMinimumLength {
    public static void main(String args[]){
        String bigStr = "fffoxoxoxfxo";
        String smallStr = "fox";
        int len2 = smallStr.length();
        for (int i = 0; i <= bigStr.length()-smallStr.length(); i++){
            int j;
            for (j = 0; j < smallStr.length(); j++){
                if (bigStr.charAt(i + j) != smallStr.charAt(j)) {
                    break;
                }
            }
            if (j == len2) {
                bigStr = bigStr.substring(0, i) + bigStr.substring(i + smallStr.length());
                i = 0;
            }
            //System.out.println(bigStr);
        }
        System.out.println(bigStr);
    }
}

//
//    String bigStr = "fffoxoxoxfxo";
//    String smallStr = "fox";



//str.substring(0, p) + str.substring(p + 1);