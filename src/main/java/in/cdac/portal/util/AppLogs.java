package in.cdac.portal.util;



import javax.annotation.PostConstruct;

//import org.apache.log4j.LogManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * Centralized logging class
 * @author C-DAC
 *
 */
@Service
public class AppLogs
{
	private static final Logger logger = LogManager.getLogger( AppLogs.class );
	@Autowired
	Environment env;
	private static Boolean appLogs;

	@PostConstruct
	public void initLogConfig()
	{
		appLogs=Boolean.parseBoolean(env.getProperty("applogs"));
	}

	/**
	 * Method to log success and error messages 
	 * @param txnRecord
	 * @param timeTaken
	 */
	public static void logMessage( String resp, boolean success)
	{
		if (appLogs)
		{
			if(success)
			{
				logger.info(" TT:"+resp);
			}
			else
			{
				logger.info(" TT:"+resp);
			}
		}
	}
}
