package com.mycompany.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        new App().testLoggingLevel();
    }
    
    
    public void testLoggingLevel(){
        logger.debug("Debug message in SampleClass");
        logger.error("Error message in SampleClass");
        logger.fatal("Fatal message in SampleClass");
        logger.info("Info message in SampleClass");
        logger.trace("Trace message in SampleClass");
        logger.warn("Warn message in SampleClass");
        
    }    
}
