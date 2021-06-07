package br.blog.forms;

public class Hotel {
	private String nome;
	private String endereco;
	private int id;
	private double classificacao;
	private int qtdQuartos;
	private double precoEstadia;
	
	public Hotel() {
		super();
	}
	
	public Hotel(String nome, String endereco, int id, double classificacao, int qtdQuartos, double precoEstadia) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.id = id;
		this.classificacao = classificacao;
		this.qtdQuartos = qtdQuartos;
		this.precoEstadia = precoEstadia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(double classificacao) {
		this.classificacao = classificacao;
	}

	public int getQtdQuartos() {
		return qtdQuartos;
	}

	public void setQtdQuartos(int qtdQuartos) {
		this.qtdQuartos = qtdQuartos;
	}

	public double getPrecoEstadia() {
		return precoEstadia;
	}

	public void setPrecoEstadia(double precoEstadia) {
		this.precoEstadia = precoEstadia;
	}
}
