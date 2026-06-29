package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.HODRequestDTO;
import com.example.demo.dto.HODResponseDTO;

public interface HODService {

	public void add(HODRequestDTO dto);
	
	public List<HODResponseDTO> display();
	
	List<HODResponseDTO> searchByName(String name);
	
	HODResponseDTO searchByEmail(String email);
	
	List<HODResponseDTO> searchByExp(Float exp);
	
	List<HODResponseDTO> searchByAddress(String address);
	
	HODResponseDTO searchByMob(String mob);
	
	List<HODResponseDTO> searchBySalary(Float salary);
}
