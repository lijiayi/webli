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
package com.wulin.ejb;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class OUOUInterceptor {
	@AroundInvoke
	public Object modifyBehaviour(final InvocationContext ctx) throws Exception{
			try {
				Object[] parameters = ctx.getParameters();
			    String param = (String) parameters[0];
			    param = "[OUOU Interceptor]" + param;
			    parameters[0] = param;
			    ctx.setParameters(parameters);
				return ctx.proceed();
			} catch (Exception e) {
				throw e;
			}
	}
}
