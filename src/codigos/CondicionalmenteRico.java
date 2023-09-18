package codigos;

import java.util.Scanner;

public class CondicionalmenteRico {
  public static void main(String[] args) {

    // Entrada de dados
    @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();

    //TODO: Criar as condi��es necess�rias para impress�o da sa�da, vide tabela de exemplos.
  
    int saldoAtualizado = saldoTotal - valorSaque;

		if (saldoAtualizado < 0) {
			System.out.println("Saldo insuficiente. Saque nao realizado!");
		} else {
			System.out.printf("Saque realizado com sucesso. Novo saldo: %d", saldoAtualizado);
		}
  }
}