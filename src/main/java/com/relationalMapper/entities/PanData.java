package com.relationalMapper.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PanData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long panId;

	private String panNumber;

	@OneToOne(mappedBy = "panData")
	private AccountHolder accountHolder;
}
