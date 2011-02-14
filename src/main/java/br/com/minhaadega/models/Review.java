package br.com.minhaadega.models;

import com.googlecode.objectify.Key;

public class Review extends Entity {
	
	private String data;
	private Integer nota;
	private Key<Vinho> vinho;
	private String usuario;
	private String impressoes;
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	
	public Integer getNota() {
		return nota;
	}
	
	public void setVinho(Key<Vinho> vinho) {
		this.vinho = vinho;
	}
	
	public Key<Vinho> getVinho() {
		return vinho;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setImpressoes(String impressoes) {
		this.impressoes = impressoes;
	}
	
	public String getImpressoes() {
		return impressoes;
	}
	
}
