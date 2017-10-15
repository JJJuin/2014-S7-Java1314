package com.leixn2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String str = in.nextLine();
String[] strs = str.split("-");
 Map<Integer, Integer> map = new LinkedHashMap<>();
for(int i = 0;i < strs.length;++i) {
int row = Integer.parseInt(strs[i]);
if(!map.containsKey(row)) {
map.put(row, 1);
} else {
int temp = map.get(row) + 1;
map.put(row, temp);
}
}
while(map.size() > 0) {
 int key = 0;
int value = 0;
for(Integer k:map.keySet()) {
int t = map.get(k);
if(value < t) {
value = t;
key = k;
} else if(value == t) {
if(key < k) {
key = k;
value = t;
}
} else {
continue;
}
}
System.out.print(key+"-"+value);
map.remove(key);
if(map.size() > 0) {
System.out.print(" ");
	            }
	        }
	         
	    }
}
