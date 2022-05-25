package teacher.lesson_13_exceptions.lessoncode;

import java.util.Optional;

public class BankApi {

	public Optional<String> getClientFullName(String seсurityKey,
											  Long clientId)
				throws AccessDeniedException {
		if (seсurityKey == null || !seсurityKey.equals("abcd")) {
			//AccessDeniedException exception = new AccessDeniedException("Invalid sequrity key", seсurityKey);
			//throw exception;
			throw new AccessDeniedException("Invalid sequrity key", seсurityKey);
		}
		if (clientId == 1L) {
			return Optional.of("Petja");
		} else {
			return Optional.empty();
		}
	}

	public static void main(String[] args) throws AccessDeniedException {
		try {
			BankApi bankApi = new BankApi();
			Optional<String> result = bankApi.getClientFullName("sds", 1L);
			if (result.isEmpty()) {
				System.out.println("Client not found");
			} else {
				System.out.println("Client full name " + result.get());
			}
		} catch (AccessDeniedException exception) {
			System.out.println(exception.getMessage());
			System.out.println(exception.getInvalidSecurityKey());
		} finally {
			System.out.println("Finally");
		}
	}

}
