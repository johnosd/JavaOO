
public class TesteCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voc� tem mais que 18 anos");
			System.out.println("seja bem vindo!");
		} else {
			if (quantidadePessoas >=2) {
				System.out.println("voce n�o tem 18 anos, mas pod entrar,"
						+ "pois esta acompanhado");
			} else {
				System.out.println("infelizmente voc� n�o pode entrar");
				
			}
			
		}
	}

}
