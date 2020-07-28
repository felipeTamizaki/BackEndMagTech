package br.com.magtech.dao.impl;

import javax.persistence.EntityManager;

import br.com.magtech.dao.LoginDao;
import br.com.magtech.entity.Login;

public class LoginDaoImpl extends GenericDAOImpl<Login, Integer> implements LoginDao{

	public LoginDaoImpl(EntityManager manager) {
		super(manager);
	}

}
