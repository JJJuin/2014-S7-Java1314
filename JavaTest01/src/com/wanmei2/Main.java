package com.wanmei2;

import java.util.Scanner;
//01背包
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int[] score = new int[count];
		int[] time = new int[count];
		for(int i = 0; i < count; i ++){
			score[i] = scanner.nextInt();
		}
		for(int i = 0; i < count; i ++){
			time[i] = scanner.nextInt();
		}
		int total = scanner.nextInt();
		int[] dp = new int[total + 1];
		for(int i = 0; i < count; i ++){
			for(int j = total; j >= time[i]; j --){
				dp[j] = Math.max(dp[j], dp[j - time[i]] + score[i]);
			}
		}
		System.out.println(dp[total]);
	}

}
