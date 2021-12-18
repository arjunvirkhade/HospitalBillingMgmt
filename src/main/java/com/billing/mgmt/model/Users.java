package com.billing.mgmt.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class Users {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstName;
	private String lastName;
	@Column(unique=true)
	private String userid;
	private String password;
	private String gender;
	private String address;
	private String idproof;
	private String contactNo;
	
	private String role;
	private String status;
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updatedOn;
}
