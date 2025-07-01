package com.relationalMapper.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relationalMapper.dto.AccountHolderDTO;
import com.relationalMapper.dtomapper.AccountHolderDTOMapper;
import com.relationalMapper.entities.AccountHolder;
import com.relationalMapper.repository.AccountHolderRepo;
import com.relationalMapper.service.AccountHolderService;

@Service
public class AccountHolderServiceImpl implements AccountHolderService {

	@Autowired
	private AccountHolderRepo accHoldRepo;

	@Autowired
	private AccountHolderDTOMapper dtoMapper;

	@Override
	public AccountHolderDTO save(AccountHolderDTO request) {
		AccountHolder accountHolder = dtoMapper.toEntity(request);

		if (accountHolder.getPanData() != null) {
			accountHolder.getPanData().setAccountHolder(accountHolder);
		}

		if (accountHolder.getAdharData() != null) {
			accountHolder.getAdharData().setAccountHolder(accountHolder);
		}

		AccountHolder saved = accHoldRepo.save(accountHolder);
		return dtoMapper.toDTO(saved);
	}

}
