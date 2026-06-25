package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.HODRequestDTO;
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

}
