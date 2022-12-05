package Lec28;

import java.util.ArrayList;
import java.util.List;

public class palindrome_partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="nitin";
		String ans="";
		List<String> ll=new ArrayList<>();
		List<List<String>> as=new ArrayList<>();
		palpar(str,ll,as);		
		System.out.println(as);
		
	}
	
	public static void palpar(String str,List<String> ll,List<List<String>> as) {
		if(str.length()==0) {
			as.add(new ArrayList<>(ll));
			return;
		}
		
		for(int i=1;i<=str.length();i++) {
			String ch=str.substring(0,i);
			if(ispalindrome(ch)) {
				ll.add(ch);
			palpar(str.substring(i),ll,as);
				ll.remove(ll.size()-1);
			}
		}
	}
	
	public static boolean ispalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
				if(str.charAt(i)!=str.charAt(j)) {
					return false;
				}
					i++;
					j--;
			}
		return true;
		}
		
	}


