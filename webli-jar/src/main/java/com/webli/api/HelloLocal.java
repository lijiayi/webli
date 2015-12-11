package com.webli.api;
import javax.ejb.Local;

@Local
public interface HelloLocal {
	String helloWorld(final String input) throws Exception;
}
