package conta.model;

public abstract class Conta {
	private int agencia;
	private int numero;
	private int tipo;
	private String titular;
	private float saldo;

	public Conta(int agencia, int conta, int tipo, String titular, float saldo) {
		this.agencia = agencia;
		this.numero = conta;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getConta() {
		return numero;
	}
	
	public void setConta(int conta) {
		this.numero = conta;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(float valor) {
		if(saldo < valor) {
			return false;
		}
		
		setSaldo(saldo - valor);
		return true;
	}
	
	public void depositar(float valor) {
		setSaldo(getSaldo() + valor);
	}
	
	public void visualizar() {
		String tipoConta = "";
		
		switch (tipo) {
		case 1:
			tipoConta = "Corrente";
			break;
		case 2:
			tipoConta = "Poupança";
			break;
		}
		
		System.out.println("\033[1mExibindo dados da conta de " + titular + "\033[0m");
		System.out.println("Número da Agência: " + agencia);
		System.out.println("Número da Conta: " + numero);
		System.out.println("Tipo da Conta: " + tipoConta);
		System.out.println("Nome do Titular: " + titular);
		System.out.printf("Saldo: R$%.2f\n", saldo);
	}
}
