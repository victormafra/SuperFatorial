import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

import br.edu.udesc.business.SuperFactorial;
import br.edu.udesc.exceptions.InputException;


public class SuperFatorialTest {

	@Test
	public void testShouldReturnOne() {
		SuperFactorial fact = new SuperFactorial();
		try {
			BigInteger i = fact.getSuperFatorial(1);	
			assertTrue("Retornou 1.", i.equals(BigInteger.valueOf(1)));
		} catch (InputException e) {
			fail("Deveria retornar 1 e retornou uma exceção.");
		}
		
	}

}
