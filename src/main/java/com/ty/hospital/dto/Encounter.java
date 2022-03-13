package com.ty.hospital.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate createdDateTime;
	private String reason;
	private String creatorName;
	
	@JoinColumn
	@ManyToOne
	private Person person;
	@OneToMany(mappedBy = "encounter")
	private List<Orders> orders;
	@JoinColumn
	@ManyToOne
	private Branch branch;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(LocalDate createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatotName) {
		this.creatorName = creatotName;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Encounter [id=" + id + ", createdDateTime=" + createdDateTime + ", reason=" + reason + ", creatorName="
				+ creatorName + ", person=" + person + ", orders=" + orders + ", branch=" + branch + "]";
	}

}