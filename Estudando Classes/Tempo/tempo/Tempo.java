package tempo;

public class Tempo {
	
	private int Segundos;
	private int Minutos;
	private int Horas;
	private String horaPronta;
	
	public Tempo() {
		this.Segundos = 0;
		this.Minutos = 0;
		this.Horas = 0;
	}
	
	public Tempo(int horas, int minutos, int segundos) {
		this.Segundos = segundos;
		this.Minutos = minutos;
		this.Horas = horas;
	}
	
	
	public void Soma(Tempo somador) { 			//Somar dois objetos e colocar o resultado no objeto que o chamou;
			int segundos = somador.Segundos;
			int minutos = somador.Minutos;
			int horas = somador.Horas;			
		if((Segundos + segundos) > 59) {
			int MinTemp = ((Segundos + segundos)/60);
			Segundos = ((Segundos + segundos)%60);
			if((Minutos + MinTemp + minutos) > 59){
				int HorTemp = ((Minutos + MinTemp + minutos)/60);
				Minutos = ((Minutos + MinTemp + minutos)%60);
				Horas += (HorTemp + horas);
			} else {
				Minutos += (minutos + MinTemp);
				Horas += horas;
			}
		} else {
			Segundos += segundos;
			if((Minutos + minutos) > 59){
				int HorTemp = ((Minutos + minutos)/60);
				Minutos = ((Minutos + minutos)%60);
				Horas += (HorTemp + horas);
			} else {
				Minutos += minutos;
				Horas += horas;
			}
		}
	}
	
	public void Subtracao(Tempo somador) { 		//Subtrair dois objetos e colocar o resultado no objeto que o chamou;
		int segundos = somador.Segundos;
		int minutos = somador.Minutos;
		int horas = somador.Horas;
		if((Segundos - segundos) < 00) {
			Segundos = (60 - Math.abs(segundos - Segundos));
			if(((Minutos - minutos - 1) < 00)){
				Minutos = (60 - Math.abs(Minutos - minutos - 1));
				Horas -= (horas + 1);
			} else {
				Minutos -= minutos;
				Horas -= horas;
			}
		} else {
			Segundos -= segundos;
			if((Minutos - minutos) < 00){
				Minutos = (60 - Math.abs(Minutos - minutos));
				Horas -= (horas + 1);
			} else {
				Minutos -= minutos;
				Horas -= horas;
			}
		}
		if((Horas) < 00) {
			Segundos = 0;
			Minutos = 0;
			Horas = 0;
		}
	}
	
	public Tempo Somar(Tempo somador) { 		//Somar dois objetos e retornar outro objeto com o resultado;
			int segundos = somador.Segundos;
			int minutos = somador.Minutos;
			int horas = somador.Horas;
			int Segundos = this.Segundos;
			int Minutos = this.Minutos;
			int Horas = this.Horas;
						
		if((Segundos + segundos) > 59) {
			int MinTemp = ((Segundos + segundos)/60);
			Segundos = ((Segundos + segundos)%60);
			if((Minutos + MinTemp + minutos) > 59){
				int HorTemp = ((Minutos + MinTemp + minutos)/60);
				Minutos = ((Minutos + MinTemp + minutos)%60);
				Horas += (HorTemp + horas);
			} else {
				Minutos += (minutos + MinTemp);
				Horas += horas;
			}
		} else {
			Segundos += segundos;
			if((Minutos + minutos) > 59){
				int HorTemp = ((Minutos + minutos)/60);
				Minutos = ((Minutos + minutos)%60);
				Horas += (HorTemp + horas);
			} else {
				Minutos += minutos;
				Horas += horas;
			}
		}
		Tempo resultado = new Tempo(Horas, Minutos, Segundos);
		return resultado;
	}
	
	public Tempo Subtrair(Tempo somador) { 		//Subtrair dois objetos e retornar outro objeto com o resultado;
		int segundos = somador.Segundos;
		int minutos = somador.Minutos;
		int horas = somador.Horas;
		int Segundos = this.Segundos;
		int Minutos = this.Minutos;
		int Horas = this.Horas;
		
		if((Segundos - segundos) < 00) {
			Segundos = (60 - Math.abs(segundos - Segundos));
			if(((Minutos - minutos - 1) < 00)){
				Minutos = (60 - Math.abs(Minutos - minutos - 1));
				Horas -= (horas + 1);
			} else {
				Minutos -= minutos;
				Horas -= horas;
			}
		} else {
			Segundos -= segundos;
			if((Minutos - minutos) < 00){
				Minutos = (60 - Math.abs(Minutos - minutos));
				Horas -= (horas + 1);
			} else {
				Minutos -= minutos;
				Horas -= horas;
			}
		}
		if((Horas) < 00) {
			Segundos = 0;
			Minutos = 0;
			Horas = 0;
		}
		Tempo resultado = new Tempo(Horas, Minutos, Segundos);
		return resultado;
	}
	
	
	public int getSegundos() {
		return Segundos;
	}
	public int getMinutos() {
		return Minutos;
	}
	public int getHoras() {
		return Horas;
	}
	public void setSegundos(int segundos) {
		Segundos = segundos;
	}
	public void setMinutos(int minutos) {
		Minutos = minutos;
	}
	public void setHoras(int horas) {
		Horas = horas;
	}
	
	public String Apresentar() {
		if(this.Minutos < 10) {
			this.horaPronta = (this.Horas+":0"+this.Minutos+":"+this.Segundos);
		}else {
			this.horaPronta = (this.Horas+":"+this.Minutos+":"+this.Segundos);
		}
		return horaPronta;
	}
	public String getHorario() {
		Apresentar();
		return horaPronta;
	}
	
}