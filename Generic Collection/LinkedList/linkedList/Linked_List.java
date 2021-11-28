package linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scp = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<String>();
		
		boolean possui;
		int op;
		
		do {
			System.out.println("1- Para inserir um nome;");
			System.out.println("2- Para buscar a posicao de um nome;");
			System.out.println("3- Para buscar o nome pela posicao;");
			System.out.println("0- Para Sair.");
			System.out.println("Digite a opcao desejada: ");
			op = scp.nextInt();
			System.out.println();
			System.out.println();
			
			switch (op) {
				case 1: {
					possui = false;
					System.out.println("Insira o nome a ser adicionado: ");
					String temp = sc.nextLine();
					if (list.contains(temp)) {
						System.out.println();
						System.out.println("Este nome ja esta na lista!");
						System.out.println();
					}
					else {
						list.add(temp);
					}
				}
				break;
				
				case 2: {
					possui = false;
					int pos = 0;
					System.out.println("Insira o nome a ser procurado: ");
					String temp = sc.nextLine();
					for (int i=0; i<list.size();i++)
						if (temp.equals(list.get(i))) {
							possui = true;
							pos = i+1;
						}
					
					if (possui == false) {
						System.out.println("Este nome nao esta na lista!");
					}else {
						System.out.println("O nome se encontra na posicao " + pos + " da lista.");
					}
				}
				break;
				
				case 3: {
					possui = false;
					System.out.println("Insira a posicao do nome a ser procurado: ");
					int pos = scp.nextInt();
					if (pos > list.size()) {						
						System.out.println("Nao possui esta posicao na lista!");
					}else {
						System.out.println("O nome que se encontra na posicao " + pos + " da lista a: " + list.get(pos-1));
					}
				}
				break;
				
				case 0: {
					System.out.println("Saindo...");
				}
				break;
				
				default:
					System.out.println("Comando invalido!");;
			}
			System.out.println();
		}while(op!=0);
		
		sc.close();
		scp.close();
	}
}

