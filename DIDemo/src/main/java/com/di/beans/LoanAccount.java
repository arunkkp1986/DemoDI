package com.di.beans;

public class LoanAccount implements IAccountType{
	private static LoanAccount loanAccount = null;
	public LoanAccount() {
		if(loanAccount == null) {
			System.out.println("LoanAccount Objecct created!!!");
			loanAccount = new LoanAccount();
		}
	}

	@Override
	public void diplayAccTypeDetails() {
		System.out.println("Display Loan Account Details");
	}
}
