package com.jsp.schoolmanagement.controller;

import com.jsp.schoolmanagement.dao.ClassmateDao;

public class GetAllClassmate {

	public static void main(String[] args) {

		ClassmateDao classmateDao = new ClassmateDao();
		classmateDao.getAllClassmate();

	}
}
