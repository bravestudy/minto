package org.bravestudy.minto.warmup.cdy.algorizm.real;

public class LinkedListImple implements LinkedList {

	public static void main(String[] args){
		int[] testMockData = {1,2,3,4,5,6};
		
		
		LinkedList linkedList = new LinkedListImple();
		System.out.println("success test");
		for (int data : testMockData) {
			linkedList.add(data);
		}
		System.out.println("===========" + linkedList);
		linkedList.remove(3);
		System.out.println(linkedList);
		Object data = linkedList.get(2);
		System.out.println(data);
		int size =linkedList.size();
		System.out.println(size);
		
		System.out.println("false test");
		
	}

	private int size=0;
	private Node head;
	
	private class Node{
		
		private Node nextNode;
		private Node prevNode;
		private Object data;
		
		public Node(Object data) {
			this.data = data;
		}
		
	}

	@Override
	public void add(Object data) {
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
			head.prevNode = newNode;
			head.nextNode = newNode;
		}else{
			newNode.nextNode = head;
			newNode.prevNode = head.prevNode;
			
			head.prevNode.nextNode = newNode;
			head.prevNode = newNode;
			
		}
		size++;
	}

	@Override
	public void remove(int i) {
		if(i==0){
			head.nextNode.prevNode = head.prevNode;
			head.prevNode.nextNode = head.nextNode;
			head = head.nextNode;
		}else{
			Node before = head;
			while(--i >0){
				before = before.nextNode;
			}
			before.nextNode = before.nextNode.nextNode;
			before.nextNode.prevNode = before;
		}
		size--;
	}

	@Override
	public Object get(int i) {
		Node thisNode = head;
		while(--i >=0){
			thisNode = thisNode.nextNode;
		}
		return thisNode.data;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		StringBuffer sbToString = new StringBuffer();
		for (int i = 0; i < size; i++) {
			sbToString.append(String.valueOf(get(i))); 
		}
		return sbToString.toString();
	}
	
}
