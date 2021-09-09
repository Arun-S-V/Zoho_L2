package com.zoho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ArrayListVSLinkedListTimeComparision {
    public static void main(String args[]) {
        ArrayList arList = new ArrayList();
        LinkedList linkList = new LinkedList();
        HashMap<Integer,Integer> map = new HashMap<>();

        final long a1 = System.nanoTime();
        for (int i = 0; i <=100; i++) {
            arList.add(i);
        }
        final long al = System.nanoTime();
        for (int i = 0; i <=100; i++) {
            linkList.add(i);
        }
        final long lm = System.nanoTime();
        for(int i =0;i<=100;i++){
            map.put(i,i);
        }
        final long m2 = System.nanoTime();

        System.out.println("Add LL :"+(al-a1));
        System.out.println("Add Al :"+(lm-al));
        System.out.println("Add Al :"+(m2-lm));

        final long startTimeLL = System.nanoTime();
        linkList.remove(1);//linkList.get(500);
        final long endTimeLL = System.nanoTime();

        final long startTimeAL = System.nanoTime();
        arList.remove(1);//arList.get(500);
        final long endTimeAL = System.nanoTime();

        final long totalTimeLL = endTimeLL-startTimeLL;
        final long totalTimeAL = endTimeAL-startTimeAL;

        System.out.println("LinkedList Taken Time : "+totalTimeLL);
        System.out.println("ArrayList Taken Time : "+totalTimeAL);
        long o = System.currentTimeMillis();
        System.out.println(o);
    }
}
