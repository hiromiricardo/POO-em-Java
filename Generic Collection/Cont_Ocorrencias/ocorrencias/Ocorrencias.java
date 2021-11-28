package ocorrencias;

import java.util.HashMap;
import java.util.Scanner;

public class Ocorrencias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> mapa = new HashMap<Character, Integer>();
		
		System.out.println("Informe a frase:");
		String frase = sc.nextLine();
		
		
		for (int i=0; i < frase.length(); i++) {
		    char chr = frase.charAt(i);
		    Integer val = mapa.get(chr);
		    if (val != null) {
		        mapa.put(chr, (val + 1));
		    }
		    else {
		       mapa.put(chr, 1);
		   }
		}
		
		System.out.println(mapa);
		
		sc.close();
	}

}
