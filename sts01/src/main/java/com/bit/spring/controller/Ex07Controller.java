package com.bit.spring.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class Ex07Controller {

	// view가 없는 경우, 무엇이든 return을 해줘야만 한다.
	@RequestMapping("/ex08")
//	public void ex01() {} // error.
	
	// ModelAndView
	public ModelAndView ex01() {
		// null을 리턴.
		return null; 
	}
	
	// View
//	public View ex02() { 
//			return new View() {
//	
//			@Override
//			public String getContentType() {
//				
//				return null;
//			}
//	
//			@Override
//			public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
//					throws Exception {
//	
//			}
//		
//		};
//	}
}
