package com.example.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Diary {

	private Integer id;
	private String contents;
	private Date created;
	private String posted;
	private String feeling;
	private String title;

}