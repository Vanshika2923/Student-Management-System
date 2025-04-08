package com.vanshika.StudentManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Exam {

	@Id
	private Long id;
	private String Engg_Maths;
	private String BEE;
	private String Physics;
	private String CFP;
	private String Chemistry;
	@ManyToOne
    @JoinColumn(name = "student", referencedColumnName = "id")
	private Student student;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEngg_Maths() {
		return Engg_Maths;
	}
	public void setEngg_Maths(String engg_Maths) {
		Engg_Maths = engg_Maths;
	}
	public String getBEE() {
		return BEE;
	}
	public void setBEE(String bEE) {
		BEE = bEE;
	}
	public String getPhysics() {
		return Physics;
	}
	public void setPhysics(String physics) {
		Physics = physics;
	}
	public String getCFP() {
		return CFP;
	}
	public void setCFP(String cFP) {
		CFP = cFP;
	}
	public String getChemistry() {
		return Chemistry;
	}
	public void setChemistry(String chemistry) {
		Chemistry = chemistry;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Exam [Engg_Maths=" + Engg_Maths + ", BEE=" + BEE + ", Physics=" + Physics + ", CFP=" + CFP
				+ ", Chemistry=" + Chemistry + ", student=" + student + "]";
	}
	
}
	
