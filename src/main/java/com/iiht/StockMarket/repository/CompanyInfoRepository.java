package com.iiht.StockMarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.StockMarket.model.CompanyDetails;

@Repository
public interface CompanyInfoRepository extends JpaRepository<CompanyDetails, Long>
{
	
}