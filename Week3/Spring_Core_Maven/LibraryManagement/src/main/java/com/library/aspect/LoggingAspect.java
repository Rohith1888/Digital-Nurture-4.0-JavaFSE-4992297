package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	 @Around("execution(* com.library.service.*.*(..))")
	    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
	        long start = System.currentTimeMillis();

	        Object result = joinPoint.proceed();

	        long end = System.currentTimeMillis();
	        System.out.println("[LOG] Execution of " + joinPoint.getSignature() + " took " + (end - start) + " ms");

	        return result;
	    }
}
