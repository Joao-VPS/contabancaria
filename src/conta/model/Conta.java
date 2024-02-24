package conta.model;

import conta.util.Cores;
import conta.util.Strings;

public abstract class Conta {
	static byte CONTA_CORRENTE = 1;
	static byte CONTA_POUPANCA = 2;

	private int agencia;
	private int numero;
	private byte tipo;
	private String titular;
	private float saldo;

	public Conta(int agencia, int conta, byte tipo, String titular, float saldo) {
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int conta) {
		this.numero = conta;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(byte tipo) {
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
		if (getSaldo() < valor) {
			System.out.println(Strings.WITHDRAWAL_FAILED);
			return false;
		}

		setSaldo(getSaldo() - valor);
		System.out.printf(Strings.WITHDRAWAL_SUCCESS, getSaldo());
		return true;
	}

	public void depositar(float valor) {
		System.out.println(Cores.getColorTheme());

		if (valor < 0) {
			System.out.println(Strings.DEPOSIT_FAILED);
			return;
		}

		setSaldo(getSaldo() + valor);
		System.out.printf(Strings.DEPOSIT_SUCCESS, valor, getSaldo());
	}

	public void visualizar() {
		String tipoConta = "";

		switch (tipo) {
		case 1:
			tipoConta = Strings.ACCOUNT_TYPE_CURRENT;
			break;
		case 2:
			tipoConta = Strings.ACCOUNT_TYPE_SAVINGS;
			break;
		}

		System.out.println("*".repeat(30));
		System.out.println(Cores.TEXT_BOLD + Cores.getColorTheme()
		+ Strings.ACCOUNT_INFO
		+ Cores.TEXT_RESET + Cores.getColorTheme());
		System.out.println("*".repeat(30));
		System.out.println(Strings.ACCOUNT_INFO_AGENCY + agencia);
		System.out.println(Strings.ACCOUNT_INFO_NUMBER + numero);
		System.out.println(Strings.ACCOUNT_INFO_TYPE + tipoConta);
		System.out.println(Strings.ACCOUNT_INFO_OWNER + titular);
		System.out.printf(Strings.ACCOUNT_INFO_BALANCE, saldo);
	}
}
