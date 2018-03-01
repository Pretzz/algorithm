package dp;
	
	import java.util.Scanner;
	
	public class no_9461 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			sc.nextLine();
			
			long[] dp = new long[101];
			long[] ans = new long[a+1];
			dp[1] = 1;
			dp[2] = 1;
			dp[3] = 1;
			dp[4] = 2;
			dp[5] = 2;
			 
			for(int i=1; i<=a; i++) {
				int n = sc.nextInt();
				for(int j=6; j<=n; j++) {
					dp[j] = dp[j-1] + dp[j-5];
				}
				ans[i] = dp[n];
			}
			
			for(int i=1; i<=a; i++) {
				System.out.println(ans[i]);
			}
		}
	}
