package com.qdu.xiecheng;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] input = new int[n];
		int tem = 0;
		for(int i = 0; i < n; i ++){
			input[i] = scanner.nextInt();
		}
		int min = 100000;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i ++){
			map.put(input[i], input[i]);
			if(input[i] > 0 && input[i] < min){
				min = input[i];
			}
		}
		while(min < 1000000000){
			if(map.get(min) == null){
				break;
			}
			min++;
		}
		System.out.println(min);
		
		scanner.close();
	}

}
