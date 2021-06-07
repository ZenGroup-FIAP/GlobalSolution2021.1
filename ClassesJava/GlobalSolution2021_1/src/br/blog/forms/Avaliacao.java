package br.blog.forms;

public class Avaliacao {
	private String comentario;
	private double nota;
	private int idUsuario;
	private int idHotel;
	private int id;
	
	public Avaliacao() {
		super();
	}
	
	public Avaliacao(String comentario, double nota, int idUsuario, int idHotel, int id) {
		super();
		this.comentario = comentario;
		this.nota = nota;
		this.idUsuario = idUsuario;
		this.idHotel = idHotel;
		this.id = id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
}
