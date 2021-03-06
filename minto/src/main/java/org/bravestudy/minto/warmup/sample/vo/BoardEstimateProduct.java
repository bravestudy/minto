package org.bravestudy.minto.warmup.sample.vo;

import java.io.Serializable;

/**
 * 게시판_견적 상품리스트 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class BoardEstimateProduct implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 게시판 견적상품 리스트 일련번호. */
	private Long boardEstimateProductSeq;

	/** 게시판_견적. */
	private BoardEstimate boardEstimate;

	/** 상품 아이디 . */
	private Long productId;

	/** 상품 수량. */
	private Short productAmount;

	/**
	 * 생성자.
	 */
	public BoardEstimateProduct() {
	}

	/**
	 * 게시판 견적상품 리스트 일련번호을 설정합니다..
	 * 
	 * @param boardEstimateProductSeq
	 *            게시판 견적상품 리스트 일련번호
	 */
	public void setBoardEstimateProductSeq(Long boardEstimateProductSeq) {
		this.boardEstimateProductSeq = boardEstimateProductSeq;
	}

	/**
	 * 게시판 견적상품 리스트 일련번호을 가져옵니다..
	 * 
	 * @return 게시판 견적상품 리스트 일련번호
	 */
	public Long getBoardEstimateProductSeq() {
		return this.boardEstimateProductSeq;
	}

	/**
	 * 게시판_견적을 설정합니다..
	 * 
	 * @param boardEstimate
	 *            게시판_견적
	 */
	public void setBoardEstimate(BoardEstimate boardEstimate) {
		this.boardEstimate = boardEstimate;
	}

	/**
	 * 게시판_견적을 가져옵니다..
	 * 
	 * @return 게시판_견적
	 */
	public BoardEstimate getBoardEstimate() {
		return this.boardEstimate;
	}

	/**
	 * 상품 아이디 을 설정합니다..
	 * 
	 * @param productId
	 *            상품 아이디 
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * 상품 아이디 을 가져옵니다..
	 * 
	 * @return 상품 아이디 
	 */
	public Long getProductId() {
		return this.productId;
	}

	/**
	 * 상품 수량을 설정합니다..
	 * 
	 * @param productAmount
	 *            상품 수량
	 */
	public void setProductAmount(Short productAmount) {
		this.productAmount = productAmount;
	}

	/**
	 * 상품 수량을 가져옵니다..
	 * 
	 * @return 상품 수량
	 */
	public Short getProductAmount() {
		return this.productAmount;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boardEstimateProductSeq == null) ? 0 : boardEstimateProductSeq.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		BoardEstimateProduct other = (BoardEstimateProduct) obj;
		if (boardEstimateProductSeq == null) {
			if (other.boardEstimateProductSeq != null) {
				return false;
			}
		} else if (!boardEstimateProductSeq.equals(other.boardEstimateProductSeq)) {
			return false;
		}
		return true;
	}

}
