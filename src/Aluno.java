public class Aluno extends Pessoa{

	public Aluno(String nome, double cpf, double matricula, double telefone, String email, String endereco) {
		super(nome, cpf, matricula, telefone, email, endereco);

	}

public void solicitarBoleto () {
	System.out.println("Boleto solicitado por "+getNome());
}

public void solicitarHistorico () {
	System.out.println("Histórico solicitado por: "+getNome());
}
    
    
}

