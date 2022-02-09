package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class ProgramTest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bank bank;
		
		System.out.print("Entre com o nome do cliente: ");
		String nomeCliente = sc.nextLine();
		
		System.out.print("Entre com o número da conta: ");
		int numConta = sc.nextInt();
		
		System.out.print("Realizar depósito inicial (s/n): ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 's') {
			System.out.print("Insira o valor do depósito inicial (Ex: 150.00): ");
			double depositoInicial = sc.nextDouble();
			bank = new Bank(numConta, nomeCliente, depositoInicial);
		} else {
			bank = new Bank(numConta, nomeCliente);
		} 
		
		System.out.println();
		System.out.println("Dados da conta: " + bank);
		
		System.out.println();
		System.out.println("Insira o valor do depósito: ");
		double valorDeposito = sc.nextDouble();
		bank.addDeposito(valorDeposito);
		
		System.out.println();
		System.out.println("Dados da conta atualizados: " + bank);
		
		System.out.println();
		System.out.println("Insira o valor do saque: ");
		double valorSaque = sc.nextDouble();
		bank.saqueConta(valorSaque);
		
		System.out.println();
		System.out.println("Dados da conta atualizados: " + bank);
;		
		sc.close();

	}

}
