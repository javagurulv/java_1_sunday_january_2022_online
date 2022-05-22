package teacher.lesson_13_exceptions.lessoncode;

public class ClientNotFoundException extends RuntimeException {

	private Long clientId;

	public ClientNotFoundException(Long clientId) {
		this.clientId = clientId;
	}

	public Long getClientId() {
		return clientId;
	}
}
