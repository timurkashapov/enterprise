package com.shako.impl;

import com.shako.Dao;

import javax.persistence.EntityManager;

public class DaoImpl implements Dao {

	private EntityManager entityManager;

	public DaoImpl() {}
	public DaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void create() {

	}

	@Override
	public void read() {

	}

	@Override
	public void update() {

	}

	@Override
	public void delete() {

	}
}
