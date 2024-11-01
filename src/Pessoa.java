public class Pessoa {
	private String nome;
	private double cpf;
	private double matricula;
	private double telefone;
	private String email;
	private String endereco;
	protected String disciplina;

    
    public Pessoa (String nome, double cpf, double matricula, double telefone, String email, String endereco, String disciplina) {
    	this.nome = nome;
    	this.cpf = cpf;
    	this.matricula = matricula;
    	this.telefone = telefone;
    	this.email = email;
    	this.endereco = endereco;
    }

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getCpf() {
		return cpf;
	}


	public void setCpf(double cpf) {
		this.cpf = cpf;
	}


	public double getMatricula() {
		return matricula;
	}


	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}


	public double getTelefone() {
		return telefone;
	}


	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
    
}

