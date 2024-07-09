package com.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class TestRetrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tr = null;
		try(Session ses=HBUtil.getSf().openSession()){
			tr=ses.beginTransaction();
			Query<Question> qry= ses.createQuery("from Question",Question.class);
			List<Question> li = qry.list();
			for(Question a:li) {
				System.out.println(a.getId()+"\t"+a.getQuestion());
				List<Answer> ans = a.getAnswers();
				for(Answer b:ans) {
					System.out.println(b.getAnswername()+"\t"+b.getPostedby());
				}
			}
			tr.commit();
			ses.close();
		}
		catch(Exception e) {e.printStackTrace();}
	}

}
