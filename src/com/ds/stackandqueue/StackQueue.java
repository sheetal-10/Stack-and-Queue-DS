package com.ds.stackandqueue;

/**
 * To create Simple stack
 * To perform different operation on insertion elements
 * @author sheetal
 * @since 2021-08-21
 */
public class StackQueue {
	
	//creating head node
	Node top;

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
	
	//insert data in stack
	public void push(int data) 
	 {
		 Node newNode = new Node(data);
		 newNode.next = top;
		 top = newNode;
	 }
	
	//method to display the top element of stack(peek operation)
	public void peek()
	{
		if(top==null){
			System.out.println("Stack is Underflow");
		}
		else{
			System.out.println("Peak element is "+top.data);		
			}
	}
	
	//method to delete element element from the stack until it will empty
	public void pop()
	{
		while(top!=null) {
			if(top==null){
				System.out.println("Stack is Underflow");
			}
			else {
				System.out.println("deleted element is "+top.data);		
				top=top.next;
			}		
		}
	}
	
	//display stack
	public void print() 
	 {			 
		Node temp = top;
		 
		 if(temp==null)
		 {
			 System.out.println("Stack is empty");
		 }
		 while (temp != null)
		 {
			 System.out.print(temp.data + " -> ");
			 temp = temp.next;
		 }
		 System.out.println();
	 }
}
