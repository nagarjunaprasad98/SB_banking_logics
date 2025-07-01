package com.relationalMapper.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.relationalMapper.dto.TransactionsDataDTO;
import com.relationalMapper.service.TransactionsService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionsService transService;

	@PostMapping("/doTransaction")
	public ResponseEntity<TransactionsDataDTO> doTransaction(@RequestBody TransactionsDataDTO request) {
		return ResponseEntity.ok(transService.doTransaction(request));
	}

}
