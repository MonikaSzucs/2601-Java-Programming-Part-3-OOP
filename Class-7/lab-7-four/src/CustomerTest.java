import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {

	static Customer customer1;
	static Account newAccount;
	static Customer customer2;
	static Customer emptyCustomer;
	static Customer emptyCustomer2;
	static Account emptyAccount;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
//		filledConstructorTestAccountNumber = "123456";
//		filledConstructorTestBalance = 6500.0;
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

		assertEquals(customer1.getFirstName(), "Justin");
		assertEquals(customer1.getLastName(), "Bieber");
		assertEquals(customer1.getPasscode(), "yummy");
		assertEquals(customer1.getAccount().toString(), emptyAccount.toString());

		//setAccount test
		customer1.setAccount(newAccount);
		assertEquals(customer1.getAccount().toString(), newAccount.toString());

		//setFirstName
		customer1.setFirstName("");
		assertEquals(customer1.getFirstName(), "Justin");

		customer1.setFirstName(null);
		assertEquals(customer1.getFirstName(), "Justin");

		customer1.setFirstName("Selena");
		assertEquals(customer1.getFirstName(), "Selena");

		//setLastName
		customer1.setLastName("");
		assertEquals(customer1.getLastName(), "Bieber");

		customer1.setLastName(null);
		assertEquals(customer1.getLastName(), "Bieber");

		customer1.setLastName("Gomez");
		assertEquals(customer1.getLastName(), "Gomez");

		//setPasscode
		customer1.setPasscode("");
		assertEquals(customer1.getPasscode(), "yummy");

		customer1.setPasscode(null);
		assertEquals(customer1.getPasscode(), "yummy");

		customer1.setPasscode("loveSong");
		assertEquals(customer1.getPasscode(), "loveSong");

		System.out.println(emptyCustomer.toString());
		assertEquals(customer1.toString(),"Customer [firstName=Selena, lastName=Gomez, passcode=loveSong, " +
				"account="+newAccount.toString()+"]");
		//fail("Not yet implemented");

		assertEquals(emptyCustomer.toString(),"Customer [firstName=null, lastName=null, passcode=null, " +
				"account=null]");
	}

}
