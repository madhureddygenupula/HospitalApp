package com.ty.hospital.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.User;


public class UserDao {


	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction;
	
	public void craeteUser(User user,int branchId)
	{
		BranchDao dao=new BranchDao();
		Branch branch=dao.getBranchById(branchId);
		
		
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
		user.setBranch(branch);
		entityManager.persist(user);
		
		entityTransaction.commit();
}
	
	public List<User> getAllUsers()
	{
		Query query=entityManager.createQuery("Select u from User u");
		return query.getResultList();
	}
	public boolean deleteUser(int id) {
		entityTransaction =entityManager.getTransaction();
		
		User user= entityManager.find(User .class, id);
		if(user !=null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
			
		}else {
			return false;
		}
	}
	
	public User getUserById(int id)
	{
		return entityManager.find(User.class, id);
	}
	
	public void updateStudent(User user)
	{
		entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.merge(user);

		entityTransaction.commit();
}
	
	public User validateUser(String email,String password) {
		Query query = entityManager.createQuery("SELECT u FROM User u WHERE email=?1 and password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		
		List<User> users=query.getResultList();
		if(users != null &&users.size()>0)
		{
			return users.get(0);
			
		} else {
			return null;
		}
	}
}