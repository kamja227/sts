package com.bit.spring.controller;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;

@Controller
public class Ex03Controller {

	@RequestMapping("/ex03") // 확장자를 wild로 지정해놓았기 때문에 따로 지정하지 않아도 된다.
//	public ModelAndView ex03() {
	public View ex03() {
//	public String e03() {
//		
		// Annotation
//		return "home";
//	}
//	
//	@RequestMapping("/ex04")
//	public String ex04() {
//		return "ex01";
//	}
//		return new ModelAndView("home");
		return new View() {


			@Override
			public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
					throws Exception {
				PrintWriter out = response.getWriter();
				out.println("<html><head><meta charset=\"utf-8\"><body>");
				out.println("<h1>한글</h1>");
				out.println("</body></html>");
				
			}
			
			@Override
			public String getContentType() {
					return "text/html; charset=\"utf-8\"";
			}
		
		};
	}
}
