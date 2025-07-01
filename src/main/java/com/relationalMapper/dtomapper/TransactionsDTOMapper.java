package com.relationalMapper.dtomapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.relationalMapper.dto.TransactionsDataDTO;
import com.relationalMapper.entities.TransactionsData;

@Component
public class TransactionsDTOMapper {

	@Autowired
	private ModelMapper modelMapper;

	public TransactionsDataDTO toDTO(TransactionsData entity) {
		return modelMapper.map(entity, TransactionsDataDTO.class);
	}

	public TransactionsData toEntity(TransactionsDataDTO dto) {
		return modelMapper.map(dto, TransactionsData.class);
	}

}
