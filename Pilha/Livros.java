package Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Livros {

	public static void main(String[] args) {
		
		int op;
		String nomeLivro, livroRetirado;
		
		Scanner scan = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<>();
		
		System.out.println("Bem vindo ao nosso sistema de Livros!"
				+ "\n****************************************************");
		
		do {
            System.out.println("****************************************************");
            System.out.println("Por favor, selecione uma opção:\n");
            System.out.println("1 - Adicionar Livro na Pilha");
            System.out.println("2 - Listar todos os Livros");
            System.out.println("3 - Retirar Livro da Pilha");
            System.out.println("0 - Sair\n");

            System.out.print("Digite a opção: ");
            op = scan.nextInt();
            scan.nextLine();
            
            switch(op) {
            case 1: 
            	System.out.println("Você selecionou a opção: Adicionar Livro na Pilha");
            	System.out.print("Digite o nome do Livro: ");
            	nomeLivro = scan.nextLine();
            	pilha.push(nomeLivro);
            	System.out.println("O Livro: " + nomeLivro + " foi adicionado com sucesso!");
            	break;
            	
            case 2: 
            	System.out.println("Você selecionou a opçãp: Listar todos os Livros");
            	System.out.println("\nListando todos os Livros....");
            	for(String livros : pilha) {
            		System.out.println(livros);
            	}
            	break;
            	
            case 3: 
            	System.out.println("Você selecionou a opção: Retirar Livro da Pilha");
            	if(!pilha.isEmpty()) {
            		livroRetirado = pilha.pop();
            		System.out.println("O Livro: " + livroRetirado + " foi Retirado!");
            	}else {
            		System.out.println("Oops... A Pilha está vazia!!!");
            	}
            	break;
            	
            case 0: 
            	System.out.println("Obrigada por utilizar nosso sistema!\nFinalizando....");
            }
			
		}while(op != 0);
		
		

	}

}
