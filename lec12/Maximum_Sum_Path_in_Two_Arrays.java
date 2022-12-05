package lec12;

import java.util.Scanner;

public class Maximum_Sum_Path_in_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int m=sc.nextInt();
			int [] arr=new int [m];
			int o=sc.nextInt();
			int [] brr=new int [o];
			for(int j=0;j<m;j++) {
				arr[j]=sc.nextInt();
			}
			for(int k=0;k<o;k++){
				brr[k]=sc.nextInt();
			}
			System.out.println(maxsum(arr,brr));
		}
		
	}
	
	public static int maxsum(int []arr,int []brr) {
		int max=0;
		int temp1=0;
		int temp2=0;
		for(int i=temp1;i<arr.length;i++) {
			for(int j=temp2;j<arr.length;j++) {
				if(arr[i]==brr[j]) {
					int sum1=0;
					int sum2=0;
					for(int k=temp1;k<=i;k++) {
						sum1+=arr[k];
						temp1++;
					}
					for(int l=temp2;l<=j;l++) {
						sum2+=brr[l];
						temp2++;
					}
					if(sum1>sum2) {
						max+=sum1;
					}
					else {
						max+=sum2;
					}
				}
			}
		}
		int sum3=0;
		int sum4=0;
		for(int i=temp1;i<arr.length;i++) {
			sum3+=arr[i];
		}
		for(int i=temp2;i<arr.length;i++) {
			sum4+=brr[i];
		}
		if(sum3>sum4) {
			max+=sum3;
		}
		else {
			max+=sum4;
		}
		return max;
	}
}
