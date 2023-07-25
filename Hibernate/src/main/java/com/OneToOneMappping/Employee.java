package com.OneToOneMappping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	@OneToOne
	private Address address;

}
