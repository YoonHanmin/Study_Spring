package com.lgy.spring_15.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor //모든 property 가진 생성자
//@NoArgsConstructor //기본 생성자
//@Data
public class SampleVO {
	private int mno;
	private String firstName;
	private String latName;
}

