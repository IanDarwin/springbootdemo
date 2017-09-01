package com.darwinsys.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * It's not a Servlet, it's a Controller
 */
@Controller()
public class NotAServlet {

	@RequestMapping(value="/notaservlet", method=RequestMethod.POST)
	public String doHardWork(@RequestParam("name") String name, ModelMap model) {
		System.out.println("NotAServlet.doHardWork()");
		final String greeting = String.format("<b>Hello %s!!</b>", name);
		model.addAttribute("greetings", greeting);
		return "hello";
	}
}
