import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;


import static org.junit.Assert.assertFalse;



public class NegativeAccountTest {

	@Test
	@DisplayName("Get longer then maximum string to name")
	@Description("Set String = \"Linda Evangelistovna\"")
	public void setTooLongStringNameTest (){
		String nameTest = "Linda Evangelistovna";
		Account account = new Account(nameTest);
		assertFalse(account.checkNameToEmboss());
	}

	@Test
	@DisplayName("Get numbers to name")
	@Description("Set String = \"0 8\"")
	public void setStringOfNumbersTest (){
		String nameTest = "0 8";
		Account account = new Account(nameTest);
		assertFalse(account.checkNameToEmboss());
	}

	@Test
	@DisplayName("Get negative parameters to name")
	@Description("Set empty string")
	public void setEmptyStringTest (){
		String nameTest = "";
		Account account = new Account(nameTest);
		assertFalse(account.checkNameToEmboss());
	}

	@Test
	@DisplayName("Get special symbol to name")
	@Description("Set String = \"#% $#\"")
	public void setSpecialSymbolTest (){
		String nameTest = "#% $#";
		Account account = new Account(nameTest);
		assertFalse(account.checkNameToEmboss());
	}

	@Test
	@DisplayName("Get spaces before the string to name")
	@Description("Set String =     Алекс Ву")
	public void setSpacesBeforeTheStringTest (){
		String nameTest = "    Алекс Ву";
		Account account = new Account(nameTest);
		assertFalse(account.checkNameToEmboss());
	}

	@Test
	@DisplayName("Get spaces after the string to name")
	@Description("Set String = Alex By   ")
	public void setSpacesAfterTheStringTest (){
		String nameTest = "Alex By   ";
		Account account = new Account(nameTest);
		assertFalse(account.checkNameToEmboss());
	}

	@Test
	@DisplayName("Get extra spaces between  to name")
	@Description("Set String = Alex   By")
	public void setExtraSpacesBetweenTest (){
		String nameTest = "Alex   By";
		Account account = new Account(nameTest);
		assertFalse(account.checkNameToEmboss());
	}

	@Test
	@DisplayName("Get null parameters to name")
	@Description("Set String = null")
	public void setNullStringTest (){
		String nameTest = "null";
		Account account = new Account(nameTest);
		assertFalse(account.checkNameToEmboss());
	}

	@Test
	@DisplayName("Get string without spaces to name")
	@Description("Set String = СергейЛях")
	public void setStringOWithoutSpacesTest (){
		String nameTest = "СергейЛях";
		Account account = new Account(nameTest);
		assertFalse(account.checkNameToEmboss());
	}

	@Test
	@DisplayName("Get negative parameters with tub to name")
	@Description("Set String = Сергей     Лях")
	public void setStringWithTubTest (){
		String nameTest = "Сергей     Лях";
		Account account = new Account(nameTest);
		assertFalse(account.checkNameToEmboss());
	}

}
