

public class Account {
	private final String name;

	public Account(String name) {
		this.name = name;
	}


	public boolean checkNameToEmboss() {
		String trimName = name.trim();
		if (trimName.length() >= 3 && trimName.length() <= 19) {
			int countWhitespace = name.length() - trimName.replace(" ", "").length();
			if (countWhitespace == 1) return name.matches("^[А-Яа-яЁёa-zA-Z\\s]*$");
		}
		return false;
	}


}
