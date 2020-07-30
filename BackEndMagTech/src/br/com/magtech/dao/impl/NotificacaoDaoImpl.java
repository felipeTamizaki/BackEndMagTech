package br.com.magtech.dao.impl;

import javax.persistence.EntityManager;

import br.com.magtech.dao.NotificacaoDao;
import br.com.magtech.entity.Notificacao;

public class NotificacaoDaoImpl extends GenericDAOImpl<Notificacao, Integer> implements NotificacaoDao{

	public NotificacaoDaoImpl(EntityManager manager) {
		super(manager);
	}
	
}
