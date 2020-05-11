package com.di.beans;

public class SavingsAccount implements IAccountType{

	@Override
	public void diplayAccTypeDetails() {
		System.out.println("Display Savings Account Details");
	}
}
