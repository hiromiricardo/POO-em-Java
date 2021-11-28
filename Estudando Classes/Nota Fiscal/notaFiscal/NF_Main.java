package notaFiscal;

public class NF_Main {

	public static void main(String[] args) {
		NotaFiscal nf = new NotaFiscal("Um", "Vela de carro", 100, 1);
		
		System.out.println("Valor total e: R$"+nf.getValorTotal());
		System.out.println("Valor com desconto: R$"+nf.getValorDesc(10));
	}

}
