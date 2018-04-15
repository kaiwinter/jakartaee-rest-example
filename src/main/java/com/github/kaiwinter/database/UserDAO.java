package com.github.kaiwinter.database;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserDAO {

	@PersistenceContext(unitName = "AppPU")
	private EntityManager entityManager;

	public UserEntity loadEntity(Long userId) {
		UserEntity userEntity = entityManager.find(UserEntity.class, userId);
		return userEntity;
	}

}
