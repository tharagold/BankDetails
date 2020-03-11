package org.bank;

public class AxisBank extends BankInfo {
	@Override
	public void deposit() {
System.out.println("Deposit amount:10500");

	}
	public static void main(String[] args) {
		AxisBank ax=new AxisBank();
		ax.deposit();
		ax.fixed();
		ax.saving();
		
		}
	}


