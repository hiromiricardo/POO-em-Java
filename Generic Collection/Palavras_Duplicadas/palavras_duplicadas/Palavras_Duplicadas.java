package palavras_duplicadas;

import java.util.HashMap;
import java.util.Scanner;


public class Palavras_Duplicadas {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> mapa = new HashMap<String, Integer>();
		
		
		System.out.println("Informe a sentenca:");
		String sentenca= sc.nextLine();	
		sentenca = sentenca.replace(".", "");
		sentenca = sentenca.replace(",", "");
		sentenca = sentenca.replace("!", "");
		sentenca = sentenca.replace("?", "");
		sentenca = sentenca.toLowerCase();
		System.out.println(sentenca);
		
		String palavrasVet[] = sentenca.split(" ");
		
		
		for (int i=0; i < palavrasVet.length; i++) {
			String palavra = palavrasVet[i];
		    Integer val = mapa.get(palavra);
		    if (val != null) {
		        mapa.put(palavra, (val + 1));
		    }
		    else {
		       mapa.put(palavra, 1);
		   }
			
		}
		
		
		int cont = 0;
		for (Integer n : mapa.values()) {
			if (n > 1){
		        cont++;
		    }
		}
		System.out.println("A sentenca possui " + cont + " palavras repetidas.");
		
	
		sc.close();
	}
}
