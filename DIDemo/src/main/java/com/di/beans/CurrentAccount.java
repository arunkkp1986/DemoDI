package com.di.beans;

public class CurrentAccount implements IAccountType{

	private static CurrentAccount currentAccount = null;
	public CurrentAccount() {
		if(currentAccount == null) {
			System.out.println("CurrentAccount Objecct created!!!");
			currentAccount = new CurrentAccount();
		}
	}
	
	@Override
	public void diplayAccTypeDetails() {
		System.out.println("Display Current Account Details");
	}

}
