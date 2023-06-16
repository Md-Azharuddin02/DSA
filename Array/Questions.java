package Array;

import java.util.Arrays;

public class Questions  {
    // Q1.
    // There is an array given with lengthn-1 and the number is unique number find the mising number in the array 
    // number will start from 1 to n 
    // create a function will return missing number

    public static int misingNumber(int arr[]){
        int n= arr.length+1;
        int sumOfAllNumber= (n*(n+1))/2;
        int sum=0;
        for(int i=0; i<arr.length ; i++){
            sum +=arr[i];
        }
        return sumOfAllNumber-sum;
    }
    //Q2. 
    // There is a sorted array 
    // find the all dublicate element in that array and remove it 
    // create an another array that can hold none dublicate elements

    public static void removeDuplicates(int arr[]){
            int newArray[]= new int[arr.length];
            int index=0;
            
            try{
                for(int i=0; i<arr.length-1; i++){
                    try{
                        boolean flag= false;
                        for(int j=i+1; j<arr.length; j++){
                            if(arr[i]== arr[j]){
                                flag= true;
                            }
                        }
                        if(!flag){
                            newArray[index++]= arr[i];
                        }
                    }
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("check the nested loop");
                    }
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("check the first loop");
            }
            System.out.println(Arrays.toString(newArray));
    }
    // Q3. 
    // Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length. Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.
    
    // Example:
    // Input: nums = [1, 1, 2] 
    // Output: 2
    public static int removeDuplicate(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
 
        int i = 0;
 
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    // You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

    // Example:
    // Input: prices = [7, 1, 5, 3, 6, 4] 
    // Output: 5 
    // Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
 
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
 
        return maxProfit;
    }
    // Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice.

    // Examples
    // Input: nums = [2,7,11,15], target = 9
    // Output: [0,1]
    // Output: Because nums[0] + nums[1] == 9, we return [0, 1]


    // Input: nums = [3,2,4], target = 6
    // Output: [1,2]
     public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution found");
    }
    // Q 
    // How to find maximum product of two integers in the array where all elements are positive.

    // Example
    // int[] intArray = {10,20,30,40,50};
    // maxProduct(intArray) // (40,50)



    // Q. 
    // Your are given two integer arrays. Write a program to check if they are permutation of each other.

    // Example
    // int[] array1 = {1,2,3,4,5};
    // int[] array2 = {5,1,2,3,4};
    // permutation(array1, array2)
    // Output
    // true

    // Q. 
    // Given an image represented by an NxN matrix write a method to rotate the image by 90 degrees.



}
