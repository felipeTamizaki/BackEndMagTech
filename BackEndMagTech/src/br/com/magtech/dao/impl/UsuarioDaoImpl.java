package br.com.magtech.dao.impl;

import javax.persistence.EntityManager;

import br.com.magtech.dao.UsuarioDao;
import br.com.magtech.entity.Usuario;

public class UsuarioDaoImpl extends GenericDAOImpl<Usuario, Integer> implements UsuarioDao{

	public UsuarioDaoImpl(EntityManager manager) {
		super(manager);
	}
}
