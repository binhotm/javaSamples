package herdeiros;

import abstratos.Batalha;

public class Pessoa implements Batalha {

	private String nome;
	private int idade;
	private char sexo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public void batalhar(Pessoa p) {
		System.out.println(this.getNome() + " Iniciou uma batalha com " + p.getNome());
	}

}
