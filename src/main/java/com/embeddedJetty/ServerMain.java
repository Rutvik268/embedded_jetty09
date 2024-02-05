package com.embeddedJetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class ServerMain {
	public static void main(String[] args) throws Exception {
		
		Server server = new Server(8680);       
        
        ServletHandler servletHandler = new ServletHandler();
        server.setHandler(servletHandler);
                 
        servletHandler.addServletWithMapping(HelloServlet.class, "/");

		server.start();
		System.out.println("Server Stated Successfully!!! ");
		
		server.join();	
	}

}
