package org.bravestudy.minto.warmup.cdy.algorizm.linkedList;



/**
 * vailid 
 * size over
 * IndexOut
 * @author choedaeyeol
 *
 */
public class LinkedListImpl implements LinkedList{
	Node head;
	int size=0;
	
	private class Node{
		private Object data;
		private Node nextNode;
		private Node preNode;
		
		public Node(Object data, Node nextNode, Node preNode) {
			this.data = data;
			this.nextNode = nextNode;
			this.preNode = preNode;
		}
		
		public Node(Object data) {
			this.data = data;
		}
	}
	
	
	
	@Override
	public String toString(){
		StringBuffer sbData = new StringBuffer();
		if(head!=null){
			for (int i = 0; i < size; i++) {
				sbData.append(String.valueOf(get(i)));
			}
			return sbData.toString();
		}else{
			return "";
		}
		
	}
	
	@Override
	public void add(Object data) {
		if(this.size == Integer.MAX_VALUE){throw new IndexOutOfBoundsException();}
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
			head.nextNode = head;
			head.preNode = head;
		}else{
			//Node tail = head.preNode;
			head.preNode.nextNode = newNode;
			head.preNode = newNode;
			
			newNode.preNode = head.preNode;
			newNode.nextNode = head;
		}
		
		size ++;
	}

	@Override
	public void remove(int index) {
		if(this.size < 0 || this.size-1 < index){throw new IndexOutOfBoundsException();}
		 // 제거할 노드가 헤드이면
        if(index == 0) {
            head.preNode.nextNode = head.nextNode;
            head.nextNode.preNode = head.preNode;
            head = head.nextNode;
        }
        else
        {
            Node before = head;
            while ((--index) > 0){
            	before = before.nextNode;
            	System.out.println(index+"============="); 
            }
            	
                
            before.nextNode = before.nextNode.nextNode;
            before.nextNode.preNode = before;
        }
	}

	@Override
	public Object get(int index) {
		
		
		return "";
	}

	@Override
	public int size() {
		return this.size;
	}

	public static void main(String[] args) {
		//success Test
		int[] arlMockData = {1,2,3,4,5,6};
		
		LinkedList linkedList = new LinkedListImpl();
		for (int mockData : arlMockData) {
			System.out.println(mockData);
			linkedList.add(mockData);
		}
		
		System.out.println("[linkedList add() ]"+linkedList);
		
		linkedList.remove(6);
		System.out.println("[linkedList remove() ]"+linkedList);
		
		Object data = linkedList.get(3);
		System.out.println("[linkedList get() ]"+data);

		int size = linkedList.size();
		System.out.println("[linkedList size() ]"+size);
		
		//falil Test
//		linkedList.get(-1);
//		
//		linkedList.get(100);
//		
//		linkedList.remove(100);
//		
//		for (int i = 0; i < Integer.MAX_VALUE; i++) {
//			linkedList.add(i);
//		}
//		
	}


}
