package estacionamento;

import tempo.Tempo;

public class Estacionamento {

	private String placa;
	private String modelo;
	private int minEnt;
	private int horEnt;
	private int minSai;
	private int horSai;
	private Tempo hEntrada;
	private Tempo hSaida;
	

	public Estacionamento() {
		this.placa = "";
		this.modelo = "";
		this.hEntrada = Time(00, 00);
		this.hSaida = Time(00, 00);
	}
	
	public Estacionamento(String placa, String modelo, int horEnt, int minEnt, int horSai, int minSai) {
		this.placa = placa;
		this.modelo = modelo;
		this.hEntrada = Time(horEnt, minEnt);
		this.hSaida = Time(horSai, minSai);
	}
	
	public void Dados() {
		Tempo hE = this.hEntrada;
		String hEnt = hE.Apresentar();
		Tempo hS = this.hSaida;
		String hSai = hS.Apresentar();
		
		System.out.println("Veiculo Placa: "+this.getPlaca()+" e Modelo: "+this.getModelo()+".");
		System.out.println("Entrou as: "+hEnt+"0, Saiu as: "+hSai+"0 e Pagou: R$ "+this.ValorPag()+"0.");
	}
	
	public double ValorPag() {
		Tempo tempoEst = this.hSaida.Subtrair(hEntrada);
		int horaEst = tempoEst.getHoras();
		int minEst = tempoEst.getMinutos();
		
		if(minEst > 10) {			//10 minutos de carencia, antes de cobrar a proxima hora.
			horaEst += 1;
		}
		double valor = (1.50 * horaEst);
		return valor;
	}
	
	public Tempo Time(int horas, int minutos) {
		int segundos = 00;
		Tempo time = new Tempo(horas, minutos, segundos);
		return time;
	}
	
	public String getPlaca() {
		return placa;
	}
	public String getModelo() {
		return modelo;
	}
	public int getMinEnt() {
		return minEnt;
	}
	public int getHorEnt() {
		return horEnt;
	}
	public int getMinSai() {
		return minSai;
	}
	public int getHorSai() {
		return horSai;
	}
	public Tempo gethEntrada() {
		return hEntrada;
	}
	public Tempo gethSaida() {
		return hSaida;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setMinEnt(int minEnt) {
		this.minEnt = minEnt;
	}
	public void setHorEnt(int horEnt) {
		this.horEnt = horEnt;
	}
	public void setMinSai(int minSai) {
		this.minSai = minSai;
	}
	public void setHorSai(int horSai) {
		this.horSai = horSai;
	}
	public void setTempoEnt(int hora, int minuto) {
		this.hEntrada = Time(hora, minuto);
	}
	public void setTempoSai(int hora, int minuto) {
		this.hSaida = Time(hora, minuto);
	}
	
}
