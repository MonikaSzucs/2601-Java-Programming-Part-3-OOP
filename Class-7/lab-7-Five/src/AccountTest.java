import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.print.Book;

/**
 * AccountTest.java
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
		assertEquals(account2.toString(), account1.toString());

		filledConstructorTest = new Account(filledConstructorTestAccountNumber,filledConstructorTestBalance);
	}

	@AfterEach
	void tearDown() throws Exception {

	}

	@Test
	void test() {
		//Testing empty constructor account
		assertEquals(null, emptyAccount.getAccountNumber());
		assertEquals(false, emptyAccount.isActive());
		assertEquals(0, emptyAccount.getBalance());

		assertEquals(emptyComparisonAccount.getAccountNumber(), emptyAccount.getAccountNumber());
		assertEquals(emptyComparisonAccount.isActive(), emptyAccount.isActive());
		assertEquals(emptyComparisonAccount.getBalance(), emptyAccount.getBalance());

		//Testing if constructor with parameters works fine
		assertEquals(filledConstructorTestAccountNumber, filledConstructorTest.getAccountNumber());
		assertEquals(true, filledConstructorTest.isActive());
		assertEquals(filledConstructorTestBalance, filledConstructorTest.getBalance());

		//Add to balance
		filledConstructorTest.addToBalance(0);
		assertEquals(filledConstructorTestBalance, filledConstructorTest.getBalance());

		// add the throw error
		filledConstructorTest.addToBalance(-500.0);
		assertEquals(filledConstructorTestBalance, filledConstructorTest.getBalance());

		filledConstructorTestBalance += 1500.0;
		filledConstructorTest.addToBalance(1500.0);
		assertEquals(filledConstructorTestBalance, filledConstructorTest.getBalance());


		//Subtract from balance
		filledConstructorTest.subtractFromBalance(0);
		assertEquals(filledConstructorTestBalance, filledConstructorTest.getBalance());

		filledConstructorTest.subtractFromBalance(-3300.0);
		assertEquals(filledConstructorTestBalance, filledConstructorTest.getBalance());

		filledConstructorTestBalance -= 1500.0;
		filledConstructorTest.subtractFromBalance(1500.0);
		assertEquals(filledConstructorTestBalance, filledConstructorTest.getBalance());

		//Testing active functions
		assertEquals(false, emptyAccount.isActive());

		assertEquals(true, filledConstructorTest.isActive());

		filledConstructorTest.setActive(false);
		assertEquals(false, filledConstructorTest.isActive());

		filledConstructorTest.setActive(true);
		assertEquals(true, filledConstructorTest.isActive());

		//Set Balance
		assertEquals(filledConstructorTestBalance, filledConstructorTest.getBalance());

		filledConstructorTestBalance = 100;
		filledConstructorTest.setBalance(100);
		assertEquals(filledConstructorTestBalance, filledConstructorTest.getBalance());

		filledConstructorTest.setBalance(-100);
		assertEquals(filledConstructorTestBalance, filledConstructorTest.getBalance());

		// toString
		assertEquals("Account [accountNumber="+filledConstructorTestAccountNumber
				+", balance="+filledConstructorTestBalance+", active="+true+"]", filledConstructorTest.toString());

		assertEquals("Account [accountNumber=null, balance="+0.0+", active="+false+"]", emptyAccount.toString());
	}

}
