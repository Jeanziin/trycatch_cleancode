package application;

import java.util.Locale;
import java.util.Scanner;

import exceptions.BusinessException;
import tryex.Account;

public class Program {
 public static void main(String[] args) {
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);
	 
	   //Account acc = new Account();
	 
	 System.out.println("INFORME OS DADOS DA CONTA");
	 System.out.print("Numeros: ");
	 int number = sc.nextInt();
	 System.out.print("Titular: ");
	 sc.nextLine();
	 String holder = sc.nextLine();
	 System.out.print("Saldo inicial: ");
	 Double balance = sc.nextDouble();
	 System.out.print("Limite de Saque: ");
	 Double withdrawLimit = sc.nextDouble();
	 
	Account acc = new Account(number, holder, balance, withdrawLimit);
	 
	System.out.println();
	System.out.print("Informe uma quantia para sacar: ");
	double amount = sc.nextDouble();
	
	try {
	acc.withdraw(amount);
	System.out.printf("Novo Saldo: %.2f%n", acc.getBalance());
	
	}
	 catch(BusinessException e) {
		 System.out.println(e.getMessage());
	 }
	sc.close();
 	}
}
