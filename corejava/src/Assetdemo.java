import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.Test;


public class Assetdemo {
	@Test
	public void testforassertequals() {
		
		int res=1;
		int exp=1;
		assertEquals(exp, res);
	}
	@Test
	void  assettrue() {
		assertTrue("hello".contains("e"));
	}
	@Test
	void testNull() {
		String n=null;
		assertNull(n);
	}

}
