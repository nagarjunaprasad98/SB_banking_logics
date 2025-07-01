package com.relationalMapper.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.relationalMapper.dto.AccountHolderDTO;
import com.relationalMapper.service.AccountHolderService;

@RestController
public class AccountController {

	@Autowired
	private AccountHolderService accountHolderService;

	@PostMapping("/save")
	public ResponseEntity<AccountHolderDTO> saveAccountHolder(@RequestBody AccountHolderDTO request) {
		AccountHolderDTO savedDto = accountHolderService.save(request);
		return new ResponseEntity<>(savedDto, HttpStatus.CREATED);
	}

}
