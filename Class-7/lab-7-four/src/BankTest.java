import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.awt.print.Book;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

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

	String getCustomerInfo(Customer customer){
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		theEmptyBank.displayCustomerInformation(customer);
		String output = (outContent.toString());
		System.setOut(originalOut);
		return output;
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
		//display all customers
		for(int i = 1; i<50;i++){
			Customer temporaryCustomer = new Customer("FirstName"+i, "LastName"+i, "12345678"+i);
			NullPointerException ex = assertThrows(NullPointerException.class, () -> {
				theEmptyBank.addCustomer(temporaryCustomer);
			});

			double theBalance = 1000.0*i;
			Account temporaryAccount = new Account("12345"+i,theBalance);

			temporaryCustomer.setAccount(temporaryAccount);

			theEmptyBank.addCustomer(temporaryCustomer);


			theEmptyBank.displayCustomerInformation(temporaryCustomer);
			String currentExpectedInfo = "Customer [firstName=FirstName"+i+", lastName=LastName"+i+", passcode=12345678"+i+", account=Account " +
					"[accountNumber=12345"+i+", balance="+theBalance+", active=true]]"+System.lineSeparator();

			assertEquals(getCustomerInfo(temporaryCustomer), currentExpectedInfo);

			theExpectedOutput+= "Customer [firstName=FirstName"+i+", lastName=LastName"+i+", passcode=12345678"+i+", account=Account " +
					"[accountNumber=12345"+i+", balance="+theBalance+", active=true]]"+System.lineSeparator();

			ByteArrayOutputStream outContent = new ByteArrayOutputStream();
			PrintStream originalOut = System.out;
			System.setOut(new PrintStream(outContent));
			theEmptyBank.displayAllCustomers();
			String output = (outContent.toString());
			System.setOut(originalOut);
			String[] outputArray = output.split(System.lineSeparator());
			String[] expectedArray = theExpectedOutput.split(System.lineSeparator());
			Arrays.sort(outputArray);
			Arrays.sort(expectedArray);

			assertTrue(Arrays.equals(outputArray, expectedArray));
		}

		// close account
		for(int i = 1; i<50;i++){
			theEmptyBank.closeAccount("00");
			theEmptyBank.closeAccount("12345"+i);
			ByteArrayOutputStream outContent = new ByteArrayOutputStream();
			PrintStream originalOut = System.out;
			System.setOut(new PrintStream(outContent));
			theEmptyBank.displayAllCustomers();
			String output = (outContent.toString());
			System.setOut(originalOut);
			if(!output.isEmpty()){
				String[] outputArray = output.split(System.lineSeparator());
//				System.out.println("the index is "+i+"outputArray is "+outputArray[0]);
//				theEmptyBank.displayAllCustomers();
				assertEquals(50-i-1,outputArray.length);
			}


			Customer temporaryCustomer = new Customer("FirstName"+i, "LastName"+i, "12345678"+i);
			Customer inCorrectTemporaryCustomer = new Customer("Fake"+i, "LastName"+i, "12345678"+i);
			assertEquals("Customer [firstName=Fake"+i+", lastName=LastName"+i+", passcode=12345678"+i+", account=null]"+System.lineSeparator(),getCustomerInfo(inCorrectTemporaryCustomer));
//			assertEquals("",getCustomerInfo(temporaryCustomer));
			assertEquals("Customer [firstName=FirstName"+i+", lastName=LastName"+i+", passcode=12345678"+i+", account=null]"+System.lineSeparator(),getCustomerInfo(temporaryCustomer));
			//public static java.util.HashMap<java.lang.String,Customer> theBank



		}
//		System.out.println(theEmptyBank.toString());
//		fail("Not yet implemented");

//		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
//			b1 = new Book(null, "rowling", 1996, 700);
//		});
//		assertEquals("a book needs a title!!!", ex.getMessage());
	}

}
