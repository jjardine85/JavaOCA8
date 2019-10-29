package accounts;

public class AccountManager{
public static void main(String[] args){
	Customer customer = new Customer();
	Customer customer1 = new Customer("hi");
	Account account = new Account();
	int i = 0;
	long l = 0L;
	System.out.println(customer);
	System.out.println(customer1);
	System.out.println(account);
	System.out.println(i);
	System.out.println(l);
}
}