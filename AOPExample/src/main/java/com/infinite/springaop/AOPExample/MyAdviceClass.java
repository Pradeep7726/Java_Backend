package com.infinite.springaop.AOPExample;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect // aspect is for class level annotation
public class MyAdviceClass {
	@Pointcut("execution(* com.infinite.springaop.*.*(..))")
	private void All() {
	}

	@Before("All()") // Before is for method level annotation
	public void beforeAdvice() {
		System.out.println("Before advice executed.");
	}

	@After("All()") // method level annotation
	public void afterAdvice() {
		System.out.println("After advice executed.");
	}

}
