package com.darwinsys.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
public class NotAServlet {

	@RequestMapping(value="/notaservlet", method=RequestMethod.GET)
	public String doWork(@RequestParam("name") String name, ModelMap model) {
		System.out.println("NotAServlet.doWork()");
		model.addAttribute("greetings", String.format("<b>Hello %s!!</b>", name));
		return "hello";
	}
}
