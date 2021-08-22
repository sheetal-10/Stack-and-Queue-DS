package com.ds.stackandqueue;

/**
 * Main function for calling of Queue Class
 * To pass data to  Queue to do different operations
 * @author sheetal
 * @since 2021-08-21
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to queue program");
		Queue queue=new Queue();
		queue.enque(15);
		queue.enque(16);
		queue.enque(17);
		queue.print();
		queue.dequeue();
		queue.print();
	}
}
