package com.library.aspect;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect {
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[LOG] Before: " + joinPoint.getSignature().getName());
    }
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("[LOG] After: " + joinPoint.getSignature().getName());
    }
}
