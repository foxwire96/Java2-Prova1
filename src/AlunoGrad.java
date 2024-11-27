public class AlunoGrad extends Aluno {
	String projetoIntegrador;
	
	public AlunoGrad(String nome, double cpf, double matricula, double telefone, String email, String endereco,
			String disciplina) {
		super(nome, cpf, matricula, telefone, email, endereco);
		
	}

public void solicitarBoleto () {
	System.out.println("Boleto solicitado por "+getNome());
}

public void solicitarHistorico () {
	System.out.println("Histórico solicitado por: "+getNome());
}
}
