package br.com.DIO.model;

import java.util.Objects;

public class Gato {
	private String nome;
	private String cor;
	private Integer idade;

	/*
	 * Essa classe foi digitada, para questão didatica public Gato(String nome,
	 * String cor, Integer idade) { this.nome = nome; this.cor = cor; this.idade =
	 * idade; }
	 */

	/*
	 * Essa classe foi criada com o atalho CTRL + 3 selecionando generate
	 * constructor using Fields sendo vazio
	 */
	public Gato() {
	}

	/*
	 * Essa classe foi criada com o atalho CTRL + 3 selecionando generate
	 * constructor using Fields com todos os atributos
	 */
	public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	/*
	 * Criando o getters and setters, CTRL + 3, Generate Getters and Setters
	 * selecionando todos
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	/*
	 * Criando o hashCode and Equals, CTRL + 3 Generate hashCode and Equals
	 * selecionando todos
	 */
	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}
