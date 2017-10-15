package com.qdu.qunaer;

import java.util.Scanner;

public class Main {
	public static int search(int min,String[][] hx,int m,String tem,String end){
		for(int i = 0; i < m; i ++){
			if(hx[i][1].equals(tem)){
				min++;
             if(tem.equals(end)){
					return min;
				}
				search(min,hx, m, hx[i][2], end);
			}else
				continue;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String start = scanner.next();
		String end = scanner.next();
		String[][] hx = new String[100][100];
		for (int i = 0; i < m; i++) {
			hx[i][1] = scanner.next();
			hx[i][2] = scanner.next();
		}
		int cx = 100000;
		for (int i = 0; i < m; i++) {
			String tem = hx[i][2];
			if (tem.equals(start)) {
				int min = search(0, hx, m, tem, end);
				if (min!=0 &&min < cx) {
					cx = min;
				}
			} else
				continue;
		}
		if (cx == 100000) {
			System.out.println("DISCONNECTED");
		} else
			System.out.println(cx);
		scanner.close();
	}
}
