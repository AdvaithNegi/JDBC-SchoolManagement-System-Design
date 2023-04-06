package com.jsp.schoolmanagement.controller;

import com.jsp.schoolmanagement.dao.ClassmateDao;
import com.jsp.schoolmanagement.dto.Classmate;

public class UpdateClassmate {

	public static void main(String[] args) {

		Classmate c1 = new Classmate();
		c1.setId(5);
		c1.setName("abc");
		c1.setEmail("abc@mail.com");
		c1.setLoc("ABC");

		ClassmateDao classmateDao = new ClassmateDao();
		Classmate classmate = classmateDao.updateClassmate(c1);
		if (classmate != null)
			System.out.println("Record Updated");
	}
}
