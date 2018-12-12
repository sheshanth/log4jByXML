package com.ac.fi.logger;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

import java.io.IOException;
import java.sql.SQLException;

public class AppDemo {
	static Logger log = Logger.getLogger(AppDemo.class.getClass());
	
	public static void main(String[] args) throws IOException, SQLException {
		
		//PropertyConfigurator.configure("log4j.properties");
		DOMConfigurator.configure("log4j.xml");
		log.trace("Trace Message!");
	    log.debug("Debug Message!");
	    log.info("Info Message!");
	    log.warn("Warn Message!");
	    log.error("Error Message!");
	    log.fatal("Fatal Message!");
		
		
		
	}
	
}
