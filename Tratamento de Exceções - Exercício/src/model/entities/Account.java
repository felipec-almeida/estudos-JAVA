package model.entities;

import model.exceptions.DomainException;

public class Account {

	// V�riaveis da Classe:

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	// Construtores e Getter And Setters da Classe:

	public Account() {

		super();

	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {

		super();

		// Tratamento de Exce��es:

		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;

	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	// M�todos da Classe:

	public void deposit(Double amount) {

		this.balance += amount;

	}

	public void withdraw(Double amount) throws DomainException {

		if (withdrawLimit < amount) {

			throw new DomainException("Erro - O valor de saque excede o seu limite dispon�vel.");

		}

		if (balance < amount) {

			throw new DomainException("Erro - Voc� n�o tem saldo suficiente para efetuar o Saque.");

		}

		this.balance -= amount;

	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
			sb.append("N�mero da Conta: " + this.getNumber() + "\n");
			sb.append("Nome do Titular: " + this.getHolder() + "\n");
			sb.append("Limite de Saque: " + this.getWithdrawLimit() + "\n");
			sb.append("Saldo Atual: " + this.getBalance());
		
		return sb.toString();
		
	}

}
