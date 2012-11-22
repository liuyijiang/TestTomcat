package org.test.exc3.startup;

import org.test.exc3.connector.http.HttpConnector;

public final class Bootstrap {
	
	  public static void main(String[] args) {
	    HttpConnector connector = new HttpConnector();
	    connector.start();
	  }
}
