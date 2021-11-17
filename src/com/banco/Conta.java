package com.banco;

public class Conta {
	// defini��o dos atributos que um objeto pode ter
	int numConta ;
	double saldo = 0;
	double limite = 100;
	Cliente titular;
	
	
	// exemplo de m�todo

	boolean saca(double quantidade) {//metodo saca do tipo vazio
		if ( this.saldo < quantidade) {
			return false;
		} else {		
			this.saldo -= quantidade;
			return true;
		}
	}

	void deposita(double quantidade) {
		this.saldo += quantidade;
		// this.saldo = this.saldo + quantidade
	}
	
	boolean transferePara(Conta destino, double valor) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	

}








