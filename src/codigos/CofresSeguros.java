package codigos;

import java.util.Scanner;

abstract class Cofre {
	protected String tipo;
	protected String metodoAbertura;

	public Cofre(String tipo, String metodoAbertura) {
		this.tipo = tipo;
		this.metodoAbertura = metodoAbertura;
	}

	public void imprimirInformacoes() {
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Metodo de abertura: " + this.metodoAbertura);
	}
}

class CofreDigital extends Cofre {

	private int senha;

	public CofreDigital(int senha) {
		super("Cofre Digital", "Senha");
		this.senha = senha;
	}

	public boolean validarSenha(int confirmacaoSenha) {
		return confirmacaoSenha == this.senha;
	}
}

class CofreFisico extends Cofre {

	public CofreFisico() {
		super("Cofre Fisico", "Chave");
	}

}

public class CofresSeguros {
	public static void main(String[] args) {
		// L� o tipo de cofre (primeira linha da entrada)
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String tipoCofre = scanner.nextLine();
		

		// TODO: Implemente a condi��o necess�rio para a verifica��o dos cofres seguros:
		if (tipoCofre.equalsIgnoreCase("digital")) {			
			System.out.println("Informe a senha: ");
			int senha = scanner.nextInt();
			System.out.println("Confirme a senha: ");
			int confirmacaoSenha = scanner.nextInt();			
			CofreDigital cofreDigital = new CofreDigital(senha);				
			if(cofreDigital.validarSenha(confirmacaoSenha)) {
				cofreDigital.imprimirInformacoes();
				System.out.println("Cofre aberto!");
			} else {
				cofreDigital.imprimirInformacoes();
				System.out.println("Senha incorreta!");				
			}			
		} else {
			CofreFisico cofreFisico = new CofreFisico();
			cofreFisico.imprimirInformacoes();
		}
	}
}
