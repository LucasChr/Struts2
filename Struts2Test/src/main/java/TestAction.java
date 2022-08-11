
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 * 
 * @author Lucas Chaves
 *
 * 10 de ago. de 2022 - Struts2Test
 */
public class TestAction {

	String message;
	Logger logger;
	
	/**
	 * Executa a Action 
	 * @return
	 */
	public String execute() {

		logger.log(Level.INFO ,"execute method called");
		return "error";
	}

	/**
	 * 
	 * @return String message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
}
