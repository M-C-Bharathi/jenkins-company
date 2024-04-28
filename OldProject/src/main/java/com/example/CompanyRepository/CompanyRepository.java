package com.example.CompanyRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CompanyEntity.CompanyEntity;
public interface CompanyRepository extends JpaRepository<CompanyEntity,String>{

	CompanyEntity findByName(String name);
}
