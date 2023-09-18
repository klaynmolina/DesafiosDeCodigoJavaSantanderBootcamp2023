package codigos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrganizandoSeusAtivos {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
    ArrayList < String > ativos = new ArrayList < > ();

    //Entrada dos tipos de ativos
    int quantidadeAtivos = scanner.nextInt();
     scanner.nextLine();

    // Entrada dos c�digos dos ativos
    for (int i = 0; i < quantidadeAtivos; i++) {
      String codigoAtivo = scanner.nextLine();
      ativos.add(codigoAtivo);
    }

    //TODO: Ordenar os ativos em ordem alfab�tica.
    Collections.sort(ativos);
    
    //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
    ativos.forEach(System.out::println);
  }
}