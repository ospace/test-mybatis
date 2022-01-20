package com.tistory.ospace.test.annotation;

import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.IntroductionInterceptor;

public class TimeLogInterceptor implements IntroductionInterceptor {
	private static final Logger LOGGER = LoggerFactory.getLogger(TimeLogInterceptor.class);
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String args = "";
		for(Object arg : invocation.getArguments()) {
			if(!args.isEmpty()) args = args.concat(",");
			args = args.concat(null == arg ? "null" : arg.toString());
		}
		
		String objName[] = invocation.getStaticPart().toString().split(" ");
		int idx = objName[2].lastIndexOf('.');
		idx = objName[2].lastIndexOf('.', idx-1);
		String className = objName[2].substring(idx+1);
		LOGGER.info("BEGIN {}: arguments[{}]", className, args);
		
		long begin = System.currentTimeMillis();
		Object ret = invocation.proceed();
		long end = System.currentTimeMillis();
		
		LOGGER.info("END   {}: runtime [{} msec]", className, (end-begin));
		
		return ret;
	}

	@Override
	public boolean implementsInterface(Class<?> arg0) {
		return false;
	}
}
