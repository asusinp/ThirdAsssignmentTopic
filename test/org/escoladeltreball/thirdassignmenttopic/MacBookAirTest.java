/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author iaw21752927
 *
 */
public class MacBookAirTest {

	MacBookAir mac;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		mac = new MacBookAir("Apple", "Air Turbo", 100);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		mac = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.thirdassignmenttopic.DeviceImpl#overclock()}.
	 */
	@Test
	public void testOverclock() throws Exception {
		assertEquals(150, mac.overclock(), 1.0e-4);
		MacBookAir macClone = (MacBookAir)mac.clone();
		assertNotSame(mac, macClone);
		assertTrue(mac.getSpeed() == 100);
	}

}
