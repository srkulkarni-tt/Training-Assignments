package com.thinkitive;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibDbOps {
	Configuration cfg;
	SessionFactory factory;

	public HibDbOps() {
		cfg = new Configuration();
		factory = cfg.configure().buildSessionFactory();
	}

	public void insertWord(String addedWord, String addedMeaning) {
		Dictionary d = new Dictionary(addedWord, addedMeaning);
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		session.save(d);
		t.commit();

		session.close();
	}

	public List findWordMeaning(String word) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Query q = session.createQuery("from Dictionary where word in (:word)");
		q.setString("word", word);
		List result = q.list();

		return result;
	}
}
