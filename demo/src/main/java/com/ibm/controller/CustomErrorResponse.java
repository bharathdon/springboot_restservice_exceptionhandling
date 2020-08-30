package com.ibm.controller;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomErrorResponse {

	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private LocalDateTime localDateTime;
	private int status;
	private String error;
}
