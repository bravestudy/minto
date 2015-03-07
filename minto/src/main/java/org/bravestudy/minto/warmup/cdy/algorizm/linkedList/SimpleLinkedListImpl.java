package org.bravestudy.minto.warmup.cdy.algorizm.linkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * biz :
 * 단순 연결 리스트
 * 1. header 는 처음 노드의 참조만 가지고 있다.
 * 2. 마지막 노드가 가지는 참조 값은 null 이다.
 * 
 * @author choedaeyeol
 *
 * @param <AnyType>
 */
public class SimpleLinkedListImpl implements SimpleLinkedList,Iterable{
	
	private Node head;
	private Node tail;
	private int size;
	
	public SimpleLinkedListImpl() {
		this.head = null;
		this.tail = null;
	}
	
	private class Node{
		private Object data;
		private Node nextNode;
		
		public Node(Object data, Node nextNode) {
			this.data = data;
			this.nextNode = nextNode;
		}
		public Node(Object data) {
			this.data = data;
			this.nextNode = null;
		}
		
		public String toString(){
			return String.valueOf(data);
		}
	}
	
	
	public void addFirst(Object item){
		head = new Node(item, head);
		if(head.nextNode == null){
			tail = head;
		}
		
		size ++;
		
	}
	
	public void addLast(Object item){
	}
	
	
	//마지막 부분에 데이터 삽입
	/**
	 * 
	 * @param item
	 */
	public void add(int index,Object item){
		
	}

	@Override
	public String toString() {
		 StringBuffer result = new StringBuffer();
		 for (Object iterable_element : this) {
			result.append(iterable_element);
		}
	     return result.toString()+blank;
	}

	public static final String blank=" ";
	@Override
	public Iterator iterator() {
		return new LinkedListIterator();
	}
	
	private class LinkedListIterator  implements Iterator
	   {
	      private Node nextNode;

	      public LinkedListIterator()
	      {
	         nextNode = head;
	      }

	      public boolean hasNext()
	      {
	         return nextNode != null;
	      }

	      public Object next()
	      {
	         if (!hasNext()) throw new NoSuchElementException();
	         Object res = nextNode.data;
	         nextNode = nextNode.nextNode;
	         return res;
	      }

	      public void remove() { throw new UnsupportedOperationException(); }
	   }


	public static void main(String[] args) {
		int[] intMockData = {50,100,300,1,2};
				
		SimpleLinkedListImpl list = new SimpleLinkedListImpl();
		list.addFirst(intMockData[0]);
		list.addFirst(intMockData[1]);
		list.addFirst(intMockData[2]);
		
		System.out.println("[this]"+list);
		//System.out.println("크기 " + list.size());

	}
}
