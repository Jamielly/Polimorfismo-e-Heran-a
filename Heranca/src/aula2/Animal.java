package aula2;

public class Animal {
	String nome, miar, latir;
	int Idade;
	Character emitirSom;

	public Animal(String nome, int Idade, Character emitirSom) {
		super();
		this.nome = nome;
		this.Idade = Idade;
		this.emitirSom = emitirSom;
	}
		public void imprimeDados() {
		System.out.println("Nome "+nome);
		System.out.println("Idade "+getIdade());
		System.out.println("Emite som... latir ou miar "+getEmitirSom());
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
		public void dadosGato() {
			// TODO Auto-generated method stub
			if (emitirSom != null) {
				System.out.println("Este animal é um gato");
		} else {
			System.out.println("Não é um gato"+miar);
		 	}
		}
		public void dadosCachorro() {
			// TODO Auto-generated method stub
			if (emitirSom != null) {
				System.out.println("Este animal é um cachorro");
			} else {
				System.out.println("Não é um cachorro"+latir);
			}
		}
}
