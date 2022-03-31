import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;


import static org.junit.Assert.assertTrue;


public class PositiveAccountTest {


	@Test
	@DisplayName("Get positive parameters to name")
	@Description("Set String = \"Alex ivanov\"")
	public void setCorrectEnglishNameFormTest (){
		String nameTest = "Alex ivanov";
		Account account = new Account(nameTest);
		assertTrue(account.checkNameToEmboss());
	}

	@Test
	@DisplayName("Get positive parameters to name")
	@Description("Set String = \"дмитрий Белоусов\"")
	public void setCorrectRussianNameFormTest (){
		String nameTest = "дмитрий Белоусов";
		Account account = new Account(nameTest);
		assertTrue(account.checkNameToEmboss());
	}

	@Test
	@DisplayName("Get minimum positive parameters to name")
	@Description("Set String = \"I K\"")
	public void setMinimumCorrectNameFormTest(){
		String nameTest = "I K";
		Account account = new Account(nameTest);
		assertTrue(account.checkNameToEmboss());
	}

	@Test
	@DisplayName("Get maximum positive parameters to name")
	@Description("Set String = \"Зимбицкий Апполинар\"")
	public void setCorrectMaximumNameFormTest (){
		String nameTest = "Зимбицкий Апполинар";
		Account account = new Account(nameTest);
		assertTrue(account.checkNameToEmboss());
	}

}
