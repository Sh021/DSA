package Lec3;

import java.util.*;

public class test2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			for (int i = 2; i <= num; i++) {
				//
				int j = 2;
				while (true ) {
					if (i % j == 0) {
						break;
					}
					System.out.println(j);
					j++;

				}
				
			}

		}
	}
