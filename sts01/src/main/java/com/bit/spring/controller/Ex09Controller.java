package com.bit.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.spring.model.entity.TestBean;

@Controller
public class Ex09Controller {

	@RequestMapping("/ex09")
	public String ex09() {
		System.out.println("arg 없음");
		return "ex09";
	}
	
	@RequestMapping("/ex10")
	public String ex08(HttpServletRequest req) {
		String id = req.getParameter("id");
		System.out.println("id:" + id);
		req.setAttribute("id", id);
		return "ex09";
	}
	
	@RequestMapping("/ex11")
//	public String ex07() {
//		String id = req.getParameter("id");
//		System.out.println("id:" + id);
////		req.setAttribute("id", id);	
		
//	public String ex07(HttpServletRequest req, Model model) {
//		String id = req.getParameter("id");
//		System.out.println("id:" + id);
//		model.addAttribute("id", id);
	
//		model.addAttribute("id", "xyz");
	
	public String ex07(Model model, HttpServletRequest req) {
		model.addAttribute("id", req.getParameter("id"));
		
		return "ex09";
	}
	
	@RequestMapping("/ex12")
//	public String ex06(@RequestParam("id") String id) {
		// 파라미터 이름과 타입 지정.
//		System.out.println(id);
	
//	public String ex06(@RequestParam("su") int su) {
		// int는 int로 받음. 형변환 X.
//		System.out.println(su + 1);
	
	public String ex06(@RequestParam("su") int su, @RequestParam("id") String id) {
		// 파라미터 개수와 타입을 자유롭게 지정 가능.
		System.out.println(id + " : " + (su + 1));
		return "ex09";
	}
	
	@RequestMapping("/ex13")
//	public String ex05(int num) {
	public String ex05(int num) {
		System.out.println(num);
		// RequestParam은 파라미터 이름과 생성자 참조변수명 같은 경우, 
		// 어노테이션, 파라미터명 생략 가능. 
		return "ex09";
	}
	
	// PathVariable 어노테이션. 경로 상에 표시
	@RequestMapping("/ex14/{num}/{msg}")
	public String ex04(@PathVariable("num") int su, @PathVariable String msg) {
		// PathVariable은 파라미터 이름과 생성자 참조변수명이 같더라도, 어노테이션은 생략 불가능.
		// 파라미터명만 생략 가능.
		System.out.println(msg + ", " + su);
		return "ex09";
	}
	
//	@ModelAttribute 어노테이션. // request.setAttibute 변수 지정.
	@RequestMapping("/ex15")
	public String ex03(@ModelAttribute("id") String id) {
		// ModelAttribute는 파라미터와 이름과 생성자 참조변수명이 같더라도, 생략 불가능.
		return "ex09";
	}
	
	@RequestMapping("/ex16")
	public String ex02(@ModelAttribute("bean") TestBean bean) {
//	public String ex02(@ModelAttribute TestBean bean) { // 잘못된 결과
		System.out.println(bean);
		return "ex15";
	}
	
	

}
