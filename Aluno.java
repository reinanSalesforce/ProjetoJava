package projetoEscola;

public class Aluno extends Pessoa {
	
	private int IDaluno;	//Matricula
	private double AlunoVLMensalidade = 1000; //calculo 
//	private AlunoTipoBolsa;  // enum 
	
	
	//********* Construtor ***********
	
	public Aluno() {
		super();
		
	}
	public Aluno(int iDpessoa, String pESSOANome, String pESSOACPF, int turma_idTurma) {
		super(iDpessoa, pESSOANome, pESSOACPF, turma_idTurma);
		
	}
	public Aluno(int iDaluno, double alunoVLMensalidade) {
		super();
		IDaluno = iDaluno;
		AlunoVLMensalidade = alunoVLMensalidade;
	}

	
	//********* GET E SET ***********
	
	public int getIDaluno() {
		return IDaluno;
	}
	public void setIDaluno(int iDaluno) {
		IDaluno = iDaluno;
	}
	public double getAlunoVLMensalidade() {
		return AlunoVLMensalidade;
	}
	public void setAlunoVLMensalidade(double alunoVLMensalidade) {
		AlunoVLMensalidade = alunoVLMensalidade;
	}
	
	
	
}
