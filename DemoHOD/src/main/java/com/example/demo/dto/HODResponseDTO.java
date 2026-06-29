package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.HOD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HODResponseDTO {

	private Integer id;
	private String name;
	private String email;
	private Float exp;
	private String address;
	private String mob;
	private List<String> subjects;
	
	public static HODResponseDTO toResponse(HOD hod) {
		HODResponseDTO dto = new HODResponseDTO();
		dto.address = hod.getAddress();
		dto.email = hod.getEmail();
		dto.exp = hod.getExp();
		dto.id = hod.getId();
		dto.name = hod.getName();
		dto.mob = hod.getMob();
		dto.subjects = hod.getSubjects();
		return dto;
	}
}
