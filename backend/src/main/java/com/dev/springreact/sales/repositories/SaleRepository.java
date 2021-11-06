package com.dev.springreact.sales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.springreact.sales.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
