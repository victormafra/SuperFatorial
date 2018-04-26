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
			assertTrue("Retornou True.", i.equals(BigInteger.valueOf(1)));
		} catch (InputException e) {
			fail("Deveria retornar 1 e retornou uma exceção.");
		}
		
	}
	
	@Test
	public void testShouldReturn288() {
		SuperFactorial fact = new SuperFactorial();
		try {
			BigInteger i = fact.getSuperFatorial(4);
			assertTrue("Retornou True.", i.equals(BigInteger.valueOf(288)));
		} catch (InputException e) {
			fail("Deveria retornar 288 e retornou uma exceção.");
		}
		
	}

	@Test
	public void testShouldReturn10fact() {
		SuperFactorial fact = new SuperFactorial();
		try {
			BigInteger i = fact.getSuperFatorial(10);
			assertTrue("Retornou True.", i.equals(new BigInteger("6658606584104736522240000000")));
		} catch (InputException e) {
			fail("Deveria retornar 6658606584104736522240000000 e retornou uma exceção.");
		}
		
	}
	
	@Test
	public void testShouldReturn30fact() {
		SuperFactorial fact = new SuperFactorial();
		try {
			BigInteger i = fact.getSuperFatorial(30);
			assertTrue("Retornou True.", i.equals(new BigInteger("57175569823282309673298891912264119180169338781118332321743291765076321254008144131396872292078960659959192198325482132911362592729947392123616011917207641789593790073387400532018296722819386985076346340934659795268591139042209969034895073212504395046756930539546289465059561315582970257772481700025401546634100853798576981016576000000000000000000000000000000000000000000000000000000000000000000000000000000000000000")));
		} catch (InputException e) {
			fail("Deveria retornar 57175569823282309673298891912264119180169338781118332321743291765076321254008144131396872292078960659959192198325482132911362592729947392123616011917207641789593790073387400532018296722819386985076346340934659795268591139042209969034895073212504395046756930539546289465059561315582970257772481700025401546634100853798576981016576000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 e retornou uma exceção.");
		}
		
	}
	
	
	
}
