/*
 *  Checking Array for duplicate elements Java
In this Java tutorial, we will see a couple of ways to find if an array contains duplicates or not in Java. We will use the unique property of Java collection class Set which doesn’t allow duplicates to check java array for duplicate elements.  Here are five ways we can check if an array has duplicates or not:

1) brute force method which compares each element of Array to all other elements and returns true if it founds duplicates. Though this is not an efficient choice it is the one which first comes to mind.

2) Another quick way of checking if a Java array contains duplicates or not is to convert that array into Set. Since Set doesn’t allow duplicates size of  the corresponding Set will be smaller than original Array if Array contains duplicates otherwise the size of both Array and Set will be same.

3) One more way to detect duplication in java array is adding every element of the array into HashSet which is a Set implementation. Since the add(Object obj) method of Set returns false if Set already contains an element to be added, it can be used to find out if the array contains duplicates in Java or not.

Read more: http://javarevisited.blogspot.com/2012/02/how-to-check-or-detect-duplicate.html#ixzz4lghjImns

 */
package com.java.collection.list;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicatesInJavaArray {

    public static void main(String args[])  {
       
       String[] withDuplicates = new String[] {"one","two","three","one"};
        String[] withoutDuplicates = new String[] {"one","two","three"};
      
        System.out.println("Checking array with duplicate using brute force: " + bruteforce(withDuplicates));
        System.out.println("Checking array without any duplicate using brute force: " + bruteforce(withoutDuplicates));
      
        System.out.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingSet(withDuplicates));
        System.out.println("Checking array without any duplicate using Set and List: " + checkDuplicateUsingSet(withoutDuplicates));

      
        System.out.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingAdd(withDuplicates));
        System.out.println("Checking array without any duplicate using Set and List: " + checkDuplicateUsingAdd(withoutDuplicates));

      
    }
  
    /*
     * brute force way of checking if array contains duplicates in Java
     * comparing each element to all other elements of array
     * complexity on order of O(n^2) not advised in production
     */
    public static boolean bruteforce(String[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i].equals(input[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
    /*
     * detect duplicate in array by comparing size of List and Set
     * since Set doesn't contain duplicate, size must be less for an array which contains duplicates
     */
    public static boolean checkDuplicateUsingSet(String[] input){
        List inputList = Arrays.asList(input);
        Set inputSet = new HashSet(inputList);
        if(inputSet.size()< inputList.size())
            return true;
        }
        return false;
    }
  
    /*
     * Since Set doesn't allow duplicates add() return false
     * if we try to add duplicates into Set and this property
     * can be used to check if array contains duplicates in Java
     */
    public static boolean checkDuplicateUsingAdd(String[] input) {
        Set tempSet = new HashSet();
        for (String str : input) {
            if (!tempSet.add(str)) {
                return true;
            }
        }
        return false;
    }
}

/*
Output:
Checking array with duplicate using brute force: true
Checking array without any duplicate using brute force: false
Checking array with duplicate using Set and List: true
Checking array without any duplicate using Set and List: false
Checking array with duplicate using Set and List: true
Checking array without any duplicate using Set and List: false

Read more: http://javarevisited.blogspot.com/2012/02/how-to-check-or-detect-duplicate.html#ixzz4lfgaqcfy
*/