package data;

public class Data {
	private int dia;
	private int mes;	
	private int ano;
	private boolean verif;
	
	public Data(int dia, int mes, int ano) {
		Verificacao(dia, mes, ano);
		if (verif == true) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else {
			System.out.println("Data incorreta!");
		}
	}
	
	public void Verificacao(int dia, int mes, int ano) {
		if( (0 < mes) & (mes < 13) ) {
			if(mes%2 == 0) {
				if((0 < dia) && (dia < 31)) {
					verif = true;
				} else {
					verif = false;
				}
			} else {
				if((0 < dia) && (dia < 32)) {
					verif = true;
				} else {
					verif = false;
				}
			}
		} else {
			verif = false;
		}
	}
	
	public int diasAno(int mes) {
		int diasAno = 0;
		for(int i=1;i<mes;i++) {
			if(i%2==0) {
				diasAno += 30;
			} else {
				diasAno += 31;
			}
		}
		return diasAno;
	}

	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}
	

	public static void main(String[] args) {
		Data data1 = new Data (1, 5, 2020);
		Data data2 = new Data (14, 12, 2017);
		Data data3 = new Data (27, 9, 1999);
		
		System.out.println("\nA data e: "+data1.getDia()+"/"+data1.getMes()+"/"+data1.getAno());
		System.out.println("A quantidade de dias ate este mes e: "+data1.diasAno(data1.getMes()));

		System.out.println("\nA data e: "+data2.getDia()+"/"+data2.getMes()+"/"+data2.getAno());
		System.out.println("A quantidade de dias ate este mes e: "+data2.diasAno(data2.getMes()));
		
		System.out.println("\nA data e: "+data3.getDia()+"/"+data3.getMes()+"/"+data3.getAno());
		System.out.println("A quantidade de dias ate este mes e: "+data3.diasAno(data3.getMes()));
	}

}
