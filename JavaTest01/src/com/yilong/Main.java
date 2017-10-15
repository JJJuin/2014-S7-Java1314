package com.yilong;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int[] input = new int[n];
	for(int i = 0; i < n; i ++){
		input[i] = scanner.nextInt();
	}
	Map<Integer, Integer> map = new HashMap<>();
	for(int i = 1; i < n; i ++){
		int ax = Math.abs(input[i] - input[i-1]);
//		System.out.println(ax);
		map.put(ax, ax);
	}
	int tem = 0;
	for(int i = 1; i < n; i ++){
		if(map.get(i) == null){
			System.out.println("Unluck seqence");
			tem++;
			break;
		}
	}
	if(tem == 0){
		System.out.println("Luck sequence");
	}
	scanner.close();
  }
}
