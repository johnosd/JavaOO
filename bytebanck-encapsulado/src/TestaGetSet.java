
public class TestaGetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta(133,222974);
		conta.setNumero(1399);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");

	}

}
