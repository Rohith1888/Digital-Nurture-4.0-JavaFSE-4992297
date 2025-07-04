package com.library.aspect;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect {

    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[LOG BEFORE] Method called: " + joinPoint.getSignature().getName());
    }

    public void logAfter(JoinPoint joinPoint) {
        System.out.println("[LOG AFTER] Method finished: " + joinPoint.getSignature().getName());
    }
}
