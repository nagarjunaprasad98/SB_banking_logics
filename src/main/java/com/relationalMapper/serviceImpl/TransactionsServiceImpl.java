package com.relationalMapper.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relationalMapper.dto.TransactionsDataDTO;
import com.relationalMapper.dtomapper.TransactionsDTOMapper;
import com.relationalMapper.entities.AccountHolder;
import com.relationalMapper.entities.TransactionsData;
import com.relationalMapper.repository.AccountHolderRepo;
import com.relationalMapper.repository.TransactionsDataRepo;
import com.relationalMapper.service.TransactionsService;

@Service
public class TransactionsServiceImpl implements TransactionsService {

	@Autowired
	private TransactionsDataRepo transRepo;

	@Autowired
	private TransactionsDTOMapper dtoMapper;

	@Autowired
	private AccountHolderRepo accHolderRepo;

	@Override
	public TransactionsDataDTO doTransaction(TransactionsDataDTO request) {

		Optional<AccountHolder> accHolderOpt = accHolderRepo.findById(request.getAccHolderId());

		if (accHolderOpt.isPresent()) {
			AccountHolder accHolder = accHolderOpt.get();

			TransactionsData transactionData = dtoMapper.toEntity(request);
			transactionData.setAccountHolder(accHolder);

			TransactionsData saved = transRepo.save(transactionData);

			return dtoMapper.toDTO(saved);
		} else {
			throw new RuntimeException("AccountHolder not found with ID: " + request.getAccHolderId());
		}
	}

}
