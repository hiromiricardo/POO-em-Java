package aluno;

public class Aluno {

	private String Nome;
	private int Serie;
	private String Grau;
	private int id;
	private static int numeroDeAlunos = 0;

	public Aluno() {
		id = ++numeroDeAlunos;
	}

	public int getID() {
		return id;
	}
	
	public String getNome() {
		return Nome;
	}

	public int getSerie() {
		return Serie;
	}

	public String getGrau() {
		return Grau;
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	public void setSerie(int serie) {
		this.Serie = serie;
	}

	public void setGrau(String grau) {
		this.Grau = grau;
	}
	
}
