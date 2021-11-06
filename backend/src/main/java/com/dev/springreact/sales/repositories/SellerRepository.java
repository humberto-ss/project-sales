package com.dev.springreact.sales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.springreact.sales.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
