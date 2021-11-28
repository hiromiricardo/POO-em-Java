package dicionario;

public class Main_Dicionario{

	public static void main(String[] args) {

	Dict[] dict = (Dict[]) new Dict[5];
	
	for (int i = 0; i < 5; i++) {
		Dict<Integer, String> a = new Dict<Integer, String>((Integer)i, "TESTE - " + i);
		dict[i] = a;
	}
	
	for (int i = 0; i < 5; i++) {
		System.out.println(dict[i].getElementoK() + ": " + dict[i].getElementoV());
	}
	
	dict[0].adicionar(0, "add1");
	System.out.println("\n");
	
	for (int i = 0; i < 5; i++) {
		System.out.println(dict[i].getElementoK() + ": " + dict[i].getElementoV());
	}
	System.out.println();
	System.out.println("O valor da primeira posicao e: " + dict[0].getValor(0));
	
	}
}
