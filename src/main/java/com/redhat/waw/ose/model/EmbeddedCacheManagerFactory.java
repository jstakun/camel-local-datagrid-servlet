package com.redhat.waw.ose.model;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.infinispan.manager.EmbeddedCacheManager;

public class EmbeddedCacheManagerFactory {
	 
	 public EmbeddedCacheManager newEmbeddedCacheManager() throws NamingException {
		 Context context = new InitialContext();
		 return (EmbeddedCacheManager) context.lookup("java:jboss/infinispan/transactionsCacheManager");
	 } 
}
