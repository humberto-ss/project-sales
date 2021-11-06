package com.dev.springreact.sales.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dev.springreact.sales.dto.SaleSuccessDTO;
import com.dev.springreact.sales.dto.SaleSumDTO;
import com.dev.springreact.sales.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.dev.springreact.sales.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
			+ "from Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupBySeller(); 
	
	@Query("SELECT new com.dev.springreact.sales.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "from Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupBySeller(); 
}
