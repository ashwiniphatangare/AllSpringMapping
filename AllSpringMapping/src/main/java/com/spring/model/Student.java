package com.spring.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
// Adding the table name
@Table(name = "Student")
public class Student {
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, int rollno, String name, List<Address> addr) {
		super();
		this.id = id;
		this.rollno = rollno;
		this.name = name;
		this.addr = addr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddr() {
		return addr;
	}

	public void setAddr(List<Address> addr) {
		this.addr = addr;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int rollno;
	private String name;

	// Mapping to the other table
	@OneToMany(fetch=FetchType.EAGER,mappedBy="stud",cascade=CascadeType.ALL)

	private List<Address> addr=new ArrayList<>();

	
		


	
}
