package com.qdu.mi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String string = scanner.nextLine();
			ArrayList<String> list = new ArrayList<>();
			String str = "";
			boolean tmp = false;
			for(int i = 0; i < string.length(); i++) {
				if('A' <= string.charAt(i) && string.charAt(i) <= 'Z') {
					if(!tmp) {
						if((i+1)<string.length() && 'a' <= string.charAt(i+1) && string.charAt(i+1) <= 'z'){
							str += "_";
						}
						str += string.charAt(i);
						
						if((i+1)<string.length() && Character.isDigit(string.charAt(i+1))){
							str += "_";
						}
					} else {
						list.add(str);
						str = "";
					}
					
				} else if('a' <= string.charAt(i) && string.charAt(i) <= 'z'){
					if(!tmp) {
						str += string.charAt(i);
						if((i+1)<string.length() && Character.isDigit(string.charAt(i+1))){
							str += "_";
						}
					} 
					else {
						list.add(str.substring(0, str.length() - 1));
						str = str.substring(str.length() - 1);
					}
				} else if(Character.isDigit(string.charAt(i))){
					str += string.charAt(i);
				}
				else{
					tmp = false;
					list.add(str);
					str = "";
					continue;
				}
				tmp = ('a' <= string.indexOf(i) && string.indexOf(i) <= 'z');
			}
			if(!str.equals("")) list.add(str);
			for(int i = 0; i < list.size(); i++) {
				System.out.print("_" + list.get(i).toUpperCase());
			}
			System.out.println("_");
		}
		scanner.close();
	}

}
