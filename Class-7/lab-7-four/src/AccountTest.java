import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.print.Book;

class AccountTest {

	static Account emptyAccount;
	static Account emptyComparisonAccount;
	static Account filledConstructorTest;
	static String filledConstructorTestAccountNumber;
	static double filledConstructorTestBalance;
	static Account account1;
	static Account account2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		filledConstructorTestAccountNumber = "123456";
		filledConstructorTestBalance = 6500.0;
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {

	}

	@BeforeEach
	void setUp() throws Exception {
		emptyAccount = new Account();
		emptyComparisonAccount  = new Account(null,0.0);
		emptyComparisonAccount.setActive(false);

		// Testing Empty case
		account1 = new Account();
		account2 = new Account(null,0.0);
		account2.setActive(false);
		assertEquals(account1.toString(),account2.toString());

		filledConstructorTest = new Account(filledConstructorTestAccountNumber,filledConstructorTestBalance);
	}

	@AfterEach
	void tearDown() throws Exception {


	}
//add double.max to account balance
// no illegal argument exception thrown for negative numbers in add to balance
	@Test
	void test() {
		//Testing empty constructor account
		assertEquals(emptyAccount.getAccountNumber(), null);
		assertEquals(emptyAccount.isActive(), false);
		assertEquals(emptyAccount.getBalance(), 0);

		assertEquals(emptyAccount.getAccountNumber(), emptyComparisonAccount.getAccountNumber());
		assertEquals(emptyAccount.isActive(), emptyComparisonAccount.isActive());
		assertEquals(emptyAccount.getBalance(), emptyComparisonAccount.getBalance());

		//Testing if constructor with parameters works fine
		assertEquals(filledConstructorTest.getAccountNumber(), filledConstructorTestAccountNumber);
		assertEquals(filledConstructorTest.isActive(), true);
		assertEquals(filledConstructorTest.getBalance(), filledConstructorTestBalance);

		//Add to balance
		filledConstructorTest.addToBalance(0);
		assertEquals(filledConstructorTestBalance, filledConstructorTest.getBalance());

		filledConstructorTest.addToBalance(-500.0);
		assertEquals(filledConstructorTestBalance, filledConstructorTest.getBalance());

		filledConstructorTestBalance+=1500.0;
		filledConstructorTest.addToBalance(1500.0);
		assertEquals(filledConstructorTestBalance, filledConstructorTest.getBalance());


		//Subtract from balance
		filledConstructorTest.subtractFromBalance(0);
		assertEquals(filledConstructorTestBalance, filledConstructorTest.getBalance());

		filledConstructorTest.subtractFromBalance(-3300.0);
		assertEquals(filledConstructorTestBalance, filledConstructorTest.getBalance());

		filledConstructorTestBalance-=1500.0;
		filledConstructorTest.subtractFromBalance(1500.0);
		assertEquals(filledConstructorTestBalance, filledConstructorTest.getBalance());

		//Testing active functions
		assertEquals(emptyAccount.isActive(),false);

		assertEquals(filledConstructorTest.isActive(),true);

		filledConstructorTest.setActive(false);
		assertEquals(filledConstructorTest.isActive(),false);

		filledConstructorTest.setActive(true);
		assertEquals(filledConstructorTest.isActive(),true);

		//Set Balance
		assertEquals(filledConstructorTest.getBalance(),filledConstructorTestBalance);

		filledConstructorTestBalance = 100;
		filledConstructorTest.setBalance(100);
		assertEquals(filledConstructorTest.getBalance(), filledConstructorTestBalance);

		filledConstructorTest.setBalance(-100);
		assertEquals(filledConstructorTest.getBalance(),filledConstructorTestBalance);

		// toString
		assertEquals(filledConstructorTest.toString(), "Account [accountNumber="+filledConstructorTestAccountNumber
				+", balance="+filledConstructorTestBalance+", active="+true+"]");

		assertEquals(emptyAccount.toString(), "Account [accountNumber=null, balance="+0.0+", active="+false+"]");
		//fail("Not yet implemented");

//		assertEquals("HARRY POTTER", b1.getTitle());
//		assertEquals("IT", b2.getTitle());
//
//		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
//			b1 = new Book(null, "rowling", 1996, 700);
//		});
//		assertEquals("a book needs a title!!!", ex.getMessage());
	}

}
