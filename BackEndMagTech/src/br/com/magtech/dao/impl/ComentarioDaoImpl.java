package br.com.magtech.dao.impl;

import javax.persistence.EntityManager;

import br.com.magtech.dao.ComentarioDao;
import br.com.magtech.entity.Comentario;

public class ComentarioDaoImpl extends GenericDAOImpl<Comentario, Integer> implements ComentarioDao{

	public ComentarioDaoImpl(EntityManager manager) {
		super(manager);
	}
}
