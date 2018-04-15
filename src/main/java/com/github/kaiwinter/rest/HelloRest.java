package com.github.kaiwinter.rest;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.github.kaiwinter.database.UserDAO;
import com.github.kaiwinter.database.UserEntity;

@Path("hello")
public class HelloRest {

	@EJB
	private UserDAO userDAO;

	@GET
	@Path("{userId}")
	public String hello(@PathParam(value = "userId") Long userId) {
		UserEntity user = userDAO.loadEntity(userId);
		return "Hello " + user.getUsername();
	}
}
