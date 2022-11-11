import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * CustomerTest.java
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Fall 2022
 * Lab #7
 *
 * @author Monika Szucs
 * @author Guilherme Trevisan
 * @version 1.1
 *
 */
class CustomerTest {

	static Customer customer1;
	static Account newAccount;
	static Customer emptyCustomer;
	static Customer emptyCustomer2;
	static Account emptyAccount;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {

	}

	@BeforeEach
	void setUp() throws Exception {
		emptyCustomer = new Customer();
		emptyCustomer2 = new Customer(null, null, null);
		emptyAccount = new Account();
		customer1 = new Customer("Justin", "Bieber", "yummy");
		customer1.setAccount(new Account());
		newAccount = new Account("12345", 5000);
	}

	@AfterEach
	void tearDown() throws Exception {

	}

	@Test
	void test() {
		assertEquals(null, emptyCustomer.getFirstName());
		assertEquals(null, emptyCustomer.getLastName());
		assertEquals(null, emptyCustomer.getAccount());
		assertEquals(null, emptyCustomer.getPasscode());


		assertEquals(emptyCustomer2.getFirstName(), emptyCustomer.getFirstName());
		assertEquals(emptyCustomer2.getLastName(), emptyCustomer.getLastName());
		assertEquals(emptyCustomer2.getAccount(), emptyCustomer.getAccount());
		assertEquals(emptyCustomer2.getPasscode(), emptyCustomer.getPasscode());

		assertEquals("Justin", customer1.getFirstName());
		assertEquals("Bieber", customer1.getLastName());
		assertEquals("yummy", customer1.getPasscode());
		assertEquals(emptyAccount.toString(), customer1.getAccount().toString());

		//setAccount test
		customer1.setAccount(newAccount);
		assertEquals(newAccount.toString(), customer1.getAccount().toString());

		//setFirstName
		customer1.setFirstName("");
		assertEquals("Justin", customer1.getFirstName());

		customer1.setFirstName(null);
		assertEquals("Justin", customer1.getFirstName());

		customer1.setFirstName("Selena");
		assertEquals("Selena", customer1.getFirstName());

		//setLastName
		customer1.setLastName("");
		assertEquals("Bieber", customer1.getLastName());

		customer1.setLastName(null);
		assertEquals("Bieber", customer1.getLastName());

		customer1.setLastName("Gomez");
		assertEquals("Gomez", customer1.getLastName());

		//setPasscode
		customer1.setPasscode("");
		assertEquals("yummy", customer1.getPasscode());

		customer1.setPasscode(null);
		assertEquals("yummy", customer1.getPasscode());

		customer1.setPasscode("loveSong");
		assertEquals("loveSong", customer1.getPasscode());

		System.out.println(emptyCustomer.toString());
		assertEquals("Customer [firstName=Selena, lastName=Gomez, passcode=loveSong, " +
				"account="+newAccount.toString()+"]", customer1.toString());

		assertEquals("Customer [firstName=null, lastName=null, passcode=null, " +
				"account=null]", emptyCustomer.toString());
	}
}
