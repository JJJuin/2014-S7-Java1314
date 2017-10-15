package com.lianjia;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n, r, avg;
		while (scanner.hasNextInt()) {
			n = scanner.nextInt();
			r = scanner.nextInt();
			avg = scanner.nextInt();
			int[] course = new int[n];
			int[] score = new int[r];
			int sum = 0;
			int min = 10000;
			int cc = 0;
			for (int i = 0; i < n; i++) {
				course[i] = scanner.nextInt();
				score[i] = scanner.nextInt();
				sum += course[i];
			}
			int tem = avg*n - sum;
			int core = 0;
			if (sum / n >= avg) {
				System.out.println(0);
			} else {
				while (core < tem) {
					for (int i = 0; i < n; i++) {
						if (score[i] < min) {
							min = score[i];
							cc = i;
						}
					}
					while (course[cc] < r) {
						core += score[cc];
						course[cc]++;
						if (core >= tem) {
							System.out.println(core);
							break;
						}
					}
					score[cc] = 1000000001;
					min = 1000000000;
				}
			}
		}
	}
}