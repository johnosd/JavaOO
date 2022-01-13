package bytebank;

public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("Mesma Conta");
			
		}else {
			System.out.println("Diferente Conta");
			
		}
		
	}

}
