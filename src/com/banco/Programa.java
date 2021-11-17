package com.banco;

public class Programa {

	public static void main(String[] args) {
		Conta minhaConta; //Instanciando um objeto
		minhaConta = new Conta();
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		Conta contaSenai = new Conta(); // instacia de um novo objeto
		c1.nome = "Patrick";
		c1.sobrenome = "Cardoso";
		minhaConta.titular = c1;
		minhaConta.numConta = 1234;
		minhaConta.saldo = 1000;
		minhaConta.limite = 1000;
		
		contaSenai.titular.nome = "Senai";
		contaSenai.titular.sobrenome = "Cascavel";
		contaSenai.numConta = 1000;
		contaSenai.saldo = 0;
		
		
		
		System.out.println("Titular: "+ minhaConta.titular.nome);
		System.out.println("Saldo = "+ minhaConta.saldo);
		System.out.println("Limite Disponível = "+ minhaConta.limite);
		
		//sacar 500 reais
		
		if (minhaConta.saca(500)) {
			System.out.println("Saque realizado com sucesso!");
			System.out.println("Novo Saldo = "+ minhaConta.saldo);
		}else {
			System.out.println("Saque falhou!");
			System.out.println("Saldo Atual = "+ minhaConta.saldo);
		}
		
		//depositar 300
		minhaConta.deposita(300);
		System.out.println("Saldo = "+ minhaConta.saldo);
		
		if(minhaConta.transferePara(contaSenai, 500)){
			System.out.println("Saldo Minha Conta= "+ minhaConta.saldo);
			System.out.println("Saldo Conta Senai= "+ contaSenai.saldo);
		}else {
			System.out.println("Saldo Insuficiente!");
		}
	}

}

