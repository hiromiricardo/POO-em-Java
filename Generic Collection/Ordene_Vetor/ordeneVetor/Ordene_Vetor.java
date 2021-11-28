package ordeneVetor;

import java.util.Collections;
import java.util.LinkedList;

public class Ordene_Vetor {
	
	public static void main(String[] args) {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		for (int i=0;i<100;i++) 
			lista.add(1 + (int) (Math.random() * 100));
		
		Collections.sort(lista);
		
		System.out.println(lista);
	}

}
