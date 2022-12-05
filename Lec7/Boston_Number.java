package Lec7;

import java.util.Scanner;

public class Boston_Number {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			long m = sc.nextInt();
			if (bos(m) == sum(m)) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}

	}

	public static long bos(long n) {
		long ans1 = 1;
		long ans2 = 0;
		long temp = n;
		for (long i = 2; true;) {
			if (n % i == 0) {
				long temp2 = i;
				if (i > 9) {
					int ans3 = 0;
					for (long j = 1; j > 0; j = temp2) {
						long rem = temp2 % 10;
						ans3 += rem;
						temp2 /= 10;
					}
					ans1 = ans1 * i;
					ans2 += ans3;
					n /= i;
				} else {
					ans1 = ans1 * i;
					ans2 += i;
					n /= i;
				}
			} else {
				i++;
			}
			if (temp == ans1) {
				break;
			}
		}
		return ans2;
	}

	public static long sum(long n) {
		long ans = 0;
		for (long i = 1; i > 0; i = n) {
			long rem = (n % 10);
			ans += rem;
			n /= 10;
		}

		return ans;
	}

}
