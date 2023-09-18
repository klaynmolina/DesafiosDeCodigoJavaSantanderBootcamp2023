package codigos;

import java.util.Scanner;

public class AbrindoContas {

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); // Consome a quebra de linha ap�s a entrada do n�mero da conta
    String nomeTitular = scanner.nextLine();
    double saldo = scanner.nextDouble();

    ContaBancaria novaConta = new ContaBancaria(numeroConta, nomeTitular, saldo);

    System.out.println("Informacoes:");
    //TODO: Imprimir as informa��es da conta usando o objeto criado no TODO acima.
    System.out.println("Conta: " + novaConta.numero);
    System.out.println("Titular: " + novaConta.titular);
    System.out.println("Saldo: R$" + novaConta.saldo);
  }
}


class ContaBancaria {
  int numero;
  String titular;
  double saldo;

  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public String getTitular() {
	return titular;
}

public void setTitular(String titular) {
	this.titular = titular;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}
  
  
  
}