package com.relationalMapper.dtomapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.relationalMapper.dto.AccountHolderDTO;
import com.relationalMapper.entities.AccountHolder;

@Component
public class AccountHolderDTOMapper {

	@Autowired
	private ModelMapper modelMapper;

	public AccountHolderDTO toDTO(AccountHolder entity) {
		return modelMapper.map(entity, AccountHolderDTO.class);
	}

	public AccountHolder toEntity(AccountHolderDTO dto) {
		return modelMapper.map(dto, AccountHolder.class);
	}

}
