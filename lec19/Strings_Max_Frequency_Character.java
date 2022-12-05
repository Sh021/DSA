package lec19;

import java.util.Scanner;

public class Strings_Max_Frequency_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Maxfreq(s);
	}
	
	public static void Maxfreq(String s) {
		int max_i=0;
		int []arr=new int [26];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			 arr[ch-97]+=1;
			}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[max_i]) {
				max_i=i;
			}
		}
		System.out.println((char)(max_i+97));
	}
}
