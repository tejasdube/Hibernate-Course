package com.OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Emp {
	@Id
	private int id;
	private String name;
	@OneToMany
	private List<Address> addresses;

}
