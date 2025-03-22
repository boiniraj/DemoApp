package com.dc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Emp")
public class EmployeeEntity {
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int eid;
	@Column(length=15)
	private String ename;
	private Long phno;
	@Column(length=20)
	private String eaddr;
	

}
