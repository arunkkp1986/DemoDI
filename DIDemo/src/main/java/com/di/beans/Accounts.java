package com.di.beans;


import org.springframework.stereotype.Component;

@Component
public class Accounts {
	
	private static Accounts accounts = null;
	public Accounts() {
		if(accounts == null) {
			System.out.println("Accounts Objecct created!!!");
			accounts = new Accounts();
		}
	}
	
	public static Accounts getInstance() {
		if(accounts == null) {
			accounts = new Accounts();
		}
		
		return accounts;
	}
	private IAccountType accountType;

	public IAccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(IAccountType accountType) {
		this.accountType = accountType;
	}
	
	public void displayAccountDetails() {
		this.accountType.diplayAccTypeDetails();
	}
}
