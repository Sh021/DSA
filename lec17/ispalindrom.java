package lec17;
import java.util.*;

public class ispalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if(ispalindrom(str)==true) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}
	
	public static boolean ispalindrom(String str) {
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
