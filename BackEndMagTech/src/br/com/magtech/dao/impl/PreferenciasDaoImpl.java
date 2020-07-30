package br.com.magtech.dao.impl;

import javax.persistence.EntityManager;

import br.com.magtech.dao.PreferenciaDao;
import br.com.magtech.entity.Preferencias;

public class PreferenciasDaoImpl extends GenericDAOImpl<Preferencias, Integer> implements PreferenciaDao{

	public PreferenciasDaoImpl(EntityManager manager) {
		super(manager);
	}
	
}
