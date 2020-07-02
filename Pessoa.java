package projetoEscola;

import sef.module8.sample.CustomException;

public class Pessoa {
	
	//********* Atributos *******************	
		private int IDpessoa;  //Matricula
		private String PESSOANome;
		private String PESSOACPF;
	//	private  PESSOASexo;				// enum
	//	private  TipoAluno;			// enum
		private int Turma_idTurma;
	//***************************************

		
		
	//**************** CONSTRUTOR ***********	
		public Pessoa() {
			super();
			// TODO Auto-generated constructor stub
		}
	public Pessoa(int iDpessoa, String pESSOANome, String pESSOACPF, int turma_idTurma) {
		super();
		IDpessoa = iDpessoa;
		PESSOANome = pESSOANome;
		PESSOACPF = pESSOACPF;
		Turma_idTurma = turma_idTurma;
	}
	//****************************************
	
	//********* VALIDAÇÕES *************
	
	public void StringVazia() throws CampoVazio {
		
		if(PESSOANome == null) {
			throw new CampoVazio ();
		}
		
	}
	
	
	
	
	
	
	

	//********** GET E SETS ******************	
	public int getIDpessoa() {
		return IDpessoa;
	}
	public void setIDpessoa(int iDpessoa) {
		IDpessoa = iDpessoa;
	}
	public String getPESSOANome() {
		return PESSOANome;
	}
	public void setPESSOANome(String pESSOANome) {
		PESSOANome = pESSOANome;
	}
	public String getPESSOACPF() {
		return PESSOACPF;
	}
	public void setPESSOACPF(String pESSOACPF) {
		PESSOACPF = pESSOACPF;
	}
	public int getTurma_idTurma() {
		return Turma_idTurma;
	}
	public void setTurma_idTurma(int turma_idTurma) {
		Turma_idTurma = turma_idTurma;
	}


}
