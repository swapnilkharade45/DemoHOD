package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.HODRequestDTO;
import com.example.demo.service.HODService;

@RestController
public class HODController {

	@Autowired
	private HODService hs;
	
	@PostMapping("add")
	public void addHODs(HODRequestDTO dto) {
		hs.add(dto);
	}
}
