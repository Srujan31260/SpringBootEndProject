package com.klef.springboot.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.klef.springboot.model.Customer;
import com.klef.springboot.service.CustomerService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ClientController 
{
	@Autowired
	private CustomerService customerService;
	@GetMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	@GetMapping("cureg")
	public ModelAndView cureg()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("cureg");
		return mv;
	}
	
	@PostMapping("insertcu")
	public ModelAndView insertcu(HttpServletRequest request)
	{
		String name = request.getParameter("cname");
		String address = request.getParameter("caddress");
		String phno = request.getParameter("cphno");
		String dob = request.getParameter("cdob");
		
		Customer cu = new Customer();
		cu.setName(name);
		cu.setAddress(address);
		cu.setPhno(phno);
		cu.setDob(dob);
		
		String msg = customerService.customerRegistration(cu);
		ModelAndView mv = new ModelAndView("success");
		mv.addObject("message", msg);
		return mv;
	}
	
	@GetMapping("viewallcu")
    public ModelAndView viewallcu()
    {
      ModelAndView mv = new ModelAndView();
      List<Customer> culist = customerService.viewall();
      mv.setViewName("viewallcu");
      mv.addObject("culist",culist);
      
      return mv;
    }
}
