package org.bravestudy.minto.warmup.sample.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 상담접수게시판 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class BoardCounsel implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 상담번호. */
	private Long counselSeq;

	/** 상담유형. */
	private String counselType;

	/** 상담상태. */
	private String counselStatus;

	/** 접수자. */
	private Long responsePerson;

	/** 요청자. */
	private Long requestPerson;

	/** 주문번호. */
	private Long orderCode;

	/** 생성자. */
	private String createId;

	/** 생성일. */
	private Date createDate;

	/** 수정자. */
	private String modifyId;

	/** 수정일. */
	private Date modifyDate;

	/** 상담내용 목록. */
	private Set<CounselContent> counselContentSet;

	/**
	 * 생성자.
	 */
	public BoardCounsel() {
		this.counselContentSet = new HashSet<CounselContent>();
	}

	/**
	 * 상담번호을 설정합니다..
	 * 
	 * @param counselSeq
	 *            상담번호
	 */
	public void setCounselSeq(Long counselSeq) {
		this.counselSeq = counselSeq;
	}

	/**
	 * 상담번호을 가져옵니다..
	 * 
	 * @return 상담번호
	 */
	public Long getCounselSeq() {
		return this.counselSeq;
	}

	/**
	 * 상담유형을 설정합니다..
	 * 
	 * @param counselType
	 *            상담유형
	 */
	public void setCounselType(String counselType) {
		this.counselType = counselType;
	}

	/**
	 * 상담유형을 가져옵니다..
	 * 
	 * @return 상담유형
	 */
	public String getCounselType() {
		return this.counselType;
	}

	/**
	 * 상담상태을 설정합니다..
	 * 
	 * @param counselStatus
	 *            상담상태
	 */
	public void setCounselStatus(String counselStatus) {
		this.counselStatus = counselStatus;
	}

	/**
	 * 상담상태을 가져옵니다..
	 * 
	 * @return 상담상태
	 */
	public String getCounselStatus() {
		return this.counselStatus;
	}

	/**
	 * 접수자을 설정합니다..
	 * 
	 * @param responsePerson
	 *            접수자
	 */
	public void setResponsePerson(Long responsePerson) {
		this.responsePerson = responsePerson;
	}

	/**
	 * 접수자을 가져옵니다..
	 * 
	 * @return 접수자
	 */
	public Long getResponsePerson() {
		return this.responsePerson;
	}

	/**
	 * 요청자을 설정합니다..
	 * 
	 * @param requestPerson
	 *            요청자
	 */
	public void setRequestPerson(Long requestPerson) {
		this.requestPerson = requestPerson;
	}

	/**
	 * 요청자을 가져옵니다..
	 * 
	 * @return 요청자
	 */
	public Long getRequestPerson() {
		return this.requestPerson;
	}

	/**
	 * 주문번호을 설정합니다..
	 * 
	 * @param orderCode
	 *            주문번호
	 */
	public void setOrderCode(Long orderCode) {
		this.orderCode = orderCode;
	}

	/**
	 * 주문번호을 가져옵니다..
	 * 
	 * @return 주문번호
	 */
	public Long getOrderCode() {
		return this.orderCode;
	}

	/**
	 * 생성자을 설정합니다..
	 * 
	 * @param createId
	 *            생성자
	 */
	public void setCreateId(String createId) {
		this.createId = createId;
	}

	/**
	 * 생성자을 가져옵니다..
	 * 
	 * @return 생성자
	 */
	public String getCreateId() {
		return this.createId;
	}

	/**
	 * 생성일을 설정합니다..
	 * 
	 * @param createDate
	 *            생성일
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * 생성일을 가져옵니다..
	 * 
	 * @return 생성일
	 */
	public Date getCreateDate() {
		return this.createDate;
	}

	/**
	 * 수정자을 설정합니다..
	 * 
	 * @param modifyId
	 *            수정자
	 */
	public void setModifyId(String modifyId) {
		this.modifyId = modifyId;
	}

	/**
	 * 수정자을 가져옵니다..
	 * 
	 * @return 수정자
	 */
	public String getModifyId() {
		return this.modifyId;
	}

	/**
	 * 수정일을 설정합니다..
	 * 
	 * @param modifyDate
	 *            수정일
	 */
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	/**
	 * 수정일을 가져옵니다..
	 * 
	 * @return 수정일
	 */
	public Date getModifyDate() {
		return this.modifyDate;
	}

	/**
	 * 상담내용 목록을 설정합니다..
	 * 
	 * @param counselContentSet
	 *            상담내용 목록
	 */
	public void setCounselContentSet(Set<CounselContent> counselContentSet) {
		this.counselContentSet = counselContentSet;
	}

	/**
	 * 상담내용를 추가합니다..
	 * 
	 * @param counselContent
	 *            상담내용
	 */
	public void addCounselContent(CounselContent counselContent) {
		this.counselContentSet.add(counselContent);
	}

	/**
	 * 상담내용 목록을 가져옵니다..
	 * 
	 * @return 상담내용 목록
	 */
	public Set<CounselContent> getCounselContentSet() {
		return this.counselContentSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((counselSeq == null) ? 0 : counselSeq.hashCode());
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
		BoardCounsel other = (BoardCounsel) obj;
		if (counselSeq == null) {
			if (other.counselSeq != null) {
				return false;
			}
		} else if (!counselSeq.equals(other.counselSeq)) {
			return false;
		}
		return true;
	}

}
