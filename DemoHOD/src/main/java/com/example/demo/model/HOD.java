package com.example.demo.model;

import java.util.List;

import com.example.demo.dto.HODRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CollegeHOD")
public class HOD {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private Float exp;
	private Float salary;
	private String address;
	private String username;
	private String password;
	private String mob;
	private List<String> subjects;

	public HOD(HODRequestDTO dto) {
		this.address = dto.getAddress();
		this.email = dto.getEmail();
		this.exp = dto.getExp();
		this.mob = dto.getMob();
		this.name = dto.getName();
		this.salary = dto.getSalary();
		this.password = dto.getPassword();
		this.subjects = dto.getSubjects();
		this.username = dto.getName()+dto.getMob().subSequence(0, 4);
	}
}
