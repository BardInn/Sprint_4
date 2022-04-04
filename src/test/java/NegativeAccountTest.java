import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class NegativeAccountTest {

	private final String nameTest;

	public NegativeAccountTest(String nameTest) {
		this.nameTest = nameTest;
	}
	@Parameterized.Parameters(name = "Name string parameters{0}")
	public static Object[] setNameTest() {
		return new Object[]{                       //наборы тестовых данных
				"Linda Evangelistovna",
				"0 8",
				"",
				"#% $#",
				"    Алекс Ву",
				"Alex By   ",
				"Alex   By",
				"СергейЛях",
				"Сергей     Лях"
		};
	}

	@Test
	public void setBrokenParametersNameTest (){
		Account account = new Account(nameTest);
		assertFalse(account.checkNameToEmboss());
	}



}
