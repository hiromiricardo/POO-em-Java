package motorcycle;

import java.util.Scanner;

public class Campeonato {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		Motorcycle moto1 = new Motorcycle (0,1);
		Motorcycle moto2 = new Motorcycle (0,1);
		System.out.println("\n========= Bem Vindo ao Campeonato de Motocicletas!! =========");
		System.out.println("\nE uma corrida de 10 segundos, onde as Motocicletas possuem alta potencia."
				+ " A cada dois segundos voce deve informar o ganho de velocidade ou a perda (caso a motocicleta deslise).");

		System.out.println("\nAs motocicletas "+moto1.getID()+" e "+moto2.getID()+" estao no ponto de largada e a corrida vai comecar!\n" );
		
		for(int i=0;i<10;i+=2) {
			
			System.out.println("Digite a velocidade de aumento da moto: "+moto1.getID());
			int aceleracao1 = scan.nextInt();
			moto1.SpeedUp(aceleracao1);
			
			System.out.println("Digite a velocidade de aumento da moto: "+moto2.getID());
			int aceleracao2 = scan.nextInt();
			moto2.SpeedUp(aceleracao2);
			
				//Classificando a Colocacao
			if(moto1.getDist() > moto2.getDist()) {
				moto1.posicao = "1";	
				moto2.posicao = "2";	
			} else {
				if(moto1.getDist() < moto2.getDist()) {
					moto1.posicao = "2";	
					moto2.posicao = "1";	
				} else {
					moto1.posicao = "Empatado";	
					moto2.posicao = "Empatado";
				}
			}
			
			System.out.println("\nTempo corrido: "+i+"segundos.");
			System.out.println("Moto "+moto1.getID()+": Velocidade = "+moto1.getSpeed()+"Km/h, Marcha = "+moto1.getGear()
								+", Distancia = "+moto1.getDist()+"m, Posicao = "+moto1.posicao);
			System.out.println("Moto "+moto2.getID()+": Velocidade = "+moto2.getSpeed()+"Km/h, Marcha = "+moto2.getGear()
								+", Distancia = "+moto2.getDist()+"m, Posicao = "+moto2.posicao);
			System.out.println();
			
		}
			//Apresentando o vencedor
		if(moto1.posicao == "1") {
			System.out.println("Fim da corrida! A motocicleta: 1001 ganhou!!");
		}else {
			if (moto2.posicao == "1") {
				System.out.println("Fim da corrida! A motocicleta: 1002 ganhou!!");
			}else {
				System.out.println("Fim da corrida! As motocicletas 1001 e 1002 empataram!!");
			}
		}
				
		scan.close();
		
	}

}
