package com.iiht.StockMarket.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;


public class StockPriceDetails implements Serializable {

	private static final long serialVersionUID = 3721936374836041464L;

	
	private Long Id;
	
	
	private Long companyCode;

	
	private Double currentStockPrice;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate stockPriceDate;
	
	@Column(columnDefinition = "TIME")
	private LocalTime stockPriceTime;

	//---------------------------------------------------------------------------------------------------------------------------------
	public StockPriceDetails() {
		super();
	}	
	public StockPriceDetails(Long id, Long companyCode, Double currentStockPrice, LocalDate stockPriceDate,	LocalTime stockPriceTime) {
		super();
		this.Id = id;
		this.companyCode = companyCode;
		this.currentStockPrice = currentStockPrice;
		this.stockPriceDate = stockPriceDate;
		this.stockPriceTime = stockPriceTime;
	}

	//---------------------------------------------------------------------------------------------------------------------------------
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	//---------------------------------------------------------------------------------------------------------------------------------
	public Long getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(Long companyCode) {
		this.companyCode = companyCode;
	}
	//---------------------------------------------------------------------------------------------------------------------------------
	public Double getCurrentStockPrice() {
		return currentStockPrice;
	}
	public void setCurrentStockPrice(Double currentStockPrice) {
		this.currentStockPrice = currentStockPrice;
	}
	//---------------------------------------------------------------------------------------------------------------------------------
	public LocalDate getStockPriceDate() {
		return stockPriceDate;
	}
	public void setStockPriceDate(LocalDate stockPriceDate) {
		this.stockPriceDate = stockPriceDate;
	}
	//---------------------------------------------------------------------------------------------------------------------------------
	public LocalTime getStockPriceTime() {
		return stockPriceTime;
	}
	public void setStockPriceTime(LocalTime stockPriceTime) {
		this.stockPriceTime = stockPriceTime;
	}
}