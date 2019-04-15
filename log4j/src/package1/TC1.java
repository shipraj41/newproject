package package1;

import org.apache.logging.log4j.*;

public class TC1 {
	
	private static Logger log = LogManager.getLogger(TC1.class.getName());
	
	public static void main(String[] args)
	{
		
		log.debug("Link clicked");
		log.info("Checking the condition");
		if(3>1)
		{
			log.debug("test case is passed");
			log.error("test case is failed");
		}
		
		
		
		
		
		
		
	}

}
