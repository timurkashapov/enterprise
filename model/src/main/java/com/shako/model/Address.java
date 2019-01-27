package com.shako.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	/**
	 * Служебный идентификатор записи.
	 */
	@Id
	private int id;

	/**
	 * Индекс.
	 */
	@Column
	private String zip;

	/**
	 * Наименование города.
	 */
	@Column
	private String city;

	/**
	 * Наименование улицы
	 */
	@Column
	private String street;

}
