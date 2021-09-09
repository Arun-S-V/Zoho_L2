package com.zoho;

import java.util.ArrayList;
import java.util.LinkedList;

public class RearrangeRangeAB {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int array[] = {36,78,16,94};
        int a = 41;
        int b = 70;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < a) {
                list.add(array[i]);
            }
        }
        System.out.println(list);
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= a && array[i] <= b) {
                list.add(array[i]);
            }
        }
        System.out.println(list);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > b) {
                list.add(array[i]);
            }
        }
        System.out.println(list);
        LinkedList<Integer> llist = new LinkedList<>();
    }
}

