package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.HODRequestDTO;
import com.example.demo.dto.HODResponseDTO;
import com.example.demo.model.HOD;
import com.example.demo.repository.HODRepository;

@Service
public class HODServiceImpl implements HODService {

	@Autowired
	private HODRepository hr;

	@Override
	public void add(HODRequestDTO dto) {
		// TODO Auto-generated method
		HOD hod = new HOD(dto);
		hr.save(hod);

	}

	@Override
	public List<HODResponseDTO> display() {
		List<HODResponseDTO> dto = new ArrayList<>();
		for (HOD x : hr.findAll()) {
			dto.add(HODResponseDTO.toResponse(x));
		}
		return dto;
	}

	@Override
	public List<HODResponseDTO> searchByName(String name) {
		List<HODResponseDTO> dto = new ArrayList<>();
		for (HOD x : hr.findByName(name)) {
			dto.add(HODResponseDTO.toResponse(x));
		}
		return dto;
	}

	@Override
	public HODResponseDTO searchByEmail(String email) {
		HOD hod = hr.findByEmail(email);
		return HODResponseDTO.toResponse(hod);
	}

	@Override
	public List<HODResponseDTO> searchByExp(Float exp) {
		List<HODResponseDTO> dto = new ArrayList<>();
		for (HOD x : hr.findByExp(exp)) {
			dto.add(HODResponseDTO.toResponse(x));
		}
		return dto;
	}

	@Override
	public List<HODResponseDTO> searchByAddress(String address) {
		List<HODResponseDTO> dto = new ArrayList<>();
		for (HOD x : hr.findByAddress(address)) {
			dto.add(HODResponseDTO.toResponse(x));
		}
		return dto;
	}

	@Override
	public HODResponseDTO searchByMob(String mob) {
		HOD hod = hr.findByMob(mob);
		return HODResponseDTO.toResponse(hod);
	}

	@Override
	public List<HODResponseDTO> searchBySalary(Float salary) {
		List<HODResponseDTO> dto = new ArrayList<>();
		for (HOD x : hr.findBySalary(salary)) {
			dto.add(HODResponseDTO.toResponse(x));
		}
		return dto;
	}
}
