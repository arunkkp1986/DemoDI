package com.di.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//This is a class to call
@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		//ConfigurableApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
		
		//Here we used common class for all accounts
		/*
		 * Accounts accounts = context.getBean(Accounts.class);
		 * 
		 * Accounts accounts1 = context.getBean(Accounts.class); 
		 * Accounts accounts2 = context.getBean(Accounts.class);
		 */
		
		Accounts accounts = Accounts.getInstance();
		
		accounts.setAccountType(new LoanAccount());
		accounts.displayAccountDetails();
		
		accounts.setAccountType(new DepositAccount());
		accounts.displayAccountDetails();
		
		accounts.setAccountType(new CurrentAccount());
		accounts.displayAccountDetails();
		
		accounts.setAccountType(new SavingsAccount());
		accounts.displayAccountDetails();
	}

}
