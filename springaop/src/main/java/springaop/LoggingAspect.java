package springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	
	@Before("execution(* springaop.ProductService.multiply(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("before calling the method");
	}
	
	@After("execution(* springaop.ProductService.multiply(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("after calling the method");
	}
		
	@After("execution(protected * springaop.ProductService.display()))")
	public void logAfter1(JoinPoint joinPoint) {
		System.out.println("after calling the method..");
	}

	

}
