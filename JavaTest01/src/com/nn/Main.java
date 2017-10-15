package com.nn;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static final int MOD = 1000000007;
	static long dp[][] = new long[100005][2];
	static char[] c;
	static long dfs(int len, Boolean ma, Boolean is) {
		if(len == c.length) return 1L;
		if(!ma && dp[len][is ? 1 : 0] >= 0) return dp[len][is ? 1 : 0];
		char m = '9';
		if(ma) m = c[len];
		long res = 0;
		if(is) {
			res += dfs(len + 1, false, true);
			res %= MOD;
		}
		if(m >= '4') {
			res += dfs(len + 1, ma && '4' == c[len], false);
			res %= MOD;
		}
		if(m >= '7') {
			res += dfs(len + 1, ma && '7' == c[len], false);
			res %= MOD;
		}
		if(!ma) dp[len][is ? 1 : 0] = res;
		return res;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		c = s.toCharArray();
		for(int i = 0; i < 100005; i++) {
			dp[i][0] = -1L;
			dp[i][1] = -1L;
		}
		long ans = dfs(0, true, true) - 1 + MOD;
		System.out.println(ans % MOD);
	}

}
