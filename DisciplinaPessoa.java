package projetoEscola;

public class DisciplinaPessoa {

	private int Disciplina_IDDisciplina;
	private int Aluno_IDPessoa;
	private int Aluno_IDAluno;
	
	
	public DisciplinaPessoa() {
		super();
	}


	public DisciplinaPessoa(int disciplina_IDDisciplina, int aluno_IDPessoa, int aluno_IDAluno) {
		super();
		Disciplina_IDDisciplina = disciplina_IDDisciplina;
		Aluno_IDPessoa = aluno_IDPessoa;
		Aluno_IDAluno = aluno_IDAluno;
	}


	public int getDisciplina_IDDisciplina() {
		return Disciplina_IDDisciplina;
	}


	public void setDisciplina_IDDisciplina(int disciplina_IDDisciplina) {
		Disciplina_IDDisciplina = disciplina_IDDisciplina;
	}


	public int getAluno_IDPessoa() {
		return Aluno_IDPessoa;
	}


	public void setAluno_IDPessoa(int aluno_IDPessoa) {
		Aluno_IDPessoa = aluno_IDPessoa;
	}


	public int getAluno_IDAluno() {
		return Aluno_IDAluno;
	}


	public void setAluno_IDAluno(int aluno_IDAluno) {
		Aluno_IDAluno = aluno_IDAluno;
	} 
	
	
}


