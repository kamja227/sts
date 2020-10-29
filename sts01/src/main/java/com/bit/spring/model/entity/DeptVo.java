package com.bit.spring.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class DeptVo {
	private int deptno;
	private String dname, loc;

	
}
