
public class TestaAliquota {
	public static void main(String[] args) {
		double salario = 3300.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Seu IR � de 7,5 % ");
			
		}else {
			if (salario > 2800.0 && salario <= 3751.0) {
				System.out.println("Seu IR � de 15 % ");
			}else {
				if (salario >= 3751.1 && salario <= 4664.0) {
					System.out.println("Seu IR � de 22,5 % ");
				}
			}
		}
	}

}