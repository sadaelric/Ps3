import java.util.Date;

public class Account {
private int id = 0 ;
private double balance = 0;
private double AnnualInterestRate = 0;
private Date dataCreated;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public double getAnnualInterestRate() {
	return AnnualInterestRate;
}
public void setAnnualInterestRate(double annualInterestRate) {
	AnnualInterestRate = annualInterestRate;
}
public Date getDataCreated() {
	return dataCreated;
}
public void setDataCreated(Date dataCreated) {
	this.dataCreated = dataCreated;
}
public Account(int id, double balance, double annualInterestRate) {
	super();
	this.id = id;
	this.balance = balance;
	AnnualInterestRate = annualInterestRate;
}
public double getMonthlyInterestRate() {
	return AnnualInterestRate/12 
}
public void Withdraw(double withdrawal) {
	return balance -= withdrawal
}
public void Deposit(double deposit) {
	return balance+=deposit 
}

}
