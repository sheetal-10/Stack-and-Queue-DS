package com.ds.stackandqueue;

/**
 * Main function for calling of StackQueue Class
 * To pass data to Stack and Queue to do different operations
 * @author sheetal
 * @since 2021-08-21
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to stack and queue program");
		StackQueue stackQueue=new StackQueue();
		stackQueue.push(70);
		stackQueue.push(30);
		stackQueue.push(56);
		stackQueue.print();
		
	}
}
