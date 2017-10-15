package com.wanmei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<K, V> map  = HashMap<, V>;
		List list = new ArrayList<>();
		String s1 = new String("asdf");
		String s2 = "asdf";
//		System.out.println(s1 == s2);
//		System.out.println(s1.intern() == s2);
		Integer t1 = new Integer(12);
		Integer t2 = new  Integer(12);
		Integer t3 = 128;
		Integer t4 = 128;
		System.out.println(t3 == t4);
		System.out.println(t1 == t2);
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] input = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i ++){
			input[i] = scanner.nextInt();
		}
		Arrays.sort(input);
		int tem = scanner.nextInt();
		if(tem < input[0] || tem < 2*input[0]){
			System.out.println(-1);
		}else {
			int x = n-1;
			while(tem > 0){
				if(input[x] > tem){
					x--;
					continue;
				}else{
					if((input[x] + input[0]) > tem){
						x--;
						continue;
					}else if(tem > 2*input[x]){
						while(tem > 0){
							tem -= input[x];
							sum++;
						}
					}
				}
			}
		}
		
		if(tem == 0){
			System.out.println(sum);
		}
	}

}
