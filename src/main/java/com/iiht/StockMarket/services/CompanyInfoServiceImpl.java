package com.iiht.StockMarket.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.StockMarket.dto.CompanyDetailsDTO;
import com.iiht.StockMarket.repository.CompanyInfoRepository;

@Service
@Transactional
public class CompanyInfoServiceImpl implements CompanyInfoService {
	
	@Autowired
	private CompanyInfoRepository repository; 
	
	public CompanyDetailsDTO saveCompanyDetails(CompanyDetailsDTO companyDetailsDTO) {

		return null;
	};
	//----------------------------------------------------------------------------
	public CompanyDetailsDTO deleteCompany(Long companyCode) {
		
		return null;
	};
	//----------------------------------------------------------------------------
	public CompanyDetailsDTO getCompanyInfoById(Long companyCode) {
		
		return null;
	};
	
	//----------------------------------------------------------------------------
	public List<CompanyDetailsDTO> getAllCompanies() {

		return null;
	};
}