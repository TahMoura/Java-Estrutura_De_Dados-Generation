package Fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ClientesBanco {

    public static void main(String[] args) {

        int op;
        String nome, chamado;

        Scanner scan = new Scanner(System.in);

        Queue<String> fila = new LinkedList<>();
        
        System.out.println("****************************************************");
        System.out.println("Bem vindo ao Gerenciamento de Clientes do Banco!");

        do {
            System.out.println("****************************************************");
            System.out.println("Por favor, selecione uma opção:\n");
            System.out.println("1 - Adicionar Cliente na Fila");
            System.out.println("2 - Listar todos os Clientes");
            System.out.println("3 - Retirar Cliente da Fila");
            System.out.println("0 - Sair\n");

            System.out.print("Digite a opção: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {

                case 1:
                    System.out.println("\nVocê selecionou a opção: Adicionar Cliente na Fila");
                    System.out.print("Por favor, digite o nome do Cliente: ");
                    nome = scan.nextLine();
                    fila.add(nome);
                    System.out.println("Cliente " + nome + " foi adicionado!\n");
                    break;

                case 2:
                    System.out.println("\nVocê selecionou a opção: Listar todos os clientes\nListando todos os clientes...\n");
                    for(String clientes : fila) {
                    	System.out.println(clientes);
                    }
                    break;

                case 3:
                	System.out.println("\nVocê selecionou: Retirar Cliente da fila\n");
                	if(!fila.isEmpty()) {
                        chamado = fila.poll();
                        System.out.println("Cliente: " + chamado + " foi chamado!");
                	}else {
                		System.out.println("Oops... A Fila está vazia!!!");
                	}
                    break;

                case 0:
                    System.out.println("\nObrigada por utilizar o nosso sistema!\nFinalizando....\n");
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente Novamente!\n");
            }

        } while (op != 0);
    }
}


