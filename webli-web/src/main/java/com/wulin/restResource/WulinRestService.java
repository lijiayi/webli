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
package com.wulin.restResource;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import com.webli.api.HelloLocal;

@Path("/bravo")
public class WulinRestService {
	
	@Inject
	HelloLocal hello;
	
	@GET
	@Path("/{param}")
	@Produces("application/json;charset=utf-8")
	public Response printMessage(@PathParam("param") String msg) {

		try {
			return Response.status(200).entity(hello.helloWorld(msg)).build();
		} catch (Exception e) {
			System.out.println("Rest resource catched yoru exception");
			return Response.status(500).entity(e.getMessage()).build();
		}
	}
}
