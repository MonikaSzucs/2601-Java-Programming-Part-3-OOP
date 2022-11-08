import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.print.Book;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BankTest {

	static Bank theEmptyBank;
	static String theExpectedOutput = "";
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		theEmptyBank = new Bank();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//		  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		//        PrintStream originalOut = System.out;
		//        System.setOut(new PrintStream(outContent));
		//        school.printRoster();
		//        String output = (outContent.toString());
		//        System.setOut(originalOut);

		//Setup the empty test later

		Customer temporaryCustomer = new Customer("Justin", "Bieber", "12345678");
		NullPointerException ex = assertThrows(NullPointerException.class, () -> {
			theEmptyBank.addCustomer(temporaryCustomer);
		});

		Account temporaryAccount = new Account("12345",5000);

//		for(int i = 0 ; i < 50 ; i++){
//
//		}
		temporaryCustomer.setAccount(temporaryAccount);

		theEmptyBank.addCustomer(temporaryCustomer);
		theExpectedOutput+= "Customer [firstName=Justin, lastName=Bieber, passcode=12345678, account=Account " +
				"[accountNumber=12345, balance=5000.0, active=true]]"+System.lineSeparator();


		ByteArrayOutputStream outContent = new ByteArrayOutputStream();

		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		theEmptyBank.displayAllCustomers();
		String output = (outContent.toString());
		System.setOut(originalOut);
		System.out.println(output);
		System.out.println(theExpectedOutput);

		assertTrue(output.equals(theExpectedOutput));


//		System.out.println(theEmptyBank.toString());
//		fail("Not yet implemented");

//		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
//			b1 = new Book(null, "rowling", 1996, 700);
//		});
//		assertEquals("a book needs a title!!!", ex.getMessage());
	}

}
