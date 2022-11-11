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
		assertEquals(emptyCustomer.getFirstName(), null);
		assertEquals(emptyCustomer.getLastName(), null);
		assertEquals(emptyCustomer.getAccount(), null);
		assertEquals(emptyCustomer.getPasscode(), null);


		assertEquals(emptyCustomer.getFirstName(), emptyCustomer2.getFirstName());
		assertEquals(emptyCustomer.getLastName(), emptyCustomer2.getLastName());
		assertEquals(emptyCustomer.getAccount(), emptyCustomer2.getAccount());
		assertEquals(emptyCustomer.getPasscode(), emptyCustomer2.getPasscode());

		assertEquals("Justin", customer1.getFirstName());
		assertEquals("Bieber", customer1.getLastName());
		assertEquals("yummy", customer1.getPasscode());
		assertEquals(customer1.getAccount().toString(), emptyAccount.toString());

		//setAccount test
		customer1.setAccount(newAccount);
		assertEquals(customer1.getAccount().toString(), newAccount.toString());

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
		assertEquals(customer1.toString(),"Customer [firstName=Selena, lastName=Gomez, passcode=loveSong, " +
				"account="+newAccount.toString()+"]");

		assertEquals(emptyCustomer.toString(),"Customer [firstName=null, lastName=null, passcode=null, " +
				"account=null]");
	}
}
