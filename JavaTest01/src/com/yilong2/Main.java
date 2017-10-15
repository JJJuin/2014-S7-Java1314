package com.yilong2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i = 0; i < t; i ++){
			int n = scanner.nextInt();
			int[] E = new int[n];
			int[] S = new int[n];
			int[] W = new int[n];
			int[] N = new int[n];
			for(int k = 0; k < n; k ++){
				E[k] = scanner.nextInt();
			}
			for(int k = 0; k < n; k ++){
				S[k] = scanner.nextInt();
			}
			for(int k = 0; k < n; k ++){
				W[k] = scanner.nextInt();
			}
			for(int k = 0; k < n; k ++){
				N[k] = scanner.nextInt();
			}
			int sum = 0;
			StringBuilder sb = new StringBuilder();
			for(int k = 0; k < n; k ++){
				sum += Math.min(Math.min(E[k], S[k]), Math.min(W[k], N[k]));
				if(E[k] <= S[k] && E[k] <= W[k] && E[k] <= N[k]){
			    	sb.append("E");
			    }else if(E[k] > S[k] && S[k] <= W[k] && S[k] <= N[k]){
						sb.append("S");
					}else if(E[k] > W[k] && S[k] > W[k] && W[k] <= N[k]){
							sb.append("W");
						}else{
							sb.append("N");
							}					
				}
			
			System.out.println(sum);
			System.out.println(sb);
			
		}
		scanner.close();
	}

}
//1
//4
//1 10 100 1000
//100 10 1000 1
//10 10 10 10
//50 5 15 55
