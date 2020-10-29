package com.bit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
// 클래스에 붙은 RequestMapping은, 해당 매핑값의 폴더 아래의 view 파일을 호출
public class Ex05Controller {

	@RequestMapping("/ex05") 
	public void ex01() {}
	// void 타입인 경우, RequestMapping url명(클래스X)과 동일한 jsp (뷰)파일 return
	// "/views/ex05.jsp" 파일 return
	
	// 클래스에 RequestMapping 붙는 경우,
	// "/view/test/ex05.jsp" 파일 return
	
	@RequestMapping("/ex/ex05")
	public void ex02() {}
	// "/views//ex/ex05.jsp" 파일 return
	// 클래스에 RequestMapping 붙는 경우,
	// "/view/test/ex/ex05.jsp" 파일 return
	
}
