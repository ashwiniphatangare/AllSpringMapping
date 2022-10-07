package com.spring.model;
import javax.persistence.*;

@Entity
// Adding the table name
@Table(name = "Address")
public class Address {
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCityname() {
		return cityname;
	}


	public void setCityname(String cityname) {
		this.cityname = cityname;
	}


	public Student getStud() {
		return stud;
	}


	public void setStud(Student stud) {
		this.stud = stud;
	}


	public Address(int id, String cityname, Student stud) {
		super();
		this.id = id;
		this.cityname = cityname;
		this.stud = stud;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cityname;

	
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	
	@JoinColumn(name = "Student_id")
	private Student stud;


	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

}

