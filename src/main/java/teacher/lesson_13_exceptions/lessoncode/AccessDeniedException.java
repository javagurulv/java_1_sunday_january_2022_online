package teacher.lesson_13_exceptions.lessoncode;

public class AccessDeniedException extends Exception {

	private String invalidSecurityKey;

	public AccessDeniedException(String message, String invalidSequrityKey) {
		super(message);
		this.invalidSecurityKey = invalidSequrityKey;
	}

	public String getInvalidSecurityKey() {
		return invalidSecurityKey;
	}
}
