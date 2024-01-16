package com.lgy.spring_paging.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Criteria {
	private int pageNum; //페이지 번호
	private int amount; // 페이지당 글 갯수
	
	public Criteria() {
		this(1,10);
	}
	
}
