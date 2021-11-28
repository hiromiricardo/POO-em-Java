package estacionamento;

import java.util.Scanner;

public class Estacio_Main {

	public static void main(String[] args) {
		Scanner scFl = new Scanner(System.in);
		Scanner scIn = new Scanner(System.in);

		Estacionamento veiculo = new Estacionamento();
	
		System.out.println("Insira a placa do Veiculo: ");
		veiculo.setPlaca(scFl.nextLine());
		
		System.out.println("Insira o modelo do Veiculo: ");
		veiculo.setModelo(scFl.nextLine());
		
		System.out.println("Insira a Hora e depois os Minutos que o veiculo chegou: ");
		veiculo.setHorEnt(scFl.nextInt());
		veiculo.setMinEnt(scFl.nextInt());
		veiculo.setTempoEnt(veiculo.getHorEnt(), veiculo.getMinEnt());
		
		System.out.println("Insira a Hora e depois os Minutos que o veiculo saiu: ");
		veiculo.setHorSai(scFl.nextInt());
		veiculo.setMinSai(scFl.nextInt());
		veiculo.setTempoSai(veiculo.getHorSai(), veiculo.getMinSai());
		
		System.out.println();
		veiculo.Dados();
		
		scFl.close(); scIn.close();
	}

}
