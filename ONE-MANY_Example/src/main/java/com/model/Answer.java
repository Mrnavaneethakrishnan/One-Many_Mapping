package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="answer123")

public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	
	private int id;
	private String answername;
	private String postedby;
	
	public Answer() {
		
	}

	public Answer(int id, String answername, String postedby) {
		super();
		this.id = id;
		this.answername = answername;
		this.postedby = postedby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswername() {
		return answername;
	}

	public void setAnswername(String answername) {
		this.answername = answername;
	}

	public String getPostedby() {
		return postedby;
	}

	public void setPostedby(String postedby) {
		this.postedby = postedby;
	}
	
	
	

}
