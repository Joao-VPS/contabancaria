package conta.model;

import conta.util.Strings;

public class ContaCorrente extends Conta {
	private float limit;

	public ContaCorrente(int agencia, int conta, String titular, float saldo, float limit) {
		super(agencia, conta, CONTA_CORRENTE, titular, saldo);
		this.limit = limit;
	}

	public float getLimit() {
		return limit;
	}

	public void setLimit(float limit) {
		this.limit = limit;
	}

	@Override
	public boolean sacar(float value) {
		float valorTotal = getSaldo() + limit;

		if (valorTotal < value) {
			System.out.println(Strings.WITHDRAWAL_FAILED);
			return false;
		}

		setSaldo(getSaldo() - value);
		System.out.printf(Strings.WITHDRAWAL_SUCCESS, getSaldo());

		return true;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf(Strings.ACCOUNT_INFO_LIMIT, getLimit());
	}
}
