import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class PositiveAccountTest {
	private final String nameTest;

	public PositiveAccountTest(String nameTest){
		this.nameTest = nameTest;
	}

	@Parameterized.Parameters
	public static Object[] setNameTest() {
		return new Object[]{               //наборы тестовых данных
				"Alex ivanov",                //английский алфавит
				"дмитрий Белоусов",            //русский алфавит
				"I K",                         //граничное минимальнодопустимое
				"Зимбицкий Апполинар",          //граничное максимальнодопустимое
				"Liнар Koлбасоff"               // смесь алфавитов
		};
	}

	@Test
	public void setCorrectNameFormTest (){
		Account account = new Account(nameTest);
		assertTrue(account.checkNameToEmboss());
	}
}
