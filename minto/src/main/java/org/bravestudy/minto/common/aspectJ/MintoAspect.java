package org.bravestudy.minto.common.aspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MintoAspect {

	
	@Before("execution(public * *.index(..))")
	public void beforeAdvice() {
	   System.out.println("==============================================모지 ========================");
	}
	
}
