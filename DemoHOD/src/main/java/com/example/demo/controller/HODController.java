package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.HODRequestDTO;
import com.example.demo.dto.HODResponseDTO;
import com.example.demo.service.HODService;

@RestController
public class HODController {

	@Autowired
	private HODService hs;
	
	@PostMapping("add")
	public void addHODs(HODRequestDTO dto) {
		hs.add(dto);
	}
	
	@GetMapping("display")
	public List<HODResponseDTO> displayHOD() {
		return hs.display();
	}
	
	@GetMapping("searchByName")
	public List<HODResponseDTO> searchByName(@RequestParam String name) {
		return hs.searchByName(name);
	}
	
	@GetMapping("searchByEmail")
	public HODResponseDTO searchByEmail(@RequestParam String email) {
		return hs.searchByEmail(email);
	}
	
	@GetMapping("searchByExp")
	public List<HODResponseDTO> searchByExp(@RequestParam Float exp) {
		return hs.searchByExp(exp);
	}
	
	@GetMapping("searchByAddress")
	public List<HODResponseDTO> searchByAddress(@RequestParam String address) {
		return hs.searchByAddress(address);
	}
	
	@GetMapping("searchByMob")
	public HODResponseDTO searchByMob(@RequestParam String mob) {
		return hs.searchByMob(mob);
	}
	
	@GetMapping("searchBySalary")
	public List<HODResponseDTO> searchBySalary(@RequestParam Float salary){
		return hs.searchBySalary(salary);
	}
}
