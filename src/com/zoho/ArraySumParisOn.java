/*

4. An Array of Integer of Size 'n' is given, and a value 'sum' is given. Need to find how many pairs would make that sum.
Examples:
Input : arr[] = {1, 5, 7, -1},
sum = 6
Output : 2
Pairs with sum 6 are (1, 5) and (7, -1)
Input : arr[] = {1, 5, 7, -1, 5},
sum = 6
Output : 3
Pairs with sum 6 are (1, 5), (7, -1) & (1, 5)
Input : arr[] = {1, 1, 1, 1},
sum = 2
Output : 6
There are 3! pairs with sum 2.
Input : arr[] = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1},
sum = 11
Output : 9
Expected Time Complexity O(n).

 */

package com.zoho;


import java.util.HashMap;
import java.util.Map;

public class ArraySumParisOn {
    public static void main(String args[]) {
        int array[] = {1, 4, 5, 2, 7, 8, 6, 3};
        int target = 7;
        pairSumWithDuplicate(array,target);
    }
    public static void pairSumWithoutDuplicate(int []array, int target){
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<array.length;i++){
            if(map.containsKey(array[i])){
                System.out.println("{"+array[i] +","+ map.get(array[i])+"}");
                count++;
            }
            else{
                map.put(target-array[i],array[i]);
            }
        }
        System.out.println(count);
    }
    public static void pairSumWithDuplicate(int []array, int target){
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i  = 0;i<array.length;i++){
            int complement = target-array[i];
            if(map.get(complement) != null){
                count = count + map.get(complement);
            }
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        System.out.println(count);
    }
}

/*

{2,5}
{6,1}
{3,4}
3

 */