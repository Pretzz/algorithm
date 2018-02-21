package dp;

import java.util.Scanner;

public class no_2156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] wine = new int[n+1];
		int[] dp = new int[n+1];
		
		
		for(int i=1; i<=n; i++) {
			wine[i] = sc.nextInt();
		}
		
		
		dp[0] = 0;
		dp[1] = wine[1];
		if(n>1) {
			dp[2] = max(wine[1], 0) + wine[2];
			for(int i=3; i<=n; i++) {
				dp[i] = max(max(dp[i-1], dp[i-2]+wine[i]), dp[i-3]+wine[i-1]+wine[i]);
			}
		}
		System.out.println(dp[n]);
	}
	
	public static int max(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}

}
