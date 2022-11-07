public class Main {

    public static void main(final String[] args) {
        Customer customerOne = new Customer("Sam", "Smith", "ABC123");
        Account accountOne = new Account("123456", 1000.0);

        Bank bankOne = new Bank(accountOne.getAccountNumber(), customerOne);

        System.out.println(customerOne);
        System.out.println(bankOne);
    }
}
