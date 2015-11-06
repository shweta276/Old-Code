
import java.io.*;
public class CheckingAccount {
	
	double total;
	//public static double balance = 100.00;
	double stbalance;
	double balance;
	
	
	public CheckingAccount(double balance){
		 this.balance = balance;
		 System.out.println("Total Balance");
		System.out.println(+balance);
		
	}

	public void  deposit (double amount){
		balance += amount; 
		System.out.println("New Balance after Deposit" + amount);
		System.out.println(+balance);
	}
		
	public void withdraw (double amount){
		if (amount <= balance){
			balance -= amount;
			System.out.println("New Balance after Withdraw" +amount);
			System.out.println(+balance);
		}
			else
			{
				System.out.println("Insufficient balance");		
		}		
	}
	
	public void setBalance(double total){
		stbalance = total;
	 }
	public double getBalance(){
		 return total;
	 }
	 
	
public static void main(String args[]){
	
	CheckingAccount CA = new CheckingAccount(100.00);
	CA.deposit(10);
	CA.withdraw(5);
	CA.setBalance(200.00);
	CA.getBalance();
	System.out.println("balance" + CA);
}
}

//Question: how to set balance using  set method