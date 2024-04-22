package com.example.CompanyService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CompanyEntity.CompanyEntity;
import com.example.CompanyRepository.CompanyRepository;

@Service
public class CompanyService {
	@Autowired
	private CompanyRepository repository;
	public CompanyEntity saveCompany(CompanyEntity company) {
		return repository.save(company);
	}
	public List<CompanyEntity> saveCompanies(List<CompanyEntity> companies) {
		return repository.saveAll(companies);
	}
}
	
	