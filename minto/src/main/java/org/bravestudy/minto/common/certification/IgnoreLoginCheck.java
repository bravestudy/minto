/**
 * @file IgnoreLoginCheck.java
 * @brief 인증여부 체크 제외시 추가하는 annotation 
 * @author 개발3/파트3
 * @author  최경진
 * @date 생성 : 2014-04-17
 * @date 최종수정: 2014-04-17
 */
package org.bravestudy.minto.common.certification;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @brief IgnoreLoginCheck
 * @author 개발3팀/파트3/최경진
 * @version 1.0
 * @date 생성: 2014. 4. 17.
 * @date 최종수정: 2014. 4. 17.
 * @remark
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreLoginCheck {
}
