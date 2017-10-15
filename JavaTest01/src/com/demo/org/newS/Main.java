package com.demo.org.newS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] input = new int[n];
		for(int i = 0; i < n; i ++){
			input[i] = i+1;
		}
		int sum = 0;
		int[] willing = new int[n];
		for(int i = 0; i < n; i ++){
			willing[i] = scanner.nextInt();
		}
		scanner.close();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i ++){
			int tt = -1;
			if(map.get(input[i]) != null || map.get(willing[i]) != null){
				tt = 1;
			}
//			for(int x: map.keySet()){
//				if(x == willing[i] || x == input[i]){
//					tt = 1;
//				}
//			}
			if(tt == 1){//找到了
				map.put(willing[i], willing[i]);
				map.put(input[i], input[i]);
			}else{//没找到
				sum++;
				map.put(willing[i], willing[i]);
				map.put(input[i], input[i]);
			}
		}
		System.out.println(sum);
	}

}
