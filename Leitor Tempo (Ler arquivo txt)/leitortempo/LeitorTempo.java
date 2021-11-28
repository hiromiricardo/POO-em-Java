package leitortempo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class LeitorTempo {

	public static void main(String[] args) throws IOException{
		
		BufferedWriter out = null;
		BufferedReader in = null;
		Scanner scN = null;
		Pilotos[] piloto = new Pilotos[4];

		for (int i=0;i<piloto.length;i++) {
			Pilotos p = new Pilotos();
			piloto[i] = p;
		}
			
		try {
			in = new BufferedReader(new FileReader("TEMPOS.txt"));
			
			for (int p=0;p<4;p++) {
				String leitura = in.readLine();
				while (leitura.contains("#"))
					leitura = in.readLine();
				piloto[p].setNome(leitura);
				
				for (int v=0;v<5;v++) {
					String leitor = in.readLine();
					scN = new Scanner(leitor).useLocale(Locale.US);
					double volta = scN.nextDouble();
					piloto[p].setTempoVolta(v, volta);	
				}
				
			}
			
		} finally {
			if(in != null)
				in.close();
			if(scN != null)
				scN.close();
		}
		
			
		{ 		// C A L C U L O   D A   M E L H O R   V O L T A
			
			double mTempo = piloto[0].getTempoVolta(0);
			int mVolta = 1;
			String nome = piloto[0].getNome();
			for (int p=0; p<4;p++) {
				for (int v=0;v<5;v++) {
					double temp = piloto[p].getTempoVolta(v);
					if (temp < mTempo) {
						mTempo = temp;
						mVolta = v+1;
						nome = piloto[p].getNome();
					}
				}
			}
			Pilotos.SetMelhorTempo(nome, mVolta, mTempo);
			
		} 				// F IM   D O   C A L C U L O
		
		
		try {
			out= new BufferedWriter(new FileWriter("RESULTADO.txt"));
			String escrita = Pilotos.getMelhorTempo();
			out.write(escrita);
			out.write("\n");			
			for (int p=0;p<4;p++) {				
				String escrita1 = piloto[p].getNome();
				String escrita2 = piloto[p].getMelhorVolta();
				String escrita3 = piloto[p].getPiorVolta();
				String escrita4 = piloto[p].getMediaTempo();
				out.write("\n");			
				out.write(escrita1);
				out.write("\n");			
				out.write(escrita2);
				out.write("\n");			
				out.write(escrita3);
				out.write("\n");			
				out.write(escrita4);
				out.write("\n");			
			}
		} finally {
			if(out != null)
				out.close();
		}
		
		
		for (int p=0;p<4;p++) {
			System.out.println(piloto[p].getNome());
			for (int v=0;v<5;v++) {
				System.out.println(piloto[p].getTempoVolta(v));
			}	
			System.out.println(piloto[p].getMelhorVolta());
			System.out.println(piloto[p].getPiorVolta());
			System.out.println("A media de tempo foi: " + piloto[p].getMediaTempo());
			System.out.println();
		}
		
		System.out.println(Pilotos.getMelhorTempo());
		
	}

}
