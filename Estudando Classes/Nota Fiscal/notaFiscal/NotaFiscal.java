package notaFiscal;

public class NotaFiscal {
	
	private String num_peca;
	private String desc_peca;
	private int qtde_comprada;
	private double valor_unit;
	
	public NotaFiscal(String num_peca, String desc_peca,int qtde_comprada, double valor_unit) {
		this.num_peca = num_peca;
		this.desc_peca = desc_peca;
		this.qtde_comprada = qtde_comprada;
		this.valor_unit = valor_unit;
	}
	
	public String getNumPeca() {
		return num_peca;
	}
	
	public String getDescPeca() {
		return desc_peca;
	}
	
	public int getQtdeCompr() {
		return qtde_comprada;
	}
	
	public double getValorTotal() {
		return qtde_comprada * valor_unit;
	}
	
	public double getValorDesc(double valor_desc) {
		return (getValorTotal() - (getValorTotal() * valor_desc/100));
	}

}
