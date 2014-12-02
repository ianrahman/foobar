import static org.junit.Assert.*;

import org.junit.Test;


public class testRustyCalculator {

	@Test
	public void test() {
		
		String realAnswer = "232*+";
		
		String str = "2+3*2";
		String myAnswer = rustyCalculator.answer(str);
		
		assertEquals(realAnswer, myAnswer);
		
		realAnswer = "243**93*5++";
		
		str = "2*4*3+9*3+5";
		myAnswer = rustyCalculator.answer(str);
		
		assertEquals(realAnswer, myAnswer);
		
		
		
	}

}
