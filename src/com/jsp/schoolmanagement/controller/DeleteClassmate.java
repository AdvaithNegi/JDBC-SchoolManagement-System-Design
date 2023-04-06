package com.jsp.schoolmanagement.controller;

import com.jsp.schoolmanagement.dao.ClassmateDao;

public class DeleteClassmate {

	public static void main(String[] args) {

		ClassmateDao classmateDao = new ClassmateDao();
		boolean flag = classmateDao.deleteClassmate(6);
		if (flag == true)
			System.out.println("Record Deleted");
	}
}
