package br.com.magtech.dao.impl;

import javax.persistence.EntityManager;

import br.com.magtech.dao.ConfiguracaoDao;
import br.com.magtech.entity.ConfiguracaoGeral;

public class ConfiguracaoDaoImpl extends GenericDAOImpl<ConfiguracaoGeral, Integer> implements ConfiguracaoDao{

	public ConfiguracaoDaoImpl(EntityManager manager) {
		super(manager);
	} 
	
}
