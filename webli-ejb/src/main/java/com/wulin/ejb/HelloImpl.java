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

import javax.ejb.Stateless;

import com.webli.api.HelloLocal;
import com.wulin.interceptor.annotation.HelloInterceptorBinding;

@Stateless
public class HelloImpl implements HelloLocal{

	@Override
	@HelloInterceptorBinding
	public String helloWorld(String input) {
		return "Hello world" + input;
	}

}
