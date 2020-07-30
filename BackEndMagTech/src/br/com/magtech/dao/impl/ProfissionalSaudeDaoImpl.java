package br.com.magtech.dao.impl;

import javax.persistence.EntityManager;

import br.com.magtech.dao.ProfissionalSaudeDao;
import br.com.magtech.entity.ProfissionalSaude;

public class ProfissionalSaudeDaoImpl extends GenericDAOImpl<ProfissionalSaude, Integer> implements ProfissionalSaudeDao{

	public ProfissionalSaudeDaoImpl(EntityManager manager) {
		super(manager);
	}
}
