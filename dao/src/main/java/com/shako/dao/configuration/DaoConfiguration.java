package com.shako.dao.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.sql.DataSource;

public class DaoConfiguration {

	private ComboPooledDataSource ds = new ComboPooledDataSource();

	{
		try {
			ds.setDriverClass("org.postgres.Driver");
			ds.setUser("shako");
			ds.setPassword("");
			ds.setJdbcUrl("jdbc:postgresql://127.0.0.1:5432/testdb");

			DataSource dsrc = DataSources.unpooledDataSource(
					"jdbc:postgresql://127.0.0.1:5432/testdb",
					"shako",
					""
			);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new DaoConfiguration();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("enterprise-dao-jpa");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();

		em.persist(new Object());

		tx.commit();

		em.clear();
		em.close();
		emf.close();
	}
}
