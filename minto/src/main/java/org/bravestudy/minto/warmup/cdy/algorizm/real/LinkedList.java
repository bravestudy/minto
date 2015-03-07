package org.bravestudy.minto.warmup.cdy.algorizm.real;

public interface LinkedList {
	
	/**
	 * 순차적으로 데이터를 입력 한다.
	 * @param data
	 */
	void add(Object data);

	/**
	 * 해당 index의 node를 삭제한다.
	 * @param i
	 */
	void remove(int i);

	/**
	 * 해당 node를 가져온다.
	 * @param i
	 * @return
	 */
	Object get(int i);

	/**
	 * 사이즈를 가져온다.
	 * @return
	 */
	int size();

}
