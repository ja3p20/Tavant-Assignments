package day1;

import java.util.Scanner;

class BankAccount{
	private String bankName;
	public int balance;
	public void accountDetail() {
		System.out.println("Bank Name: "+bankName);
	}
	public void setBankName(String name) {
		this.bankName = name;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
class SavingAccount extends BankAccount{
	public void showSavingAccountBalance(){
		System.out.println("Your saving acc. balance is "+balance+"rs");
	}
}
class CurrentAccount extends BankAccount{
	public void showCurrentAccountBalance(){
		System.out.println("Your current acc. balance is "+balance+"rs");
	}
}
public class InheritanceBankExample {
	public static void main(String[] args) {
		CurrentAccount currentAccountObject = new CurrentAccount();
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter name of saving account bank");
		String nameOfCurrentBank = scanner.next();
		currentAccountObject.setBankName(nameOfCurrentBank);
		currentAccountObject.setBalance(2000);
		currentAccountObject.accountDetail();
		currentAccountObject.showCurrentAccountBalance();
		
		SavingAccount savingAccountObject = new SavingAccount();
		System.out.println("Enter name of saving account bank");
		String nameOfSavingBank = scanner.next();
		savingAccountObject.setBankName(nameOfSavingBank);
		savingAccountObject.setBalance(1500);
		savingAccountObject.accountDetail();
		savingAccountObject.showSavingAccountBalance();
	}
}
