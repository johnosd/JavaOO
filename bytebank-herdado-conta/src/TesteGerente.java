
public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente();
		g1.setCpf("319.546.718-65");
		g1.setNome("John Costa");
		g1.setSalario(28.000);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		System.out.println(g1.getCpf());
		
		g1.setSenha(5823);
		System.out.println(g1.autentica(5823));
		
		System.out.println(g1.getBonificacao());
	}
}
