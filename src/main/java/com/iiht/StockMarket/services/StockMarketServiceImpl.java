package com.iiht.StockMarket.services;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.StockMarket.dto.StockPriceDetailsDTO;
import com.iiht.StockMarket.dto.StockPriceIndexDTO;
import com.iiht.StockMarket.model.StockPriceDetails;
import com.iiht.StockMarket.repository.CompanyInfoRepository;
import com.iiht.StockMarket.repository.StockPriceRepository;

@Service
@Transactional
public class StockMarketServiceImpl implements StockMarketService {

	@Autowired
    private StockPriceRepository stockRepository;

	@Autowired
    private CompanyInfoRepository companyRepository;
	
	//----------------------------------------------------------------------------
	public StockPriceDetailsDTO saveStockPriceDetails(StockPriceDetailsDTO stockPriceDetailsDTO) {
		
		return null;
	};
	//----------------------------------------------------------------------------
	public List<StockPriceDetailsDTO> deleteStock(Long companyCode) {
		
		return null;
	};
	//----------------------------------------------------------------------------
	public List<StockPriceDetailsDTO> getStockByCode(Long companyCode){

		return null;
	};
	//----------------------------------------------------------------------------
	public StockPriceDetailsDTO getStockPriceDetailsDTO(StockPriceDetails stockDetails)	{
		return new StockPriceDetailsDTO(stockDetails.getId(), stockDetails.getCompanyCode(), stockDetails.getCurrentStockPrice(), stockDetails.getStockPriceDate(), stockDetails.getStockPriceTime());
	};	
	//----------------------------------------------------------------------------
	public Double getMaxStockPrice(Long companyCode, LocalDate startDate, LocalDate endDate) {
		return null;
	};
	public Double getAvgStockPrice(Long companyCode, LocalDate startDate, LocalDate endDate) {
		return null;
	};
	public Double getMinStockPrice(Long companyCode, LocalDate startDate, LocalDate endDate) {
		return null;
	};
	
	public StockPriceIndexDTO getStockPriceIndex(Long companyCode, LocalDate startDate, LocalDate endDate) {
		
		return null;
	};
}