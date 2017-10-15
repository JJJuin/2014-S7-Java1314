package com.qdu.xieceng2;

public class Main {

	static String f1() {
		String string = new String();
		try {
			string += "A";
			return string;
		} catch (Exception e) {
			// TODO: handle exception
			string += "A";
		} finally {
			string += "A";
		}
		return null;
	}
	
	static StringBuilder f2() {
		StringBuilder string = new StringBuilder();
		try {
			string.append("A");
			return string;
		} catch (Exception e) {
			// TODO: handle exception
			string.append("A");
		} finally {
			string.append("A");
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.println(f1());
		System.out.println(f2().toString());
	}

}
