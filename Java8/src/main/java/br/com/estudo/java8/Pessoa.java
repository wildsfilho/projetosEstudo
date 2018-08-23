package br.com.estudo.java8;

public class Pessoa {

	private String nome;

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void fala(String s) {

		System.out.println(s + "- RSRSR");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
