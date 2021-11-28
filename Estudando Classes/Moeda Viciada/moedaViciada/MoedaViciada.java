package moedaViciada;

import java.util.Random;

		//Para Cara - 1 e Coroa - 0

public class MoedaViciada {
	private int op_usuario;
	private int aux;
	Random rand;
	
	public MoedaViciada(int op_usuario) {
		this.op_usuario = op_usuario;
	}
	
	public int jogaMoeda() {
		rand = new Random();
		aux = rand.nextInt(10); //no range de 0 a 9
		
		if(aux > 6) {
			return op_usuario;
		} else {
			if(op_usuario == 0) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	
	public static void main(String[] args) {
		MoedaViciada mv = new MoedaViciada(1);
		
		System.out.println("0 = Coroa e 1 = Cara");
		System.out.println("Jogada 1: " + mv.jogaMoeda());
		System.out.println("Jogada 2: " + mv.jogaMoeda());
		System.out.println("Jogada 3: " + mv.jogaMoeda());
		System.out.println("Jogada 4: " + mv.jogaMoeda());
		System.out.println("Jogada 5: " + mv.jogaMoeda());
		System.out.println("Jogada 6: " + mv.jogaMoeda());
		System.out.println("Jogada 7: " + mv.jogaMoeda());
		System.out.println("Jogada 8: " + mv.jogaMoeda());
		System.out.println("Jogada 9: " + mv.jogaMoeda());
		System.out.println("Jogada 10: " + mv.jogaMoeda());
		
		
	}
	
}
