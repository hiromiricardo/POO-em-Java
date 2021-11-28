package tempo;

import java.util.Scanner;

public class Tempo_Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Tempo tempo1 = new Tempo ();
		Tempo tempo2 = new Tempo ();
		Tempo tempo3 = new Tempo ();
		Tempo tempo4 = new Tempo ();
		
		
		System.out.println("Insira as Horas do primeiro horario:");
		tempo1.setHoras(scan.nextInt());

		System.out.println("Insira os Minutos do primeiro horario:");
		tempo1.setMinutos(scan.nextInt());
		
		System.out.println("Insira os Segundos do primeiro horario:");
		tempo1.setSegundos(scan.nextInt());

		System.out.println(tempo1.getHorario());

		
		System.out.println("Insira as Horas do segundo horario:");
		tempo2.setHoras(scan.nextInt());
		
		System.out.println("Insira os Minutos do segundo horario:");
		tempo2.setMinutos(scan.nextInt());
		
		System.out.println("Insira os Segundos do segundo horario:");
		tempo2.setSegundos(scan.nextInt());
		
		System.out.println(tempo2.getHorario());
		
		tempo3 = tempo1.Somar(tempo2);
		tempo4 = tempo1.Subtrair(tempo2);
		System.out.println();
		System.out.println("Tempo 1: "+tempo1.getHorario());
		System.out.println("Tempo 2: "+tempo2.getHorario());
		System.out.println();
		System.out.println("Soma dos tempos: "+tempo3.getHorario());
		System.out.println();
		System.out.println("Subtracao do tempo: "+tempo4.getHorario());
		
		scan.close();
	}

}
