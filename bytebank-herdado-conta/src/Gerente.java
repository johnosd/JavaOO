
public class Gerente extends Funcionario{

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public boolean autentica(int senha) {
		return this.senha == senha;
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo do gerente");
		return super.getBonificacao() + super.getSalario();
	}
	
}
