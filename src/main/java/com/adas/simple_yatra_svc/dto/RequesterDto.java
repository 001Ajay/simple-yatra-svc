package com.adas.simple_yatra_svc.dto;

import lombok.Data;

@Data
public class RequesterDto {
	private Long requesterId;
	private String password;
	private String phone;
	private String name;
	private String employeeId;
	private String office;
	private String email;
}