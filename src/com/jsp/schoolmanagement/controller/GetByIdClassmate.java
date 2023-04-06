package com.jsp.schoolmanagement.controller;

import com.jsp.schoolmanagement.dao.ClassmateDao;

public class GetByIdClassmate {

	public static void main(String[] args) {

		ClassmateDao classmateDao = new ClassmateDao();
		classmateDao.getByIdClassmate(5);

	}
}
