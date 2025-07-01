package com.relationalMapper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relationalMapper.entities.TransactionsData;

public interface TransactionsDataRepo extends JpaRepository<TransactionsData, Long> {

}
