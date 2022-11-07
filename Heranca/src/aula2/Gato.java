package aula2;

public class Gato extends Animal {
	String nome;
	int Idade;
	Character emitirSom;
	String caracteristica;

	public Gato(String nome, int Idade, Character emitirSom, String nome2, int idade2, Character emitirSom2, String caracteristica) {
		super(nome, Idade, emitirSom);
		this.nome = nome2;
		this.Idade = idade2;
		this.emitirSom = emitirSom2;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
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
	public String getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public void dadosGato() {
		super.dadosGato();
		System.out.println("Caracteristicas...: "+caracteristica);
		System.out.println("Emite som:"+emitirSom);
	}
}

