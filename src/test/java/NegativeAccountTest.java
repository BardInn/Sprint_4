import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class NegativeAccountTest {
	private final String nameTest;

	public NegativeAccountTest(String nameTest){
		this.nameTest = nameTest;
	}

	@Parameterized.Parameters
	public static Object[] setNameTest() {
		return new Object[]{               //наборы тестовых данных
				"Linda Evangelistovna",         //больше верхней раницы
				"0 8",                          //цифры
				"",                             //пустая строка
				"№ ,88",                        //спецсимволы
				"    Алекс Ву",                  //пробелы в начале строки
				"Alex By   ",                    //пробелы в конце строки
				"Alex   By",                       //лишние пробелы в середине
				"georg k.",                        //точка в конце
				"null",                            //нулевое значение
				"СергейЛях",                          //без пробелов
				"Сергей     Лях"                    //табуляция вместо пробела
		};
	}

	@Test
	public void setCorrectNameFormTest (){
		Account account = new Account(nameTest);
		assertFalse(account.checkNameToEmboss());
	}
}
