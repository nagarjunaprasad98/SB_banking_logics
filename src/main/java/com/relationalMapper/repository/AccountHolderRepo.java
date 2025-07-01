package com.relationalMapper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relationalMapper.entities.AccountHolder;

public interface AccountHolderRepo extends JpaRepository<AccountHolder, Long> {

}
