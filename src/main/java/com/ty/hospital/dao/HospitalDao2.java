package com.ty.hospital.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital.dto.Address;
import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Hospital;
import com.ty.hospital.dto.Items;
import com.ty.hospital.dto.Orders;
import com.ty.hospital.dto.Person;


public class HospitalDao2 {
	EntityManagerFactory entityManagerFactory;
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	public EntityManager getEntityManager() {
		entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		return entityManagerFactory.createEntityManager();
	}

	public void addHospital(Hospital hospital) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
	}

	public void addBranch(Branch branch) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(branch);
		entityTransaction.commit();
	}

	public void addAddres(Address adress) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(adress);
		entityTransaction.commit();
	}

	public void addPerson(Person person) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}

	public void addEncounter(Encounter encounter) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(encounter);
		entityTransaction.commit();
	}

	public void addOrder(Orders orders) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(orders);
		entityTransaction.commit();
	}

	public void addItem(Items item) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(item);
		entityTransaction.commit();
	}

	public void deleteItem(int id) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Orders item = entityManager.find(Orders.class, id);
		entityManager.remove(item);
		entityTransaction.commit();
	}

	public void deleteOrders(int id) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Orders orders = entityManager.find(Orders.class, id);
		entityManager.remove(orders);
		entityTransaction.commit();
	}

	public void deleteEncounter(int id) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Encounter encounter = entityManager.find(Encounter.class, id);
		entityManager.remove(encounter);
		entityTransaction.commit();
	}

	public void deletePerson(int id) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Person person = entityManager.find(Person.class, id);
		entityManager.remove(person);
		entityTransaction.commit();
	}

	public void deleteBranch(int id) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Branch branch = entityManager.find(Branch.class, id);
		entityManager.remove(branch);
		entityTransaction.commit();
	}

	public void deleteAdress(int id) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Address adress = entityManager.find(Address.class, id);
		entityManager.remove(adress);
		entityTransaction.commit();
	}

	public void deleteHospital(int id) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Hospital hospital = entityManager.find(Hospital.class, id);
		entityManager.remove(hospital);
		entityTransaction.commit();
	}

	public Hospital getHospital(int id) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Hospital hospital = entityManager.find(Hospital.class, id);
		entityTransaction.commit();
		return hospital;
	}

	public Branch getBranch(int id) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Branch branch = entityManager.find(Branch.class, id);
		entityTransaction.commit();
		return branch;
	}

	public Address getAdress(int id) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Address adress = entityManager.find(Address.class, id);
		entityTransaction.commit();
		return adress;
	}

	public Person getPerson(int id) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Person person = entityManager.find(Person.class, id);
		entityTransaction.commit();
		return person;
	}

	public Encounter getEncounter(int id) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Encounter encounter = entityManager.find(Encounter.class, id);
		entityTransaction.commit();
		return encounter;
	}

	public Orders getOrders(int id) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Orders orders = entityManager.find(Orders.class, id);
		entityTransaction.commit();
		return orders;
	}

	public Items getItem(int id) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Items item = entityManager.find(Items.class, id);
		entityTransaction.commit();
		return item;
	}

	public List<Hospital> getHospitalList() {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query query = entityManager.createQuery("select x from Hospital x");
		List<Hospital> list = query.getResultList();
		entityTransaction.commit();
		return list;
	}

	public List<Branch> getBranchList() {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query query = entityManager.createQuery("select x from Branch x");
		List<Branch> list = query.getResultList();
		entityTransaction.commit();
		return list;
	}

	public List<Address> getAdressList() {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query query = entityManager.createQuery("select x from Adress x");
		List<Address> list = query.getResultList();
		entityTransaction.commit();
		return list;
	}

	public List<Person> getPersonList() {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query query = entityManager.createQuery("select x from Person x");
		List<Person> list = query.getResultList();
		entityTransaction.commit();
		return list;
	}

	public List<Encounter> getEncounterList() {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query query = entityManager.createQuery("select x from Encounter x");
		List<Encounter> list = query.getResultList();
		entityTransaction.commit();
		return list;
	}

	public List<Orders> getOrdersList() {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query query = entityManager.createQuery("select x from Orders x");
		List<Orders> list = query.getResultList();
		entityTransaction.commit();
		return list;
	}

	public List<Items> getItemList() {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query query = entityManager.createQuery("select x from Items x");
		List<Items> list = query.getResultList();
		entityTransaction.commit();
		return list;
	}  
	
	public void updateHospital(Hospital hospital) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(hospital);
		entityTransaction.commit();
	}
	
	public void updateBranch(Branch branch) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(branch);
		entityTransaction.commit();
	}
	public void updateAdress(Address adress) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(adress);
		entityTransaction.commit();
	}
	public void updatePerson(Person person) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();
	}
	public void updateEncounter(Encounter encounter) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(encounter);
		entityTransaction.commit();
	}
	public void updateOrders(Orders orders) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(orders);
		entityTransaction.commit();
	}
	public void updateItem(Items item) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(item);
		entityTransaction.commit();
	}
}