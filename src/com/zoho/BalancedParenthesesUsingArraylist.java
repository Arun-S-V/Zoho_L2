package com.zoho;

import java.util.ArrayList;

public class BalancedParenthesesUsingArraylist {
    public static void main(String args[]){
        String str = "[(){()}}]";
        if(isBalanced(str)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }


    public static boolean isBalanced(String s) {
        if(s.length()%2 != 0){
            return false;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                list.add(Character.toString(s.charAt(i)));
                System.out.println(list);
            }

            else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if(list.size() != 0 && list.get(list.size()-1).equals("(") && s.charAt(i) == ')') {
                    list.remove(list.size()-1);
                    System.out.println(list);
                }
                else if(list.size() != 0 && list.get(list.size()-1).equals("{") && s.charAt(i) == '}') {
                    list.remove(list.size()-1);
                    System.out.println(list);
                }
                else if(list.size() != 0 && list.get(list.size()-1).equals("[") && s.charAt(i) == ']') {
                    list.remove(list.size()-1);
                    System.out.println(list);
                }
                else {
                    return false;
                }
            }
        }
        if(list.isEmpty() == true) {
            return true;
        }
        return false;
    }
}
