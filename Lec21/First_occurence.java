package Lec21;

import java.util.Scanner;

public class First_occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,3,13,7,5,3,4,5,1,6,9,3};
		Scanner sc=new Scanner(System.in);
		int item=sc.nextInt();
		System.out.println(Firstindex(arr,0,item));
	}
	public static int Firstindex(int []arr,int i,int item){
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==item) {
		 return i;
		}
		
		
		return Firstindex(arr,i+1,item);
		
		
	}
}
