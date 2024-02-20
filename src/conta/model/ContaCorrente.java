package conta.model;

public class ContaCorrente extends Conta {
	private float limit;

	public ContaCorrente(int agencia, int conta, String titular, float saldo, float limit) {
		super(agencia, conta, 1, titular, saldo);
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
		float valorTotal = super.getSaldo() + limit;
		
		if (valorTotal < value) {
			return false;
		}
		
		float saldo = super.getSaldo();
		super.setSaldo(saldo - value);
		return true;
	}
}
