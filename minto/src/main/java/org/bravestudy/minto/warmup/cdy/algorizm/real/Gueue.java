package org.bravestudy.minto.warmup.cdy.algorizm.real;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Gueue implements Queue<Object> {
	private Object[] arlObjects;
	private int real=-1;
	private int front=-1;
	private int size=0;
	public Gueue(int size) {
		this.size = size;
		arlObjects = new Object[size];
	}
	
	public static void main(String[] args) {
		Gueue queue = new Gueue(5);
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		queue.enQueue("D");
		queue.enQueue("E");
			
		int size = queue.getSize();
		for(int i=0;i<size;i++) {
			System.out.println(queue.deQueue());
		}

		//공백큐 인데 뺄경우
		//System.out.println(queue.deQueue());
	}

	    public void enQueue(Object element) {
	         
	        //큐 포화상태 검사
	        if (isFull()) {
	            throw new QueueOverflow();
	        }
	         
	        arlObjects[++real] = element;
	    }
	     
	    public Object deQueue() {
	         
//	        //공백큐 검사
//	        if (isEmpty()) {
//	            throw new QueueUnderflow();
//	        }
//	         
//	        //비어있다면 다시 원점으로 초기화
//	        if (isEmpty()) {
//	            real = -1;
//	            front = -1;
//	        }
//	         
	        return arlObjects[++front];
	    }
	     
	    public boolean isFull() {
	        return real == size-1 ? true : false;
	    }
	     
	    public boolean isEmpty() {
	        return front == real ? true : false;
	    }
	     
	    public int getSize() {
	        return size;
	    }
	     
	     
	    static class QueueOverflow extends RuntimeException {
	         
	    }
	 
	    static class QueueUnderflow extends RuntimeException {
	         
	    }

		@Override
		public boolean addAll(Collection<? extends Object> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean contains(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Iterator<Object> iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean remove(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean removeAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean retainAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <T> T[] toArray(T[] arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean add(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object element() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean offer(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object peek() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object poll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object remove() {
			// TODO Auto-generated method stub
			return null;
		}
}
