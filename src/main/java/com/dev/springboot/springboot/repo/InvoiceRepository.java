package com.dev.springboot.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.springboot.springboot.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}