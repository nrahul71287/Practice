package com.java;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStacks<Item> {
	private Stack<Item> stack1; // back of queue
	private Stack<Item> stack2; // front of queue

	// create an empty queue
	public QueueUsingStacks() {
		stack1 = new Stack<Item>();
		stack2 = new Stack<Item>();
	}

	// move all items from stack1 to stack2
	private void moveStack1ToStack2() {
		while (!stack1.isEmpty())
			stack2.push(stack1.pop());
	}

	// is the queue empty?
	public boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}

	// return the number of items in the queue.
	public int size() {
		return stack1.size() + stack2.size();
	}

	// return the item least recently added to the queue.
	public Item peek() {
		if (isEmpty())
			throw new NoSuchElementException("Queue underflow");
		if (stack2.isEmpty())
			moveStack1ToStack2();
		return stack2.peek();
	}

	// add the item to the queue
	public void enqueue(Item item) {
		stack1.push(item);
	}

	// remove and return the item on the queue least recently added
	public Item dequeue() {
		if (isEmpty())
			throw new NoSuchElementException("Queue underflow");
		if (stack2.isEmpty())
			moveStack1ToStack2();
		return stack2.pop();
	}

	// a test client
	public static void main(String[] args) {
		QueueUsingStacks<String> q = new QueueUsingStacks<String>();
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String item = scanner.nextLine();
			if (!item.equals("-"))
				q.enqueue(item);
			else if (!q.isEmpty())
				System.out.print(q.dequeue() + " ");
		}
		System.out.println("(" + q.size() + " left on queue)");
		scanner.close();
	}
}
