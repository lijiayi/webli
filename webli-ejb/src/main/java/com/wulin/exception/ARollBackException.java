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
package com.wulin.exception;

import javax.ejb.ApplicationException;

@ApplicationException(rollback=true)
public class ARollBackException extends RuntimeException {

	/**
	 * @param string
	 */
	public ARollBackException(String string) {
		super(string);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -48527461937639892L;

}
