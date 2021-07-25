
public class Account {
private String id;
private String name;
private int balance;
public Account(String id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Account(String id, String name, int balance) {
	super();
	this.id = id;
	this.name = name;
	this.balance = balance;
}
public String getId() {
	return id;
}
public String getName() {
	return name;
}
public int getBalance() {
	return balance;
}
public int credit(int amount){
	return balance = balance + amount;
}
public int debit(int amount) {
	if(amount <= balance){
		balance = balance - amount;
} else System.out.println("Amount exceeded balance");
	return balance;
}
public int transferTo(Account anotheracc, int amount){
	if(amount <= balance) {
		balance = balance - amount;
		anotheracc.credit(amount);
	}else System.out.println("Amount exceeded balance");
	return balance;
}
@Override
public String toString() {
	return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
}

}
//nnnnnn
//