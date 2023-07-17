package com.javalab.board.vo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private Integer id;
	private String name;
	private String password;
	private Integer age;
	private String phone;
	private String address;
	private LocalDateTime regDate;
	
}
