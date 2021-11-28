package aluno;

import java.util.Scanner;

public class Aluno_Main {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		Aluno[] aluno = new Aluno[15];
		for (int i = 0; i < aluno.length; i++) {
			Aluno aln = new Aluno();
			aluno[i] = aln;
		}
		
		for(int i=0;i<3;i++) {
			
			System.out.println("Digite o nome do aluno "+(i+1)+":");
			aluno[i].setNome(scan1.nextLine());
			
			System.out.println("Digite a serie do aluno "+(i+1)+":");
			aluno[i].setSerie(scan2.nextInt());
			
			System.out.println("Digite o grau do aluno "+(i+1)+":");
			aluno[i].setGrau(scan1.nextLine());		
			
			System.out.println();
		}
		for(int i=0;i<3;i++) {
			System.out.println("ID do aluno: "+aluno[i].getID()+", Nome do Aluno: "+aluno[i].getNome()+", Serie do Aluno: "
							+aluno[i].getSerie()+" do Ensino "+aluno[i].getGrau()+".");
		}
		scan1.close(); scan2.close();
	}

}
