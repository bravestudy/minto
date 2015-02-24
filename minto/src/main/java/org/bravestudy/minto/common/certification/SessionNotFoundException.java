/**
 * @file    AccessDeniedException.java
 * @brief   로그인을 하지 않았거나 세션이 끊긴 경우 발생하는 Exception
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
public class SessionNotFoundException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -5968061856227840420L;

    public SessionNotFoundException() {
        super();
    }

    public SessionNotFoundException(String msg) {
        super(msg);
    }
}
