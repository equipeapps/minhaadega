package br.com.minhaadega.models;

public class Vinho extends Entity {
	
	private String codigoDeBarras;
	private String nome;
	private Float notaMedia;
	private Float teorAlcoolico;
	private Float precoMedio;
	private String produtor;
	private String reviews;
	private String castas;
	private String safra;
	
	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}
	
	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNotaMedia(Float notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	public Float getNotaMedia() {
		return notaMedia;
	}
	
	public void setTeorAlcoolico(Float teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}
	
	public Float getTeorAlcoolico() {
		return teorAlcoolico;
	}
	
	public void setPrecoMedio(Float precoMedio) {
		this.precoMedio = precoMedio;
	}
	
	public Float getPrecoMedio() {
		return precoMedio;
	}
	
	public void setProdutor(String produtor) {
		this.produtor = produtor;
	}
	
	public String getProdutor() {
		return produtor;
	}
	
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	
	public String getReviews() {
		return reviews;
	}
	
	public void setCastas(String castas) {
		this.castas = castas;
	}
	
	public String getCastas() {
		return castas;
	}
	
	public void setSafra(String safra) {
		this.safra = safra;
	}
	
	public String getSafra() {
		return safra;
	}
}