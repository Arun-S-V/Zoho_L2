package com.zoho;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ParenthesesChecker {
    static boolean BracketsBalanced(String str){
        if(str.length() % 2 != 0) { // length should be of even length to be a valid parentheses
            return false;
        }
        Map<Character,Character> pair = new HashMap<>();
        pair.put(')','(');
        pair.put('}','{');
        pair.put(']','[');
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i<str.length() ; i++){
            char input = str.charAt(i);
            if( input == '{' || input == '[' || input == '('){
                stack.push(input);
            }
            else{
                if ( stack.isEmpty() || pair.get(input) != stack.pop()){
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner (System.in);
        String a = k.nextLine();
        if (BracketsBalanced(a))
            System.out.println("True");
        else
            System.out.println("False");
    }
}


