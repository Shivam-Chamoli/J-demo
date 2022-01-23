import java.util.*;
import java.util.regex.*;   
import java.io.*;
import java.lang.*;

public class BankAcc{
	private int acc_number;
	private double balance;
	private String custName;
	private String custEmail;
	private String custPhone;
	//Constructors

	public BankAcc(){
		this(2212, "defaultName", "defaultemail", "1112221112", 500.00);
		System.out.println("Default constructor called");
	}
	public BankAcc(int acc_number, String name, String email, String contact, double balance){
		System.out.println("Constructor with parameters called");
		setName(name);
		setAccNo(acc_number);
		setEmail(email);
		setPhoneNo(contact);
		setInitialBal(balance);

	}

	public void setName(String name){
		System.out.println("set name called");
		this.custName=name;
	}

	public void setEmail(String email){
		System.out.println("set Email called");
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);  
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) this.custEmail=email;
		else System.out.println("Invalid Email");
	}
	
	public void setPhoneNo(String number){
		System.out.println("set Phone called");

		if( (number).length() == 10) this.custPhone=number;
		else System.out.println("Invalid Contact Number");
	}

	public void setAccNo(int number){
		System.out.println("set ACCNUMBER called");
		this.acc_number=number;
	}
	public void setInitialBal(double bal){
		System.out.println("set Balance called");
		this.balance=bal;
	}

	public String getName()     {return custName;}
	public String getEmail()    {return custEmail;}
	public String    getPhoneNo()  {return custPhone;}
	public int    getAccNo()    {return acc_number;}
	public double getAccBal()   {return balance;}

	public void addMoney(double amnt){
		this.balance+=amnt;
		System.out.println("Deposit of Rs "+ amnt + " made. New Balance is Rs "+this.balance);
	}
	public void withdrawMoney(double amnt){
		if(this.balance-amnt>0){
			this.balance-=amnt;
			System.out.println("Withdrawl of Rs "+ amnt + " made. Remaining Balance is Rs "+this.balance);
		}
		else{
			System.out.println("insufficcient funds");
		}
	}


}
