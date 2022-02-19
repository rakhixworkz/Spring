package com.xworkz.coffeeDay.repository;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.coffeeDay.entity.CoffeeDayEntity;
@Component
public class CoffeeDayRepositoryImpl implements CoffeeDayRepository{
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public CoffeeDayRepositoryImpl(EntityManagerFactory entityManagerFactory) {
		
		System.out.println("CoffeeDay Repository  impl class created");
		
		this.entityManagerFactory = entityManagerFactory;
	}

	@Override
	public void save(CoffeeDayEntity entity) {

		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			manager.persist(entity);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			if (manager != null) {
				manager.close();
			}

		}
	}

}
