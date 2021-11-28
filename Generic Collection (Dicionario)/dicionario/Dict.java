package dicionario;

public class Dict<K, V> {
	private K k;
	private V v;
	
	public Dict() {
	}
	
	public Dict(K k, V v) {
		this.k = k;
		this.v = v;
	}
	
	public void adicionar(K chave, V valor) {
		if(k == chave) {
			v = valor; 
		}
		else {
			System.out.println("Chave nao encontrada");
		}
	}
	
	public V getValor(K chave) {
		V val;
		if(chave == k) { 
			val = v;
		} else {
			val = null;
		}
		return val;
	}
	
	public K getElementoK() {
		return k;
	}
	public V getElementoV() {
		return v;
	}
		
	public void setElementoK(K k) {
		this.k = k;
	}
	public void setElementoV(V v) {
		this.v = v;
	}
}
