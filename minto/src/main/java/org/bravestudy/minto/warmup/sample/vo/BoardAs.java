package org.bravestudy.minto.warmup.sample.vo;

import java.io.Serializable;

/**
 * 게시판_AS신청 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class BoardAs implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 게시판 AS ID. */
	private Long boardAsId;

	/** 게시판 게시글. */
	private BoardArticle boardArticle;

	/** AS 분류. */
	private Object asType;

	/** 주문 ID. */
	private Long orderId;

	/** 이름. */
	private String name;

	/** 핸드폰. */
	private String mobile;

	/** 이메일. */
	private String email;

	/** 우편번호. */
	private String zipcode;

	/** 주소1. */
	private String address1;

	/** 주소2. */
	private String address2;

	/** 접수방법 . */
	private Object receiptType;

	/** 수령방법 . */
	private Object givenType;

	/** 증상입력. */
	private String contents;

	/** 첨부 파일 유무 . */
	private Object fileAppendFlag;

	/**
	 * 생성자.
	 */
	public BoardAs() {
	}

	/**
	 * 게시판 AS ID을 설정합니다..
	 * 
	 * @param boardAsId
	 *            게시판 AS ID
	 */
	public void setBoardAsId(Long boardAsId) {
		this.boardAsId = boardAsId;
	}

	/**
	 * 게시판 AS ID을 가져옵니다..
	 * 
	 * @return 게시판 AS ID
	 */
	public Long getBoardAsId() {
		return this.boardAsId;
	}

	/**
	 * 게시판 게시글을 설정합니다..
	 * 
	 * @param boardArticle
	 *            게시판 게시글
	 */
	public void setBoardArticle(BoardArticle boardArticle) {
		this.boardArticle = boardArticle;
	}

	/**
	 * 게시판 게시글을 가져옵니다..
	 * 
	 * @return 게시판 게시글
	 */
	public BoardArticle getBoardArticle() {
		return this.boardArticle;
	}

	/**
	 * AS 분류을 설정합니다..
	 * 
	 * @param asType
	 *            AS 분류
	 */
	public void setAsType(Object asType) {
		this.asType = asType;
	}

	/**
	 * AS 분류을 가져옵니다..
	 * 
	 * @return AS 분류
	 */
	public Object getAsType() {
		return this.asType;
	}

	/**
	 * 주문 ID을 설정합니다..
	 * 
	 * @param orderId
	 *            주문 ID
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * 주문 ID을 가져옵니다..
	 * 
	 * @return 주문 ID
	 */
	public Long getOrderId() {
		return this.orderId;
	}

	/**
	 * 이름을 설정합니다..
	 * 
	 * @param name
	 *            이름
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 이름을 가져옵니다..
	 * 
	 * @return 이름
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 핸드폰을 설정합니다..
	 * 
	 * @param mobile
	 *            핸드폰
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 핸드폰을 가져옵니다..
	 * 
	 * @return 핸드폰
	 */
	public String getMobile() {
		return this.mobile;
	}

	/**
	 * 이메일을 설정합니다..
	 * 
	 * @param email
	 *            이메일
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 이메일을 가져옵니다..
	 * 
	 * @return 이메일
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * 우편번호을 설정합니다..
	 * 
	 * @param zipcode
	 *            우편번호
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * 우편번호을 가져옵니다..
	 * 
	 * @return 우편번호
	 */
	public String getZipcode() {
		return this.zipcode;
	}

	/**
	 * 주소1을 설정합니다..
	 * 
	 * @param address1
	 *            주소1
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * 주소1을 가져옵니다..
	 * 
	 * @return 주소1
	 */
	public String getAddress1() {
		return this.address1;
	}

	/**
	 * 주소2을 설정합니다..
	 * 
	 * @param address2
	 *            주소2
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * 주소2을 가져옵니다..
	 * 
	 * @return 주소2
	 */
	public String getAddress2() {
		return this.address2;
	}

	/**
	 * 접수방법 을 설정합니다..
	 * 
	 * @param receiptType
	 *            접수방법 
	 */
	public void setReceiptType(Object receiptType) {
		this.receiptType = receiptType;
	}

	/**
	 * 접수방법 을 가져옵니다..
	 * 
	 * @return 접수방법 
	 */
	public Object getReceiptType() {
		return this.receiptType;
	}

	/**
	 * 수령방법 을 설정합니다..
	 * 
	 * @param givenType
	 *            수령방법 
	 */
	public void setGivenType(Object givenType) {
		this.givenType = givenType;
	}

	/**
	 * 수령방법 을 가져옵니다..
	 * 
	 * @return 수령방법 
	 */
	public Object getGivenType() {
		return this.givenType;
	}

	/**
	 * 증상입력을 설정합니다..
	 * 
	 * @param contents
	 *            증상입력
	 */
	public void setContents(String contents) {
		this.contents = contents;
	}

	/**
	 * 증상입력을 가져옵니다..
	 * 
	 * @return 증상입력
	 */
	public String getContents() {
		return this.contents;
	}

	/**
	 * 첨부 파일 유무 을 설정합니다..
	 * 
	 * @param fileAppendFlag
	 *            첨부 파일 유무 
	 */
	public void setFileAppendFlag(Object fileAppendFlag) {
		this.fileAppendFlag = fileAppendFlag;
	}

	/**
	 * 첨부 파일 유무 을 가져옵니다..
	 * 
	 * @return 첨부 파일 유무 
	 */
	public Object getFileAppendFlag() {
		return this.fileAppendFlag;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boardAsId == null) ? 0 : boardAsId.hashCode());
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
		BoardAs other = (BoardAs) obj;
		if (boardAsId == null) {
			if (other.boardAsId != null) {
				return false;
			}
		} else if (!boardAsId.equals(other.boardAsId)) {
			return false;
		}
		return true;
	}

}