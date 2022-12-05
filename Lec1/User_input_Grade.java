package Lec1;

import java.util.*;

public class User_input_Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if (marks >= 80) {
			System.out.println("Grade A");
		} else if (marks < 80 && marks >= 70) {
			System.out.println("Grade B");
		} else if (marks < 70 && marks >= 60) {
			System.out.println("Grade C");
		} else if (marks < 60 && marks >= 50) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}
