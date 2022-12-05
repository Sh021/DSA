package Lec6;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int a = 0; a < n; a++) {
			int m = sc.nextInt();
			int k = sc.nextInt();
			int aa = 0;
			int h = 0;
			for (int i = 0; i >= 0; i++) {
				if ((i % 2 != 0)) {
					if ((aa + i) <= m) {
						aa += i;
					} else {
						break;
					}

				} else {
					if ((h + i) <= k) {
						h += i;
					}

				}
			}
			if (aa > h) {
				System.out.println("Aayush");
			} else {
				System.out.println("Harshit");
			}

		}
	}
}
