package net.ak.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.akshoppingbacken.dao.CategoryDAO;

@Controller
public class PageController 
{
	@Autowired
	private CategoryDAO CategoryDAO;
	@RequestMapping(value = { "/" , "/home", "/index"})
	public ModelAndView index() 
	{
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("title","Home");
		// passing the list of category
		mv.addObject("categories",CategoryDAO.list());
		mv.addObject("userClickHome",true);			
		return mv;
	}
	@RequestMapping(value="/about")
	public ModelAndView about() 
	{
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("title","About");
		mv.addObject("userClickabout",true);			
		return mv;
	}
	@RequestMapping(value="/contact")
	public ModelAndView contact() 
	{
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);			
		return mv;
	}
	@RequestMapping(value="/services")
	public ModelAndView services() 
	{
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("title","Services");
		mv.addObject("userClickContact",true);			
		return mv;
	}
	
	
}
