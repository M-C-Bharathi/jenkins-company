package com.example.CompanyController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.CompanyEntity.CompanyEntity;
import com.example.CompanyService.CompanyService;

public class CompanyController {
	@Autowired
	private CompanyService service;
	@PostMapping("/addCompany")
	public CompanyEntity addCompany(@RequestBody CompanyEntity company) {
		return service.saveCompany(company);
	}
	@PostMapping("/add")
	public List<CompanyEntity> addCompanies(@RequestBody List<CompanyEntity> companies) {
		return service.saveCompanies(companies);
	}
}
