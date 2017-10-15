package com.meili;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int year = scanner.nextInt();
			int month = scanner.nextInt();
			int day = scanner.nextInt();
			int sum = 0;
				if(year%4 == 0 && year%100 != 0 || year%400 == 0){
					for(int i = 1; i < month; i ++){
						if(i==1 || i==3 || i == 5 || i == 7 || i == 8 || i == 10 || i== 12){
							sum = sum + 31;
						}else{
							if(i==2){
								sum = sum + 29;
							}else{
								sum = sum + 30;
							}
						}
					}
					sum += day;
				}else{
					for(int i = 1; i < month; i ++){
						if(i==1 || i==3 || i == 5 || i == 7 || i == 8 || i == 10 || i== 12){
							sum = sum + 31;
						}else{
							if(i==2){
								sum = sum + 28;
							}else{
								if(i == 4 || i == 6 || i == 9 || i ==11){
									sum = sum + 30;
								}
							}
						}
					}
					sum += day;
				}
				System.out.println(sum);
			}
	}

}
