package com.bit.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * POJO(Plain Old Java Object, 간단히 POJO는 말 그대로 해석을 하면
 *								오래된 방식의 간단한 자바 오브젝트)
 */
@org.springframework.stereotype.Controller
public class Ex01Controller {
	
	// 객체 생성 시점 확인
//	public Ex01Controller() {
//		System.out.println("create Ex01Controller...");
//	}

	// url경로
	@RequestMapping("/ex01.bit")
//	public ModelAndView ex01(HttpServletRequest request, HttpServletResponse response) throws Exception {	
	public ModelAndView ex01() throws Exception {	
			// "/views/e01.jsp" (뷰)파일 리턴
			return new ModelAndView("ex01");
	}

}
