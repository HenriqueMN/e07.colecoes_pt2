package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01_Queue {

	public static void main(String[] args) {
		// Algoritmo que exibe um menu para o usuário executar operações em uma queue
		
		// Criação das variáveis
		Queue<String> nomes = new LinkedList<String>();
		int op, i;
		String cliente;
		Scanner input = new Scanner(System.in);
		
		// Do While
		do {
			for(i = 0; i < 80; i++) {
				System.out.print("*"); // Os dois For são usados apenas para criar uma separação entre o menu e os inputs
			}
			System.out.println("\n\n" + 
							"\t\t\t1 - Adicionar Clientes na Fila" + "\n" +
							"\t\t\t2 - Listar Todos os Clientes" + "\n" +
							"\t\t\t3 - Retirar Cliente da Fila" + "\n" +
							"\t\t\t0 - Sair" + "\n");
			for(i = 0; i < 80; i++) {
				System.out.print("*");
			}
			System.out.print("\nEntre com a opção desejada: ");
			op = input.nextInt();
			
			switch(op) {
			case 1: // Adiciona um cliente na fila
				input.nextLine();
				System.out.print("\nDigite o nome: ");
				cliente = input.nextLine();
				nomes.add(cliente);
				System.out.println("\nCliente adicionado.");
				System.out.println("\nFila: " + nomes + "\n");
				break;
			case 2: // Exibe todos os clientes na fila
				System.out.println("\nLista de clientes na fila: "+ nomes + "\n");
				break;
			case 3: // Checa se a fila está vazia ou não e se não, remove um cliente
				if(nomes.isEmpty()) {
					System.out.println("A fila está vazia.\n");
					break;
				}else {
					System.out.print("\n" + nomes.poll() + " foi chamado(a).");
					System.out.println("\nFila: " + nomes + "\n");
					break;
				}
			case 0: // Finaliza o programa
				System.out.print("\nPrograma finalizado.");
				break;
			default:
				System.out.println("\nOperação inválida.\n");
			}
			
			
		}while(op != 0);

	}

}
