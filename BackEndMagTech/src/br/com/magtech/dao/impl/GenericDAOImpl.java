package br.com.magtech.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.magtech.dao.GenericDAO;
import br.com.magtech.exception.FailCommitException;
import br.com.magtech.exception.KeyNotFoundException;

public class GenericDAOImpl<T, K> implements GenericDAO<T, K>{
	
	private EntityManager manager;
	
	private Class<T> clazz;
	
	@SuppressWarnings("unchecked")
	public GenericDAOImpl(EntityManager manager) {
		this.manager = manager;
		clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public void create(T entity) {
		manager.persist(entity);
	}

	@Override
	public T read(K key) throws KeyNotFoundException{
		T entity = manager.find(clazz, key);
		if(entity == null) {
			throw new KeyNotFoundException();
		}
		return entity;
	}

	@Override
	public void update(T entity) {
		manager.merge(entity);
	}

	@Override
	public void delete(K key) throws KeyNotFoundException{
		T entity = read(key);
		manager.remove(entity);
	}

	@Override
	public void commit() throws FailCommitException{	
		try {
			manager.getTransaction().begin();
			manager.getTransaction().commit();
		}catch (Exception e) {
			e.getStackTrace();
			manager.getTransaction().rollback();
			throw new FailCommitException();
		}
	}	
	
}
