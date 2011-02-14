package br.com.minhaadega.repositories;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import com.googlecode.objectify.Objectify;

public class Repository<T, I extends Serializable> {
	
	protected final Objectify objectify;
	
	public Repository(Objectify objectify) {
		this.objectify = objectify;
	}
	
	public void create(T entity) {
		objectify.put(entity);
	}
	
	public void update(T entity) {
		objectify.put(entity);
	}
	
	public void destroy(T entity) {
		objectify.delete(entity);
	}
	
	public T find(I id) {
		return objectify.get(getParameterizedClass(), Long.parseLong("" + id));
	}
	
	public List<T> findAll() {
		return objectify.query(getParameterizedClass()).list();
	}
	
	@SuppressWarnings("unchecked")
	private Class<T> getParameterizedClass() {
		ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
		return (Class<T>) parameterizedType.getActualTypeArguments()[0];
	}
}
