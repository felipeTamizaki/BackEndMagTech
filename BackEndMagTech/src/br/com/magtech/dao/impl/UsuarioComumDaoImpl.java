package br.com.magtech.dao.impl;

import javax.persistence.EntityManager;

import br.com.magtech.dao.UsuarioComumDao;
import br.com.magtech.entity.UsuarioComum;

public class UsuarioComumDaoImpl extends GenericDAOImpl<UsuarioComum, Integer> implements UsuarioComumDao{

	public UsuarioComumDaoImpl(EntityManager manager) {
		super(manager);
	}
}
