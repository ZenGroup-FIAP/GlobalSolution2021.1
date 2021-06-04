package br.blog.users;

public class Adiministrador {
	protected String nome;
	protected String senha;
	protected String email;
	protected int id;
	protected String tipoUsuario;
	
	public Adiministrador() {
		super();
		this.tipoUsuario = "adm";
	}
	
	public Adiministrador(String nome, String senha, String email, int id) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.id = id;
		this.tipoUsuario = "adm";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
}
