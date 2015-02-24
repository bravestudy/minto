/**
 * @file    AccessDeniedException.java
 * @brief   접근권한이 없는 리소스에 접근했을 경우 발생하는 Exception
 * @author  개발3/파트3
 * @author  최경진
 * @date    생성 : 2014. 4. 17.
 * @date    최종수정: 2014. 4. 17.
 */
package org.bravestudy.minto.common.certification;

/**
 * @brief AccessDeniedException
 * @author 개발3팀/파트3/최경진
 * @version 1.0
 * @date 생성: 2014. 4. 17.
 * @date 최종수정: 2014. 4. 17.
 * @remark
 */
public class AccessDeniedException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 382049390827156391L;

    public AccessDeniedException() {
        super();
    }

    public AccessDeniedException(String msg) {
        super(msg);
    }
}
