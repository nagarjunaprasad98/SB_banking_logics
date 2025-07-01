package com.relationalMapper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relationalMapper.entities.PanData;

public interface PanDataRepo extends JpaRepository<PanData, Long> {

}
