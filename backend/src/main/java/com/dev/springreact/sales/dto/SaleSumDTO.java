package com.dev.springreact.sales.dto;

import com.dev.springreact.sales.entities.Seller;

public class SaleSumDTO {
	
	private String sellerName;
	
	private Double sum;

	public SaleSumDTO() {}
	
	public SaleSumDTO(Seller seller, Double sum) {
		super();
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
	
}
