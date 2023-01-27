import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(500);

    public Bank(String name) {
        this.name = name;
    }

    public void printStatement(String name) {
        var customer = customerExists(name);
        if (customer != null) {
            System.out.println("-".repeat(30));
            System.out.printf("Customer Name: %s %n", name);
            System.out.println("Transactions:");
            for (double d : customer.getTransactions()) {
                System.out.printf("%10.2f (%s)%n",d, d < 0 ? "debit" : "credit");
            }
            System.out.println(customer);
        } else {
            System.out.printf("%s does not exist in customer database %n", name);
        }

    }

    public void createAccount(String name, double initialDeposit) {
        var c = customerExists(name);
        if (c == null) {
            Customer customer = new Customer(name, initialDeposit);
            customers.add(customer);
            System.out.printf("%s was added to the customer list of %s bank %n", customer.getName(), this.name);
        } else {
            System.out.printf("%s already exists in customer list %n", name);
        }
    }

    public void addTransaction(String name, double transaction) {
        var customer = customerExists(name);
        if (customer != null) {
            customer.setTransaction(transaction);
            System.out.printf("Transaction of %.2f was executed in %s's account %n", transaction, name);
        }

    }

    private Customer customerExists(String name) {
        for (var c : customers) {
            if (c.getName().equals(name.toUpperCase())) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name=" + name + '\'' +
                ", customers=" + customers + '}';
    }
}
