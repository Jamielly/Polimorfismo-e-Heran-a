package aula2;

public class Cachorro extends Animal{
	String Nome;
	String caracteristica;
	int Idade;
	Character emitirSom; 
	
	public Cachorro(String nome, int Idade, Character emitirSom, String nome2, String caracteristica, int idade2,
			Character emitirSom2) {
		super(nome, Idade, emitirSom);
		this.Nome = nome2;
		this.caracteristica = caracteristica;
		this.Idade = idade2;
		this.emitirSom = emitirSom2;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getCaracteristica() {
		return caracteristica;
	}


	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}


	public int getIdade() {
		return Idade;
	}


	public void setIdade(int idade) {
		Idade = idade;
	}


	public Character getEmitirSom() {
		return emitirSom;
	}


	public void setEmitirSom(Character emitirSom) {
		this.emitirSom = emitirSom;
	}


	public void dadosCachorro() {
		super.dadosCachorro();
		System.out.println("Caracteristicas...: "+caracteristica);
		System.out.println("Emite som......: "+emitirSom);
}
}

