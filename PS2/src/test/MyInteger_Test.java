package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Account.Account
public class MyInteger_Test {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		myInt = new Account(1112,2000,0.045);
		myInt.Withdraw(2500);	
		myInt.Deposit(3000);
		System.out.println("Balance ="+myInt.Balance);
		System.out.println("Monthly Interest rate =" +getMonthlyInterestRate);
		System.out.println("Date Created"+dataCreated);
	}

}
