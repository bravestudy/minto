package org.bravestudy.minto.warmup.sample.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 게시판 게시글 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class BoardArticle implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 게시판 게시글 ID. */
	private Long boardArticleId;

	/** 게시판 타입. */
	private Object boardType;

	/** 부모 게시글 ID. */
	private Long parentBoardArticleId;

	/** 문의유형. */
	private Object askType;

	/** 제목 . */
	private String title;

	/** 내용 . */
	private String contents;

	/** 참고URL. */
	private String referenceUrl;

	/** 조회수. */
	private Integer viewCount;

	/** 노출유무. */
	private Object displayFlag;

	/** 평점. */
	private Short grade;

	/** 등록자 ID. */
	private String createId;

	/** 등록일자. */
	private Date createDate;

	/** 수정자 ID. */
	private String modifyId;

	/** 수정일. */
	private Date modifyDate;

	/** 게시판_견적 목록. */
	private Set<BoardEstimate> boardEstimateSet;

	/** 게시판_게시글_파일 업로드 목록. */
	private Set<BoardArticleFileupload> boardArticleFileuploadSet;

	/** 게시판_제휴문의 목록. */
	private Set<BoardJoin> boardJoinSet;

	/** 게시판_고객센터 목록. */
	private Set<BoardCustomer> boardCustomerSet;

	/** 게시판_AS신청 목록. */
	private Set<BoardAs> boardAsSet;

	/** 게시판_상품문의 목록. */
	private Set<BoardProductQuestion> boardProductQuestionSet;

	/** 게시판 게시글 댓글 목록. */
	private Set<BoardArticleAppend> boardArticleAppendSet;

	/**
	 * 생성자.
	 */
	public BoardArticle() {
		this.boardArticleAppendSet = new HashSet<BoardArticleAppend>();
		this.boardArticleFileuploadSet = new HashSet<BoardArticleFileupload>();
		this.boardAsSet = new HashSet<BoardAs>();
		this.boardCustomerSet = new HashSet<BoardCustomer>();
		this.boardEstimateSet = new HashSet<BoardEstimate>();
		this.boardJoinSet = new HashSet<BoardJoin>();
		this.boardProductQuestionSet = new HashSet<BoardProductQuestion>();
	}

	/**
	 * 게시판 게시글 ID을 설정합니다..
	 * 
	 * @param boardArticleId
	 *            게시판 게시글 ID
	 */
	public void setBoardArticleId(Long boardArticleId) {
		this.boardArticleId = boardArticleId;
	}

	/**
	 * 게시판 게시글 ID을 가져옵니다..
	 * 
	 * @return 게시판 게시글 ID
	 */
	public Long getBoardArticleId() {
		return this.boardArticleId;
	}

	/**
	 * 게시판 타입을 설정합니다..
	 * 
	 * @param boardType
	 *            게시판 타입
	 */
	public void setBoardType(Object boardType) {
		this.boardType = boardType;
	}

	/**
	 * 게시판 타입을 가져옵니다..
	 * 
	 * @return 게시판 타입
	 */
	public Object getBoardType() {
		return this.boardType;
	}

	/**
	 * 부모 게시글 ID을 설정합니다..
	 * 
	 * @param parentBoardArticleId
	 *            부모 게시글 ID
	 */
	public void setParentBoardArticleId(Long parentBoardArticleId) {
		this.parentBoardArticleId = parentBoardArticleId;
	}

	/**
	 * 부모 게시글 ID을 가져옵니다..
	 * 
	 * @return 부모 게시글 ID
	 */
	public Long getParentBoardArticleId() {
		return this.parentBoardArticleId;
	}

	/**
	 * 문의유형을 설정합니다..
	 * 
	 * @param askType
	 *            문의유형
	 */
	public void setAskType(Object askType) {
		this.askType = askType;
	}

	/**
	 * 문의유형을 가져옵니다..
	 * 
	 * @return 문의유형
	 */
	public Object getAskType() {
		return this.askType;
	}

	/**
	 * 제목 을 설정합니다..
	 * 
	 * @param title
	 *            제목 
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 제목 을 가져옵니다..
	 * 
	 * @return 제목 
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * 내용 을 설정합니다..
	 * 
	 * @param contents
	 *            내용 
	 */
	public void setContents(String contents) {
		this.contents = contents;
	}

	/**
	 * 내용 을 가져옵니다..
	 * 
	 * @return 내용 
	 */
	public String getContents() {
		return this.contents;
	}

	/**
	 * 참고URL을 설정합니다..
	 * 
	 * @param referenceUrl
	 *            참고URL
	 */
	public void setReferenceUrl(String referenceUrl) {
		this.referenceUrl = referenceUrl;
	}

	/**
	 * 참고URL을 가져옵니다..
	 * 
	 * @return 참고URL
	 */
	public String getReferenceUrl() {
		return this.referenceUrl;
	}

	/**
	 * 조회수을 설정합니다..
	 * 
	 * @param viewCount
	 *            조회수
	 */
	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	/**
	 * 조회수을 가져옵니다..
	 * 
	 * @return 조회수
	 */
	public Integer getViewCount() {
		return this.viewCount;
	}

	/**
	 * 노출유무을 설정합니다..
	 * 
	 * @param displayFlag
	 *            노출유무
	 */
	public void setDisplayFlag(Object displayFlag) {
		this.displayFlag = displayFlag;
	}

	/**
	 * 노출유무을 가져옵니다..
	 * 
	 * @return 노출유무
	 */
	public Object getDisplayFlag() {
		return this.displayFlag;
	}

	/**
	 * 평점을 설정합니다..
	 * 
	 * @param grade
	 *            평점
	 */
	public void setGrade(Short grade) {
		this.grade = grade;
	}

	/**
	 * 평점을 가져옵니다..
	 * 
	 * @return 평점
	 */
	public Short getGrade() {
		return this.grade;
	}

	/**
	 * 등록자 ID을 설정합니다..
	 * 
	 * @param createId
	 *            등록자 ID
	 */
	public void setCreateId(String createId) {
		this.createId = createId;
	}

	/**
	 * 등록자 ID을 가져옵니다..
	 * 
	 * @return 등록자 ID
	 */
	public String getCreateId() {
		return this.createId;
	}

	/**
	 * 등록일자을 설정합니다..
	 * 
	 * @param createDate
	 *            등록일자
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * 등록일자을 가져옵니다..
	 * 
	 * @return 등록일자
	 */
	public Date getCreateDate() {
		return this.createDate;
	}

	/**
	 * 수정자 ID을 설정합니다..
	 * 
	 * @param modifyId
	 *            수정자 ID
	 */
	public void setModifyId(String modifyId) {
		this.modifyId = modifyId;
	}

	/**
	 * 수정자 ID을 가져옵니다..
	 * 
	 * @return 수정자 ID
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
	 * 게시판_견적 목록을 설정합니다..
	 * 
	 * @param boardEstimateSet
	 *            게시판_견적 목록
	 */
	public void setBoardEstimateSet(Set<BoardEstimate> boardEstimateSet) {
		this.boardEstimateSet = boardEstimateSet;
	}

	/**
	 * 게시판_견적를 추가합니다..
	 * 
	 * @param boardEstimate
	 *            게시판_견적
	 */
	public void addBoardEstimate(BoardEstimate boardEstimate) {
		this.boardEstimateSet.add(boardEstimate);
	}

	/**
	 * 게시판_견적 목록을 가져옵니다..
	 * 
	 * @return 게시판_견적 목록
	 */
	public Set<BoardEstimate> getBoardEstimateSet() {
		return this.boardEstimateSet;
	}

	/**
	 * 게시판_게시글_파일 업로드 목록을 설정합니다..
	 * 
	 * @param boardArticleFileuploadSet
	 *            게시판_게시글_파일 업로드 목록
	 */
	public void setBoardArticleFileuploadSet(Set<BoardArticleFileupload> boardArticleFileuploadSet) {
		this.boardArticleFileuploadSet = boardArticleFileuploadSet;
	}

	/**
	 * 게시판_게시글_파일 업로드를 추가합니다..
	 * 
	 * @param boardArticleFileupload
	 *            게시판_게시글_파일 업로드
	 */
	public void addBoardArticleFileupload(BoardArticleFileupload boardArticleFileupload) {
		this.boardArticleFileuploadSet.add(boardArticleFileupload);
	}

	/**
	 * 게시판_게시글_파일 업로드 목록을 가져옵니다..
	 * 
	 * @return 게시판_게시글_파일 업로드 목록
	 */
	public Set<BoardArticleFileupload> getBoardArticleFileuploadSet() {
		return this.boardArticleFileuploadSet;
	}

	/**
	 * 게시판_제휴문의 목록을 설정합니다..
	 * 
	 * @param boardJoinSet
	 *            게시판_제휴문의 목록
	 */
	public void setBoardJoinSet(Set<BoardJoin> boardJoinSet) {
		this.boardJoinSet = boardJoinSet;
	}

	/**
	 * 게시판_제휴문의를 추가합니다..
	 * 
	 * @param boardJoin
	 *            게시판_제휴문의
	 */
	public void addBoardJoin(BoardJoin boardJoin) {
		this.boardJoinSet.add(boardJoin);
	}

	/**
	 * 게시판_제휴문의 목록을 가져옵니다..
	 * 
	 * @return 게시판_제휴문의 목록
	 */
	public Set<BoardJoin> getBoardJoinSet() {
		return this.boardJoinSet;
	}

	/**
	 * 게시판_고객센터 목록을 설정합니다..
	 * 
	 * @param boardCustomerSet
	 *            게시판_고객센터 목록
	 */
	public void setBoardCustomerSet(Set<BoardCustomer> boardCustomerSet) {
		this.boardCustomerSet = boardCustomerSet;
	}

	/**
	 * 게시판_고객센터를 추가합니다..
	 * 
	 * @param boardCustomer
	 *            게시판_고객센터
	 */
	public void addBoardCustomer(BoardCustomer boardCustomer) {
		this.boardCustomerSet.add(boardCustomer);
	}

	/**
	 * 게시판_고객센터 목록을 가져옵니다..
	 * 
	 * @return 게시판_고객센터 목록
	 */
	public Set<BoardCustomer> getBoardCustomerSet() {
		return this.boardCustomerSet;
	}

	/**
	 * 게시판_AS신청 목록을 설정합니다..
	 * 
	 * @param boardAsSet
	 *            게시판_AS신청 목록
	 */
	public void setBoardAsSet(Set<BoardAs> boardAsSet) {
		this.boardAsSet = boardAsSet;
	}

	/**
	 * 게시판_AS신청를 추가합니다..
	 * 
	 * @param boardAs
	 *            게시판_AS신청
	 */
	public void addBoardAs(BoardAs boardAs) {
		this.boardAsSet.add(boardAs);
	}

	/**
	 * 게시판_AS신청 목록을 가져옵니다..
	 * 
	 * @return 게시판_AS신청 목록
	 */
	public Set<BoardAs> getBoardAsSet() {
		return this.boardAsSet;
	}

	/**
	 * 게시판_상품문의 목록을 설정합니다..
	 * 
	 * @param boardProductQuestionSet
	 *            게시판_상품문의 목록
	 */
	public void setBoardProductQuestionSet(Set<BoardProductQuestion> boardProductQuestionSet) {
		this.boardProductQuestionSet = boardProductQuestionSet;
	}

	/**
	 * 게시판_상품문의를 추가합니다..
	 * 
	 * @param boardProductQuestion
	 *            게시판_상품문의
	 */
	public void addBoardProductQuestion(BoardProductQuestion boardProductQuestion) {
		this.boardProductQuestionSet.add(boardProductQuestion);
	}

	/**
	 * 게시판_상품문의 목록을 가져옵니다..
	 * 
	 * @return 게시판_상품문의 목록
	 */
	public Set<BoardProductQuestion> getBoardProductQuestionSet() {
		return this.boardProductQuestionSet;
	}

	/**
	 * 게시판 게시글 댓글 목록을 설정합니다..
	 * 
	 * @param boardArticleAppendSet
	 *            게시판 게시글 댓글 목록
	 */
	public void setBoardArticleAppendSet(Set<BoardArticleAppend> boardArticleAppendSet) {
		this.boardArticleAppendSet = boardArticleAppendSet;
	}

	/**
	 * 게시판 게시글 댓글를 추가합니다..
	 * 
	 * @param boardArticleAppend
	 *            게시판 게시글 댓글
	 */
	public void addBoardArticleAppend(BoardArticleAppend boardArticleAppend) {
		this.boardArticleAppendSet.add(boardArticleAppend);
	}

	/**
	 * 게시판 게시글 댓글 목록을 가져옵니다..
	 * 
	 * @return 게시판 게시글 댓글 목록
	 */
	public Set<BoardArticleAppend> getBoardArticleAppendSet() {
		return this.boardArticleAppendSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boardArticleId == null) ? 0 : boardArticleId.hashCode());
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
		BoardArticle other = (BoardArticle) obj;
		if (boardArticleId == null) {
			if (other.boardArticleId != null) {
				return false;
			}
		} else if (!boardArticleId.equals(other.boardArticleId)) {
			return false;
		}
		return true;
	}

}