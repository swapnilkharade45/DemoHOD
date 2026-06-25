package com.example.demo.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HODRequestDTO {

	private String name;
	private String email;
	private Float exp;
	private Float salary;
	private String address;
	private String password;
	private String mob;
	private List<String> subjects;
}
