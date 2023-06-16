package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    //single dimension arrays
    static int[] arr= null;
    // doble dimension arrays;
    static int [][] arr2D= null;
    static Scanner  sc= new Scanner(System.in);

    //data insertion
    public static void insertData(int len){
        arr= new int[len];
        
        for(int i=0; i<len; i++){
            System.out.print("Enter the number for index  " +i+" : ");
            arr[i]= sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
    // data searching
    public static int  searchData(int data){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==data){
                return i;
            }
        }
        System.out.println("data is not found in the array");
        return -1;
    }
    // data deletion and updation
    public static void dataDeletion(int data){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==data){
                arr[i]=0;
                System.out.println("Data deleted successfully");
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }  
}
