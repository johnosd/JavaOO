package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(50.0);
		System.out.println("Conta do Paulo, Saldo Inicial:" + contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println("Paulo, Sacou. Novo Saldo:" + contaDoPaulo.saldo);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		System.out.println("Conta do Marcela, Saldo Inicial:" + contaDaMarcela.saldo);
		boolean sucessoTransferencia = 
				contaDaMarcela.transfere(contaDoPaulo, 300);
		if (sucessoTransferencia) {
			System.out.println("transferencia realizada com sucesso!");
			System.out.println(contaDaMarcela.saldo);
			System.out.println(contaDoPaulo.saldo);
		}else {
			System.out.println("Faltou Dinheiro");
		}
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);

	}

}
 