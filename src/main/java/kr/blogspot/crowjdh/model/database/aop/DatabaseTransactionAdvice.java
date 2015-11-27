package kr.blogspot.crowjdh.model.database.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class DatabaseTransactionAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object result = null;
		try {
			System.out.println("Begin database transaction.");
			result = invocation.proceed();
			System.out.println("End database transaction.");
		} catch(Exception ignored) { }
		
		return result;
	}

}
