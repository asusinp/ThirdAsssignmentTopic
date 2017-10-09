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
public class AndroidTabletTest {
	
	AndroidTablet nexus;

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
		nexus = new AndroidTablet("Google", "Nexus 7", 100);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		nexus = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.thirdassignmenttopic.DeviceImpl#overclock()}.
	 */
	@Test
	public void testOverclock() throws Exception {
		assertEquals(150, nexus.overclock(), 1.0e-4);
	}

}
