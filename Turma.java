package projetoEscola;

public class Turma {

	private int idTurma;
	private String turmaDescrição;
	
	
	public Turma() {
		
	}


	public Turma(int idTurma, String turmaDescrição) {
		super();
		this.idTurma = idTurma;
		this.turmaDescrição = turmaDescrição;
	
	}
	

	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

	public String getTurmaDescrição() {
		return turmaDescrição;
	}

	public void setTurmaDescrição(String turmaDescrição) {
		this.turmaDescrição = turmaDescrição;
	}
	
	
	
		
}
