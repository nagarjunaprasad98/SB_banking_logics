package com.relationalMapper.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AdharData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long adharId;
	private String adharNumber;
	private String adharMobile;
	private String adharDOB;
	private String address;

	@OneToOne(mappedBy = "adharData")
	private AccountHolder accountHolder;

}
