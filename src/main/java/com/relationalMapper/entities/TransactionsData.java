package com.relationalMapper.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionsData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transId;

	private String type;

	private String amount;

	private String fromAccount;

	private String toAccount;

	@ManyToOne
	@JoinColumn(name = "account_id")
	private AccountHolder accountHolder;

}
