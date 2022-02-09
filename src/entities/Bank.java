package entities;

public class Bank {
	
	private int numConta;
	private String nomeCliente;
	private double saldo;
		
	public Bank(int numConta, String nomeCliente) {
		this.numConta 		= numConta;
		this.nomeCliente 	= nomeCliente;
	}
	
	public Bank(int numConta, String nomeCliente, double depositoInicial) {
		this.numConta 		= numConta;
		this.nomeCliente 	= nomeCliente;
		addDeposito(depositoInicial);
	}

	public int getNumConta() {
		return numConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	
	public double getSaldo() {
		return saldo;
	}
	
	
	public void addDeposito(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public void saqueConta(double valorSaque) {
		saldo -= valorSaque + 5;
	}
	
	public String toString() {
		return "Nome: "
			+ nomeCliente
			+  ", Número da conta: "
			+ numConta
			+ ", Saldo: R$ "
			+ String.format("%.2f", getSaldo());
	}
	
}
