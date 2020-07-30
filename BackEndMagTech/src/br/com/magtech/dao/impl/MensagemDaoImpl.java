package br.com.magtech.dao.impl;

import javax.persistence.EntityManager;

import br.com.magtech.dao.MensagemDao;
import br.com.magtech.entity.Mensagem;

public class MensagemDaoImpl extends GenericDAOImpl<Mensagem, Integer> implements MensagemDao{

	public MensagemDaoImpl(EntityManager manager) {
		super(manager);
	}
	
}
