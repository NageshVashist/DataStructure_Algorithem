package com.threads.ds;

public class ReverseLinkList {

	private Node head;

	private static class Node {
		private int value;
		private Node next;

		Node(int value) {
			this.value = value;

		}
	}

	public void addToTheLast(Node node) {

		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = node;
		}
	}

	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	// Reverse linkedlist using this function
	public static Node reverseLinkedList(Node currentNode) {
		// For first node, previousNode will be null
		Node previousNode = null;
		Node nextNode;
		while (currentNode != null) {
			nextNode = currentNode.next;
			// reversing the link
			currentNode.next = previousNode;
			// moving currentNode and previousNode by 1 node
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}
	
	public static Node myReverse(Node currentNode) {
		
		Node prev=null;
		Node nxt= null;
		while(currentNode!=null) {
			nxt=currentNode.next;
			currentNode.next=prev;
			prev=currentNode;
			currentNode=nxt;
					
					
		}
		return prev;
	}

	public static void main(String[] args) {
		ReverseLinkList list = new ReverseLinkList();
		// Creating a linked list
		Node head = new Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));
		list.addToTheLast(new Node(3));
		list.addToTheLast(new Node(4));

		list.printList(head);
		// Reversing LinkedList
		Node reverseHead = reverseLinkedList(head);
		System.out.println("After reversing");
		list.printList(reverseHead);

	}

}
