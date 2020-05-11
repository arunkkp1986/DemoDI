package com.di.beans;

public class DepositAccount implements IAccountType{

	public DepositAccount() {
		
	}
	@Override
	public void diplayAccTypeDetails() {
		System.out.println("Display Deposit Account Details");
	}
}
