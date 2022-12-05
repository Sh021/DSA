package hack;

import java.util.Scanner;

public class increasinganddecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(inc(arr,n));
	}
	public static boolean inc(int []arr,int n) {
		boolean k=true;
		for(int i=1;i<n/2;i++) {
		if(arr[i-1]<arr[i]) {
			k=true;
		}
		else {
			return false;
			
		}
		}
		for(int i=n/2;i<n;i++) {
			if(arr[i-1]<arr[i]) {
				k=true;
			}
			else {
			 return false;
				
			}
		}
		return k;
	}
	}




