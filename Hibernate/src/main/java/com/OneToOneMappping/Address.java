package com.OneToOneMappping;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Address {
	@Id
	private int id;
	private String address;

}
