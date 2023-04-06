package com.jsp.schoolmanagement.controller;

import com.jsp.schoolmanagement.dao.ClassmateDao;
import com.jsp.schoolmanagement.dto.Classmate;

public class SaveClassmate {

	public static void main(String[] args) {

		Classmate c1 = new Classmate();
		c1.setId(6);
		c1.setName("xyz");
		c1.setEmail("xyz@mail.com");
		c1.setLoc("XYZ");

		ClassmateDao classmateDao = new ClassmateDao();
		Classmate classmate = classmateDao.saveClassmate(c1);
		System.out.println("Classmate " + classmate.getName() + " Added");
	}
}
