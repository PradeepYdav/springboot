package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String  home(HttpServletRequest request) {
		
		String name=request.getParameter("name");
		
		System.out.println(name);
		HttpSession session =request.getSession();
		session.setAttribute("name", name);
		System.out.println("hi from home  page ");
		return "home";
	}
	
	
	@RequestMapping("office")
	public ModelAndView office(@RequestParam("name")String myname) {
		System.out.println(myname );
		ModelAndView mv= new ModelAndView();
		mv.addObject("name",myname);
		mv.setViewName("home");
		
		return mv;
	}
	
	//url  http://localhost:8080/users?aid=10&aname=pradeep&lang=jaav
	
	@RequestMapping("users")
	public ModelAndView usermodel(Alien alien) {
		//System.out.println(myname );
		
	
		ModelAndView mv= new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home");
		
		return mv;
	}

}
