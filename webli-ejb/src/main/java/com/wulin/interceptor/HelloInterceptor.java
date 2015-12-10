/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.wulin.interceptor;

import java.util.concurrent.Callable;

import javax.inject.Inject;
import javax.interceptor.*;

import com.wulin.ejb.NewTransactionService;
import com.wulin.interceptor.annotation.HelloInterceptorBinding;

@HelloInterceptorBinding
@Interceptor
public class HelloInterceptor {
	@Inject
	NewTransactionService newService;

	@AroundInvoke
	public Object modifyBehaviour(final InvocationContext ctx) throws Exception{
			Object result = null;
			try {
				Object[] parameters = ctx.getParameters();
			    String param = (String) parameters[0];
			    param = "[Hello Interceptor]" + param;
			    parameters[0] = param;
			    ctx.setParameters(parameters);
			    result = newService.createNewTransaction(new Callable<Object>(){
            		public Object call() throws Exception{
            			return ctx.proceed();
            		}
            	});
			} catch (Exception e) {
				throw e;
			} 
			
			return result;
	}
}
