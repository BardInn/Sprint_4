public class Praktikum {
	public static void main(String[] args) {
        String name = "Тимоте Шаламе";
		Account account = new Account(name);
		if (account.checkNameToEmboss()) {
			System.out.println("Ok, you can print");
		} else {
			System.out.println("Please, check you name");
		}
	}
}
