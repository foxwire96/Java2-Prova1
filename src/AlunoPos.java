public class AlunoPos extends Aluno{
	String tcc;

	public AlunoPos(String nome, double cpf, double matricula, double telefone, String email, String endereco,
			String disciplina) {
		super(nome, cpf, matricula, telefone, email, endereco, disciplina);

	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
public void inscreverDisciplina (String disciplina) {
	this.disciplina = disciplina;
	}

public void solicitarBoleto () {
	System.out.println("Boleto solicitado por "+getNome());
}

public void solicitarHistorico () {
	System.out.println("Histórico solicitado por: "+getNome());
}
}
