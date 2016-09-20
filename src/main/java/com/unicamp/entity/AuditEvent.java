package com.unicamp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name="audit_event") 
public class AuditEvent {

	@Id
	@GeneratedValue
	private int id;
		
	@Column(name="name")
	private String name;
	
	@Column(name="event_type")
	private String type;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="event")
	private String event;

	@PrePersist
	protected void onCreate() {
	  date = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}
	
}
