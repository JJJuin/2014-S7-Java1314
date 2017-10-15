package com.qdu.newsev;

import java.util.Scanner;

public class Main {

	public static int[] fa = new int[1000005];
	public static int find(int x) {
		if(x == fa[x]) return x;
		else
			return fa[x] = find(fa[x]);
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		for(int i = 1; i <= n; i++)
			fa[i] = i;
		for(int i = 1; i <= n; i++) {
			int x = cin.nextInt();
			fa[find(x)] = find(i);
		}
		int ans = 0;
		for(int i = 1; i <= n; i++) {
			if(fa[i] == i) ans++;
		}
		System.out.println(ans);
	}

}
