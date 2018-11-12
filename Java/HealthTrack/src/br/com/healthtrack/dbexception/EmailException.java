package br.com.healthtrack.dbexception;

public class EmailException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public EmailException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmailException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}
	
	public EmailException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public EmailException(String message) {
		super(message);
	}
	
	public EmailException(Throwable cause) {
		super(cause);
	}
}
