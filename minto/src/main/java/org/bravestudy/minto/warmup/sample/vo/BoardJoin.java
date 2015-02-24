package org.bravestudy.minto.warmup.sample.vo;

import java.io.Serializable;

/**
 * 게시판_제휴문의 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class BoardJoin implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 게시판 제휴문의 ID. */
	private Long boardJoinId;

	/** 게시판 게시글. */
	private BoardArticle boardArticle;

	/** 문의형태 . */
	private Object requestType;

	/** 업체명 . */
	private String companyName;

	/** 우편번호. */
	private String zipcode;

	/** 주소1. */
	private String address1;

	/** 주소2. */
	private String address2;

	/** 담당자 이름. */
	private String contactName;

	/** 담당자 핸드폰 . */
	private String contactMobile;

	/** 담당자 이메일주소 . */
	private String contactEmail;

	/** 회사 홈페이지 . */
	private String companyHomepage;

	/** 문의내용. */
	private String contents;

	/**
	 * 생성자.
	 */
	public BoardJoin() {
	}

	/**
	 * 게시판 제휴문의 ID을 설정합니다..
	 * 
	 * @param boardJoinId
	 *            게시판 제휴문의 ID
	 */
	public void setBoardJoinId(Long boardJoinId) {
		this.boardJoinId = boardJoinId;
	}

	/**
	 * 게시판 제휴문의 ID을 가져옵니다..
	 * 
	 * @return 게시판 제휴문의 ID
	 */
	public Long getBoardJoinId() {
		return this.boardJoinId;
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
	 * 문의형태 을 설정합니다..
	 * 
	 * @param requestType
	 *            문의형태 
	 */
	public void setRequestType(Object requestType) {
		this.requestType = requestType;
	}

	/**
	 * 문의형태 을 가져옵니다..
	 * 
	 * @return 문의형태 
	 */
	public Object getRequestType() {
		return this.requestType;
	}

	/**
	 * 업체명 을 설정합니다..
	 * 
	 * @param companyName
	 *            업체명 
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * 업체명 을 가져옵니다..
	 * 
	 * @return 업체명 
	 */
	public String getCompanyName() {
		return this.companyName;
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
	 * 담당자 이름을 설정합니다..
	 * 
	 * @param contactName
	 *            담당자 이름
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	/**
	 * 담당자 이름을 가져옵니다..
	 * 
	 * @return 담당자 이름
	 */
	public String getContactName() {
		return this.contactName;
	}

	/**
	 * 담당자 핸드폰 을 설정합니다..
	 * 
	 * @param contactMobile
	 *            담당자 핸드폰 
	 */
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	/**
	 * 담당자 핸드폰 을 가져옵니다..
	 * 
	 * @return 담당자 핸드폰 
	 */
	public String getContactMobile() {
		return this.contactMobile;
	}

	/**
	 * 담당자 이메일주소 을 설정합니다..
	 * 
	 * @param contactEmail
	 *            담당자 이메일주소 
	 */
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	/**
	 * 담당자 이메일주소 을 가져옵니다..
	 * 
	 * @return 담당자 이메일주소 
	 */
	public String getContactEmail() {
		return this.contactEmail;
	}

	/**
	 * 회사 홈페이지 을 설정합니다..
	 * 
	 * @param companyHomepage
	 *            회사 홈페이지 
	 */
	public void setCompanyHomepage(String companyHomepage) {
		this.companyHomepage = companyHomepage;
	}

	/**
	 * 회사 홈페이지 을 가져옵니다..
	 * 
	 * @return 회사 홈페이지 
	 */
	public String getCompanyHomepage() {
		return this.companyHomepage;
	}

	/**
	 * 문의내용을 설정합니다..
	 * 
	 * @param contents
	 *            문의내용
	 */
	public void setContents(String contents) {
		this.contents = contents;
	}

	/**
	 * 문의내용을 가져옵니다..
	 * 
	 * @return 문의내용
	 */
	public String getContents() {
		return this.contents;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boardJoinId == null) ? 0 : boardJoinId.hashCode());
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
		BoardJoin other = (BoardJoin) obj;
		if (boardJoinId == null) {
			if (other.boardJoinId != null) {
				return false;
			}
		} else if (!boardJoinId.equals(other.boardJoinId)) {
			return false;
		}
		return true;
	}

}
