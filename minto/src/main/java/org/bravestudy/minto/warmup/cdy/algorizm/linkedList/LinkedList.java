package org.bravestudy.minto.warmup.cdy.algorizm.linkedList;

public interface LinkedList {
	
	/**
	 * 데이터 입력
	 * @param mockData
	 */
	void add(Object data);
	
	/**
	 * 삭제
	 * @param index
	 */
	void remove(int index);

	/**
	 * 가져오기
	 * @param index
	 * @return
	 */
	Object get(int index);
	
	/**
	 * size
	 * @return
	 */
	int size();
	
	
}
