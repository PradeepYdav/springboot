package com.pradeep.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pradeep.demo.dao.AlienRepo;
import com.pradeep.demo.model.Alien;

@Controller
public class HomeController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	
	@RequestMapping("/addAlien")
	public String addAline(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	
	@RequestMapping("getAlienById")
	public ModelAndView getAlinById(@RequestParam("aid") int aid) {
		
		Alien data=repo.findById(aid).orElse(new Alien());
		System.out.println(data);
		ModelAndView mv= new ModelAndView("showAlien.jsp");
		mv.addObject("data",data);
		
		System.out.println(repo.findByAlang("python"));
		
		System.out.println(repo.findByAidGreaterThan(101));
		
		System.out.println(repo.findByAlangSorted("java"));
		
		return mv;
	}
	
	
	@RequestMapping(path="aliens",produces= {"application/xml"})
	@ResponseBody
	public List<Alien> Aliens() {
		return repo.findAll();
	}
	
	
	@RequestMapping("alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid") int aid ) {
		
		
		return repo.findById(aid);
	}
	
	
	@RequestMapping(path="alien",consumes= {"application/json"})
	@ResponseBody
	public Alien addAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}

}
