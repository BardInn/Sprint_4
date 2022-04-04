import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class PositiveAccountTest {
	
	private final String nameTest;

	public PositiveAccountTest(String nameTest) {
		this.nameTest = nameTest;
	}
	@Parameterized.Parameters(name = "Name string parameters = {0}")
	public static Object[] setNameTest() {
		return new Object[]{
				"Alex ivanov",
				"дмитрий Белоусов",
				"I K",
				"Зимбицкий Апполинар"
		};
	}

	@Test
	public void setCorrectNameFormTest (){
		Account account = new Account(nameTest);
		assertTrue(account.checkNameToEmboss());
	}


}
