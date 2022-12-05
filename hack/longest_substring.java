package hack;

import java.util.Scanner;

public class longest_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=0;i<test;i++) {
			String str=sc.next();
			int k=sc.nextInt();
			substring(str,k);
		}
		
		
	}
	public static void substring(String str, int k) {
		int sum=1;
		int j=1;
		int count=1;
		for(int i=1;i<str.length();i++) {
			sum=Math.max(sum, count);
			if(str.charAt(i-1)!=str.charAt(i)) {
			if(j<=k) {
			count++;
			j++;
			}
			else {
			count=1;
			j=1;
			}
			}
			else {
			count++;
			}		
			
		}
		System.out.println(sum);
		
	}

}
