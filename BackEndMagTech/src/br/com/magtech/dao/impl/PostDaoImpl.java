package br.com.magtech.dao.impl;

import javax.persistence.EntityManager;

import br.com.magtech.dao.PostDao;
import br.com.magtech.entity.Post;

public class PostDaoImpl extends GenericDAOImpl<Post, Integer> implements PostDao{

	public PostDaoImpl(EntityManager manager) {
		super(manager);
	}
}
