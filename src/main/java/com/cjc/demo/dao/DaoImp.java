package com.cjc.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.demo.model.Student;

@Repository
public class DaoImp implements DaoI {
	@Autowired
	private SessionFactory sf;

	@Override
	public void addStudentdata(Student s) {
		Session session = sf.openSession();
		session.save(s);
		session.beginTransaction().commit();

	}
}
