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

public class AddressDao {


	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction;
	BranchDao branchDao=new BranchDao();
	
	public boolean createAddress(int branchId,Address address)
	{
		Branch branch=branchDao.getBranchById(branchId);
		
		if(branch !=null )
		{
		entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		address.setBranch(branch);
		entityManager.persist(address);
		entityTransaction.commit();
		return true;
		}
		else
		{
			return false;
		}
		
}
	public Address getAddressById(int id)
	{
		return entityManager.find(Address.class, id);
	}
	public List<Address> getAllAddress() {
		Query query=entityManager.createQuery("select a from Address a");
		return query.getResultList();
	}
	
	public void updateAddress(Address address) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(address);
		entityTransaction.commit();
		
	}
	public boolean deleteAddress(int id) {
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Address address=entityManager.find(Address.class, id);
		if(address !=null) {
			entityTransaction.begin();
			entityManager.remove(address);
			entityTransaction.commit();
			return true;
		}
		else
			return false;
	}
}
