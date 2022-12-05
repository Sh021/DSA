package Lec6;

import java.util.Scanner;

public class odd_even {
    public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>0&&n<=1000) {
            int   ans = 0;
            int ans2=0;
            int   noc = sc.nextInt();//noc stands for number of car
            n--;
            while (noc!=0) {
                int   rem =  noc % 10;
                if(rem%2!=0) {
                	ans =  ans + rem;
                    noc =  noc / 10;
                }
                else {
                	ans2= ans2+rem;
                	noc=noc/10;
                }
            }
            if (((ans2 % 4) == 0) || (ans % 3) == 0) {
                System.out.println("Yes");
            }
             else {
                System.out.println("No");
            }
        }
    }
}