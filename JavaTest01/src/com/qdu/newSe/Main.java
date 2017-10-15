package com.qdu.newSe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt()+1;
		String aString = scanner.nextLine();
		int[] input = new int[4];
		for(int i = 0; i < 4; i ++){
			int tem = Integer.parseInt(aString.substring(i,i+1));
			input[i] = tem;
		}
		for(int i = 0; i < 4; i ++){
			if(i==1){
				if(input[i] == input[i-1]){
					input[i]++;
				}
			}
			if(i==2){
					
			}
			if(i==3){
				
			}
		}
		
		
		int pp = -1;
			for(int k = 1; k < 9124-n; k ++){
				int a = n/1000;
				int b = (n - a*1000)/100;
				int c = (n - a*1000 - b*100)/10;
				int d = n - a*1000 - b*100 - c*10 + k;
				if(a!=b && a!=c && a!=d && b!=c &&b!=d && c !=d){
					System.out.println(a*1000 + b *100 + c*10 + d);
					pp = 1;
					break;
				}
			}
		if(pp == -1){
			System.out.println(pp);
		}
		scanner.close();
	}

}
