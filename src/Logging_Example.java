import org.apache.log4j.Logger;
//test
//test
public class Logging_Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// add log4j.jar yessssss
		// add log4j.propertie directly inside the src folder
		// create the object in the code
		
		Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
		APPLICATION_LOGS.debug("hello");
		APPLICATION_LOGS.debug("We are wrinting in to a log file");
		APPLICATION_LOGS.debug("starting the test case xyz test");
		
		
	}

}
