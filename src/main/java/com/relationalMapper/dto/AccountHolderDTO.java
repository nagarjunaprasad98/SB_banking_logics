package com.relationalMapper.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(value = Include.NON_NULL)
public class AccountHolderDTO {

	private Long accountId;

	private String fName;

	private String lName;

	private String sName;

	private String emai;

	private String mobile;

	private PanDataDTO panData;

	private AdharDataDTO adharData;

}
