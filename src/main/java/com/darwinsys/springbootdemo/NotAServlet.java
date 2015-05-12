package com.darwinsys.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
public class NotAServlet {

	@RequestMapping("/notaservlet")
	protected String doWork(@RequestParam(value="name") String name, Model model) {
		model.addAttribute("greets", String.format("<html><h1>Hello %s!!</h1>", name));
		return "hello";
	}
}
