
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		
		contaDaMarcela.titular = new Cliente();
		
		System.out.println(contaDaMarcela.titular);
	}
}
