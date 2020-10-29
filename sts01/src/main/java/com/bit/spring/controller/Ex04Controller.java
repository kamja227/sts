package com.bit.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class Ex04Controller {
	
//	@RequestMapping("/ex04")
//	@RequestMapping(value = "/ex04", params = {"id=abcd"}, method = RequestMethod.GET)
	@RequestMapping(value = "ex04", params = {"id=abcd"}, method = RequestMethod.GET)
	// 클래스에 RequestMapping("/") 붙는 경우,
	// 메서드에 RequestMapping("/ex04") 붙이는 것과 동일한 경로.
	
	// RequestMethod.GET, RequestMethod.POST 메소드 값 지정하는 경우, 지정 메소드 방식으로만 접근 가능.
	// 파라미터 존재하는 경우, 입력하지 않으면 404 에러.
	// 파라미터의 값까지 부여하는 경우, 암호처럼 그 값일 때 해당 url 접근 가능
	public String ex04(HttpServletRequest req) {
		System.out.println(req.getParameter("id"));
		return "ex04";
	}
	
//	@RequestMapping(value = "/ex04", method = RequestMethod.GET)
	@RequestMapping(value = "ex04", method = RequestMethod.GET)
	public String ex03() {
		System.out.println("page 요청 없음");
		return "ex04";
	}
	
//	@RequestMapping("/ex/ex04")
	@RequestMapping("ex/ex04")
	public String ex02() {
		System.out.println("Depth 변경");
		return "ex04";
	}
}
