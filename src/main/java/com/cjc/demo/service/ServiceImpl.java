package com.cjc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.demo.dao.DaoI;
import com.cjc.demo.model.Student;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired(required = true)
	DaoI d;

	@Override
	public void addStudentdata(Student s) {

		d.addStudentdata(s);
	}

}
