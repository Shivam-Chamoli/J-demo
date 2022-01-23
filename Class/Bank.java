import java.util.*; 
import java.io.*;
import java.lang.*;


public class Bank{
	public static void main(String[] args) {
		BankAcc bobAcc= new BankAcc();
		BankAcc shamAcc= new BankAcc(2255,"Sham Livi", "sham@nobody.com", "7778889999", 2000);
		bobAcc.addMoney(50.00);
		shamAcc.withdrawMoney(200.00);		
		bobAcc.withdrawMoney(600.00);
	}
}