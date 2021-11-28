package leitortempo;

public class Pilotos {
	private String nome;
	private double[] tempoVolta = {0,0,0,0,0};
	private static String melhorTempo;
	private String melhorVolta;
	private String piorVolta;
	private String mediaTempo;
	
	
	public Pilotos(){
	}
	
	
	public void melhorVolta(Pilotos piloto) {
		double mt = piloto.getTempoVolta(0);
		int mv = 1;
		for (int v=1;v<5;v++) {
			double temp = piloto.getTempoVolta(v);
			if 	(temp < mt) {
				mt = temp;
				mv = v+1;
			}
		}
		piloto.setMelhorVolta(mv, mt);
	}
	
	public void piorVolta(Pilotos piloto) {
		double pt = piloto.getTempoVolta(0);
		int pv = 1;
		for (int v=1;v<5;v++) {
			double temp = piloto.getTempoVolta(v);
			if 	(temp > pt) {
				pt = temp;
				pv = v+1;
			}
		}
		piloto.setPiorVolta(pv,pt);
	}
	
	public void mediaTempo(Pilotos piloto) {
		double mediaT = 0;
		for (int v=0;v<5;v++) {
			double temp = piloto.getTempoVolta(v);
			mediaT += temp;
		}
		piloto.setMediaTempo(mediaT/5);
	}

	public static String getMelhorTempo() {
		return melhorTempo;
	}
	public static String SetMelhorTempo(String nome, int volta, double tempo) {
		melhorTempo = ("O melhor tempo de volta foi do piloto " + nome + " na volta " + volta + " com o tempo de "
							+ tempo + " segundos.");
		return melhorTempo;
	}
	
	public String getNome() {
		return nome;
	}
	public double getTempoVolta(int v) {
		return tempoVolta[v];
	}
	public String getMelhorVolta() {
		melhorVolta(this);
		return melhorVolta;
	}
	public String getPiorVolta() {
		piorVolta(this);
		return piorVolta;
	}
	public String getMediaTempo() {
		mediaTempo(this);
		return mediaTempo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTempoVolta(int p, double tempo) {
		this.tempoVolta[p] = tempo;
	}
	public void setMelhorVolta(int mVolta, double mTempo) {
		this.melhorVolta = ("A melhor volta foi a " + mVolta + " e o tempo foi de " + mTempo + " segundos.");
	}

	public void setPiorVolta(int pVolta, double pTempo) {
		this.piorVolta = ("A pior volta foi a " + pVolta + " e o tempo foi de " + pTempo + " segundos.");
	}

	public void setMediaTempo(double mediaTempo) {
		this.mediaTempo = ("A media de tempo por volta foi de " + mediaTempo + " segundos");
	}


	
}
