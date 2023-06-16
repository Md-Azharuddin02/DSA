package Array;

import java.util.Scanner;

public class Array_project {
    int tempreture[] = null;
    int dayMoreThanAvg = 0;

    public Array_project(int len) {
        this.tempreture = new int[len];
        for (int i = 0; i < len; i++) {
            tempreture[i] = Integer.MIN_VALUE;
        }
    }

    public void dataInsertion(){
        Scanner sc= new Scanner(System.in);
        int sumOfTemp=0;
        float avgOfTemp=0;
        try{
             for(int i=0; i<tempreture.length; i++){
            System.out.print("Enter the tempreture of day "+(i+1)+" ");
            tempreture[i]= sc.nextInt();
            sumOfTemp = sumOfTemp+tempreture[i];
        }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("check the array index");
        }
       
        //avrage of the tempreture 
        avgOfTemp= sumOfTemp/tempreture.length;
        try{
            for(int i= 0;i<tempreture.length; i++){
                if(tempreture[i]>avgOfTemp){
                    dayMoreThanAvg++;
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("check the foreach loop");
        }
         
        System.out.println("The average tempreture of "+tempreture.length+" is "+ avgOfTemp);
        System.out.println(dayMoreThanAvg+" days tempreture are more than "+ avgOfTemp);

    }
}
