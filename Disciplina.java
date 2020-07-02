package projetoEscola;

public class Disciplina {
	
	private int IDdisciplina;
	private String DisciplinaNome;
	private int DisciplinaCreditos;
	
	
	public Disciplina(){
		
	}
	
	public Disciplina(int iDdisciplina, String disciplinaNome, int disciplinaCreditos){
		super();
		IDdisciplina = iDdisciplina;
		DisciplinaNome = disciplinaNome;
		DisciplinaCreditos = disciplinaCreditos;
	}

	public int getIDdisciplina() {
		return IDdisciplina;
	}

	public void setIDdisciplina(int iDdisciplina) {
		IDdisciplina = iDdisciplina;
	}

	public String getDisciplinaNome() {
		return DisciplinaNome;
	}

	public void setDisciplinaNome(String disciplinaNome) {
		DisciplinaNome = disciplinaNome;
	}

	public int getDisciplinaCreditos() {
		return DisciplinaCreditos;
	}

	public void setDisciplinaCreditos(int disciplinaCreditos) {
		DisciplinaCreditos = disciplinaCreditos;
	}
	
	
	

}
