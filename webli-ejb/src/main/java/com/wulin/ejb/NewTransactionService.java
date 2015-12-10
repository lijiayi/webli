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

import java.util.concurrent.Callable;

import javax.ejb.*;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class NewTransactionService {

	public Object createNewTransaction(final Callable<Object> task) throws Exception{
		System.out.println("New service being called");
		return task.call();
	}
}
