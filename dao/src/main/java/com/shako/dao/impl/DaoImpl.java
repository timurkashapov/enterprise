package com.shako.dao.impl;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.shako.dao.Dao;
import com.shako.model.Roster;

import javax.persistence.EntityManager;

public class DaoImpl implements Dao {

	private EntityManager entityManager;
	private JPAQueryFactory queryFactory;
	private JPAQuery query;

	public DaoImpl() {}
	public DaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void create() {

		entityManager.close();
	}

	@Override
	public void read() {
		entityManager.find(Roster.class, new Roster());

		entityManager.close();
	}

	@Override
	public void update() {
		entityManager.close();
	}

	@Override
	public void delete() {
		entityManager.close();
	}
}
