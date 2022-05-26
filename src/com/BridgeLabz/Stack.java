package com.BridgeLabz;

public class Stack {
	// Create a global top reference variable global
	Node top;

	Stack() {
		this.top = null;
	}

	// Pushing element on the top of the stack
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void push(int data) {
		Node newNode = new Node(data);

		if (newNode == null) {
			System.out.println("\nStack Overflow");
			return;
		}

		newNode.data = data;

		newNode.next = top;

		top = newNode;
	}

	public void display() { // print method
		Node temp = top;
		while (temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}

	}

	public static void main(String[] args) {
		System.out.println("welcome to stack and queue programs");
		Stack stack = new Stack();

		System.out.println("Element present in the Stack");
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.display();
		stack.display();
	}
}
