package br.com.minhaadega.models;

import java.util.ArrayList;
import java.util.List;

import com.googlecode.objectify.Key;

public class Usuario extends Entity {
	
	private Integer nivel;
	private String nome;
	private Key<Vinho>[] vinhosNaAdega;
	private String reviews;
	private String login;
	private String email;
	
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	
	public Integer getNivel() {
		return nivel;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
		
	public void setVinhosNaAdega(Key<Vinho>[] vinhosNaAdega) {
		this.vinhosNaAdega = vinhosNaAdega;
	}
	
	public Key<Vinho>[] getVinhosNaAdega() {
		return vinhosNaAdega;
	}
	
	public List<Key<Vinho>> getVinhosNaAdegaComoLista() {
		List<Key<Vinho>> list = new ArrayList<Key<Vinho>>();
		for (int i = 0; i < vinhosNaAdega.length; i++) {
			list.add(vinhosNaAdega[i]);
		}
		return list;
	}
	
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	
	public String getReviews() {
		return reviews;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
}