package com.demo.org.servlet;

import java.util.Scanner;

import javax.xml.transform.Templates;

class Node {
	private int value;
	private Node front;
	private Node next;
	public Node(int value, Node front, Node next) {
		super();
		this.value = value;
		this.front = front;
		this.next = next;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getFront() {
		return front;
	}
	public void setFront(Node front) {
		this.front = front;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
class List {
	private Node first;
	private Node last;
	private int size;
	public int length() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public Integer getFirst() {
		if(size == 0) return null;
		return first.getValue();
	}
	public Integer getLast() {
		if(size == 0) return null;
		return last.getValue();
	}
	public void pushFirst(int value) {
		if(size == 0) {
			Node node = new Node(value, null, null);
			first = node;
			last = node;
		} else {
			Node node = new Node(value, null, first);
			first.setFront(node);
			first = node;
		}
		size++;
	}
	public void popFirst() {
		if(size == 0) return;
		first = first.getNext();
		size--;
	}
	public void pushLast(int value) {
		if(size == 0) {
			Node node = new Node(value, null, null);
			first = node;
			last = node;
		} else {
			Node node = new Node(value, last, null);
			last.setNext(node);
			last = node;
		}
		size++;
	}
	public void popLast() {
		if(size == 0) return;
		last = last.getFront();
		size--;
	}
}
class Queue {
	private List list;
	public Queue() {
		list = new List();
	}
	public int length() {
		return list.length();
	}
	public boolean isEmpty() {
		return list.length() == 0;
	}
	public void push(int value) {
		list.pushFirst(value);
	}
	public void pop() {
		list.popLast();
	}
	public Integer top() {
		return list.getLast();
	}
}

public class Main {

	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		int m = scanner.nextInt();
//		int[] input1 = new int[n + m];
//		int[] input2 = new int[m];
//		for (int i = 0; i < n; i++) {
//			input1[i] = scanner.nextInt();
//		}
//		for (int i = 0; i < n; i++) {
//			input2[i]  = scanner.nextInt();
//		}
//		int t = n-1;
//		for(int i = 0; i < n/2; i ++){
//			int tem = input1[i];
//			input1[i] = input1[t];
//			input1[t] = tem;
//			t--;
//		}
//		int u = m;
//		for(int i = 0; i < m/2; i ++){
//			int tem = input2[i];
//			input2[i] = input2[u];
//			input2[u] = tem;
//			u--;
//		}
//		for(int i = 0; i < m+n; i ++){
//			
//		}

		 Queue queue = new Queue();
//		 System.out.println(queue.top());
		
		 for(int i = 1; i <= 5; i++) {
		 queue.push(i);
		 }
		 for(int i = 1; i <= 5; i++) {
		 System.out.println(queue.top());
		 queue.pop();
		 }
		
//		 System.out.println(queue.top());
	}
}
