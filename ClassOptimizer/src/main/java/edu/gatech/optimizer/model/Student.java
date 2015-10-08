package edu.gatech.optimizer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 
	
    @Column(name = "student_id")
	private String studentID;
    
    @Column(name = "first_name")
	private String firstName;
    
    @Column(name = "last_name")
	private String lastName;
    
    @Column(name = "desired_courses")
  	private int desiredCourses;

	public Long getId() {
		return id;
	}

	public String getStudentID() {
		return studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getDesiredCourses() {
		return desiredCourses;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDesiredCourses(int desiredCourses) {
		this.desiredCourses = desiredCourses;
	}
	
	public String toString(){
		return firstName;
    	
    }
}
