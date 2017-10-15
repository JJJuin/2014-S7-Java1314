package com.qdu.hea;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		char[] in = input.toCharArray();
		Map<Character, Character> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < input.length(); i ++){
			if(map.get(in[i]) != null){
				continue;
			}else{
				map.put(in[i], in[i]);
				sb.append(in[i]);
			}
		}
		System.out.println(sb);
		
		scanner.close();
	}

}
