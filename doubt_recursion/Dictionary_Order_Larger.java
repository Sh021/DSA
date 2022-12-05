package doubt_recursion;

import java.util.*;

public class Dictionary_Order_Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		ArrayList<String> list=new ArrayList<>();
		printpermu(str,"",str,list);
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}
	
	public static void printpermu(String str,String ans,String org,ArrayList<String> list) {
		if(str.length()==0) {
			if(ans.compareTo(org)>0) {
			list.add(ans);
			}
			return;
		}
		
		for(int i=0;i<str.length();i++) {
		String ques=str.substring(0, i)+str.substring(i+1);
			char ch=str.charAt(i);
		printpermu(ques,ans+ch,org,list);
		}
		
	}

}
