package com.relationalMapper.service;

import com.relationalMapper.dto.TransactionsDataDTO;

public interface TransactionsService {

	TransactionsDataDTO doTransaction(TransactionsDataDTO request);

}
