package com.wqe;

import java.util.Scanner;

public class Main {

	 static int min = 0;
		public static int minimumNumberOfGunShots(int num, int shotDegrade, int remDegrade,
										   int[] health)    
		{
		    int max = 0;
		    for(int i = 0; i < num; i ++){
		        if(health[i] > max){
		            max = i;
		        }
		    }
		    System.out.println(max);
		    for(int i = 0; i < num; i ++){
		        if(i == max){
		            health[i] = health[i] - shotDegrade;
		            min++;
		        }else {
		            health[i] = health[i] - remDegrade;
		        }
		    }
		    int tem = 0;
		    for(int i = 0; i < num; i ++){
		        if(health[i] > tem){
		            tem++;
		        }
		    }
		    System.out.println(tem);
		    if(tem > 0){
		        minimumNumberOfGunShots(num,shotDegrade,remDegrade,health);
		    }else
		        return min;
		    return min;
		}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int num = cin.nextInt();
		int shotDegrade = cin.nextInt();
		int remDegrade = cin.nextInt();
	    int[] health = new int[num];
	    for(int i =0; i < num; i ++){
	    	health[i] = cin.nextInt();
	    }
	   System.out.println( minimumNumberOfGunShots(num,shotDegrade,remDegrade,health));
	}

}
