package com.example.domain;

import javax.validation.constraints.NotBlank;

import lombok.Data;
@Data
public class Member {

	private Integer id;

	@NotBlank
	private String loginId;

	@NotBlank
	private String loginPass;


}
