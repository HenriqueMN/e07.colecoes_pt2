package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio02_Stack {

	public static void main(String[] args) {
		// Algoritmo que exibe um menu para o usuário executar operações em uma stack
		
		// Criação das variáveis
		Stack<String> estante = new Stack<String>();
		int op, i;
		String livro;
		Scanner input = new Scanner(System.in);
				
		// Do While
		do {
			for(i = 0; i < 80; i++) {
				System.out.print("*"); // Os dois For são usados apenas para criar uma separação entre o menu e os inputs
			}
			System.out.println("\n\n" + 
							"\t\t\t1 - Adicionar Livro na Pilha" + "\n" +
							"\t\t\t2 - Listar Todos os Livros" + "\n" +
							"\t\t\t3 - Retirar Livro da Pilha" + "\n" +
							"\t\t\t0 - Sair" + "\n");
			for(i = 0; i < 80; i++) {
				System.out.print("*");
			}
			System.out.print("\nEntre com a opção desejada: ");
			op = input.nextInt();
					
			switch(op) {
			case 1: // Adiciona um livro na Pilha
				input.nextLine();
				System.out.print("\nDigite o nome: ");
				livro = input.nextLine();
				estante.push(livro);
				System.out.println("\nLivro adicionado.");
				System.out.println("\nPilha: " + estante + "\n");
				break;
			case 2: // Exibe todos os livros na Pilha
				System.out.println("\nLista de livros na Pilha: "+ estante + "\n");
				break;
			case 3: // Checa se a Pilha está vazia ou não e se não, remove um livro
				if(estante.isEmpty()) {
					System.out.println("A Pilha está vazia.\n");
					break;
				}else {
					System.out.print("\nO livro " + estante.peek() + " foi removido.");
					estante.pop();
					System.out.println("\nPilha: " + estante + "\n");
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
