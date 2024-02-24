package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;
import conta.util.Strings;

public class ContaController implements ContaRepository {
	
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodas() {
		
		if (listaContas.size() == 0) {
			System.out.println(Strings.CONTROLLER_NO_ACCOUNTS);
			return;
		}

		for (var conta : listaContas) {
			conta.visualizar();
			System.out.println("-".repeat(30) + "\n");
		}
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.printf(Strings.CONTROLLER_ACCOUNT_CREATED, conta.getNumero());
	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(int numrero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarNumero() {
		return ++ numero;
	}
}
