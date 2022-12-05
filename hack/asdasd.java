import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean k=true;
		int [] arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++) {
		if(arr[i-1]<arr[i]) {
			k=true;
		}
		else {
			k=false;
			break;
		}
		}
		System.out.println(k);
	}

}