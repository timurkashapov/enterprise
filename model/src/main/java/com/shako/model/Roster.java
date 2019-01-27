package com.shako.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(
		name = "ROSTER",
		indexes = {},
		uniqueConstraints = {}
)
public class Roster {

	/**
	 * Служебный идентификатор записи.
	 */
	@Id
	private String id;

	/**
	 * Наименование реестра.
	 */
	@Column
	private String name;

	/**
	 * Уникальный идентификатор.
	 */
	@Column
	private String uuid;

	/**
	 * Дата прихода реестра.
	 */
	@Column
	private Date relativeDate;

	/**
	 * Дата создания реестра.
	 */
	@Column
	private Date createDate;

	public Roster() {}

	private String getId() {
		return id;
	}
	private void setId(final String id) {
		this.id = id;
	}
	private String getName() {
		return name;
	}
	private void setName(final String name) {
		this.name = name;
	}
	private String getUuid() {
		return uuid;
	}
	private void setUuid(final String uuid) {
		this.uuid = uuid;
	}
	private Date getRelativeDate() {
		return relativeDate;
	}
	private void setRelativeDate(final Date relativeDate) {
		this.relativeDate = relativeDate;
	}
	private Date getCreateDate() {
		return createDate;
	}
	private void setCreateDate(final Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		final Roster roster = (Roster) o;
		return Objects.equals(id, roster.id) &&
				Objects.equals(name, roster.name) &&
				Objects.equals(uuid, roster.uuid) &&
				Objects.equals(relativeDate, roster.relativeDate) &&
				Objects.equals(createDate, roster.createDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, uuid, relativeDate, createDate);
	}
}
