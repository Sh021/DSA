package lec16;

public class String_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String str1="hello";
		String st=new String ("hello");
		String st1=new String("hello");
		System.out.println(str==str1);
		System.out.println(str==st);
		System.out.println(st==st1);
		System.out.println(str.equals(st));

	}

}
