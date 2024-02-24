package conta.model;

import conta.util.Strings;

public class ContaPoupanca extends Conta{
	private int aniversário;

	public ContaPoupanca(int agencia, int conta, String titular, float saldo, int aniversário) {
		super(agencia, conta, CONTA_POUPANCA, titular, saldo);
		this.aniversário = aniversário;
	}

	public int getAniversário() {
		return aniversário;
	}

	public void setAniversário(int aniversário) {
		this.aniversário = aniversário;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println(Strings.ACCOUNT_INFO_BIRTHDAY);
	}
}
