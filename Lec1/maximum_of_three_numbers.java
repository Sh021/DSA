package Lec1;

public class maximum_of_three_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 100;
		int c = 40;
		if (a >= b && a >= c) {
			System.out.println(a);
		} else if (b >= a && b >= c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

}
