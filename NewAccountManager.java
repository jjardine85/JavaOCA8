import accounts.*;

public class NewAccountManager{
public static void main(String[] args){
	Customer customer = new Customer();
	Account account = new Account();
	int i = 0;
	long l = 0L;
	System.out.println("customer: " + customer);
	System.out.println("account: " + account);
	System.out.println(i);
	System.out.println(l);
	Customer customer2 = customer;
	System.out.println("customer 2: " + customer2);
	Customer customer3 = new Customer();
	customer = customer3;
	customer3 = null;
	System.out.println("customer: " + customer);
	System.out.println("customer3: " + customer3);
}
}