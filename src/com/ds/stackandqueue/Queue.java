package com.ds.stackandqueue;

public class Queue {
	//creating  of node 
	Node front;
	Node rear;
	
	class Node{
		Node next;
		int data;

	
		//constructor 
		public Node(int data) {
			super();
			this.next = next;
			this.data = data;
		}
	}
	
	//method to insert element in the queue(Enque operation)
	public Node enque(int data) 
	{	
		 Node newNode = new Node(data);
		 if (front == null && rear==null) 
		 {
			front= rear = newNode;
		 } 
		 else
		 {
			 Node temp = rear;				 
			 while (temp.next != null) 
			 {
			 temp = rear.next;
			 }
			 temp.next = newNode;
		 }
		 return newNode;
	}
	
	// method to display Queue
	public void print() 
	 {			 
		 Node temp = front;
		 
		 if(temp==null)
		 {
			 System.out.println("queue is empty");
		 }
		 while (temp != null)
		 {
			 System.out.print(temp.data + " -> ");
			 temp = temp.next;
		 }
		 System.out.println();
	 }
}
