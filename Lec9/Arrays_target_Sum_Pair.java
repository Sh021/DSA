package Lec9;

import java.util.Scanner;

public class Arrays_target_Sum_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr= new int [n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        sum(arr, target);
    }
    public static void sum(int [] arr, int target){
        for(int j=0; j<arr.length-1; j++){
            int temp=arr[j];
            for(int i=j+1; i<arr.length; i++){
                if((arr[i]+temp)==target){
                    if(temp<arr[i]){
                        System.out.println(temp + " and " +arr[i]);
                    }
                    else{
                        System.out.println(arr[i] + " and " +temp);
                    }
                
                }
            }
        }
    }
}
