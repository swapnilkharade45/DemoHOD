package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.HOD;

@Repository
public interface HODRepository extends JpaRepository<HOD, Integer> {
	
	List<HOD> findByName(String name);
	
    HOD findByEmail(String email);
    
    List<HOD> findByExp(Float exp);
    
    List<HOD> findByAddress(String address);
    
    HOD findByMob(String mob);	
}
