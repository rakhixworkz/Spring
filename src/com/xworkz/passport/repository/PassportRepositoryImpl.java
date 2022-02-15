package com.xworkz.passport.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.util.SingletonEmf;

public class PassportRepositoryImpl implements PassportRepository{

	@Override
	public void save(PassportEntity entity) {
		EntityManager entityManager = SingletonEmf.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			entityManager.persist(entity);
			tx.commit();
		} catch (PersistenceException e) {
				e.printStackTrace();
		}finally{
			if(entityManager!=null) {
				entityManager.close();
			}
			
		}
		
	}

}
