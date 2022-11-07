import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Bank {
    Map<String, Customer> theBank;
//    private String info;
//    private Customer customerInfo;

    public Bank() {
        theBank = new HashMap<>();
    }

//    public Bank(final String info, final Customer customerInfo) {
//        this.info = info;
//        this.customerInfo = customerInfo;
//    }

    public void addCustomer(final Customer newCustomer) {
        //theBank.add("123",newCustomer);
        theBank.put("123", newCustomer);
    }

    public void closeAccount(final String accountNumber) {
        theBank.remove(accountNumber);
    }

    public static void displayCustomerInformation(final Customer customer) {
        System.out.println(customer);
    }

    public static void displayAllCustomers() {
        return "Bank{" +
                "theBank=" + theBank +
                '}';
    }
}
