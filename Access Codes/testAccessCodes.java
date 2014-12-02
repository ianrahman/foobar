import static org.junit.Assert.*;

import org.junit.Test;


public class testAccessCodes {

	@Test
	public void test() {
		
		String[] input = {"foo", "bar","oof"};
		int realDistinct = 2;
		int myDistinct = Answer.answer(input);
		assertEquals(realDistinct, myDistinct);

		String[] input2 = {"x", "y", "xy", "yyy", "", "yx"};
		int realDistinct = 5;
		int myDistinct = Answer.answer(input2);
		assertEquals(realDistinct, myDistinct);
				
	}

}
