package com.zhidi.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhidi.entity.User;



@Controller
public class IndexController {
	@RequestMapping(value= "/iii",params = {"username","password"})
	public String index(String username,HttpServletRequest req){
		
		req.setAttribute("user", username);
		System.out.println(username);
		return "index";
	}
	
	@RequestMapping("/index")
	public String index1(){
		return "redirect:/index.jsp";
	}
	
	@RequestMapping(value="/byResponse",method=RequestMethod.POST)
	public void byResponse(HttpServletResponse resp) throws IOException{
		resp.setContentType("application/json");
		
		JSONObject json = new JSONObject();
		json.put("enty", "{\"name\":\"呵呵\"}");
		PrintWriter writer = resp.getWriter();
		writer.write(json.toString());
		writer.flush();
		writer.close();
	}
	@RequestMapping("/byReq")
	public String byRequest(HttpServletRequest req,User user){
		System.out.println("-----"+user);
		req.setAttribute("user", user);
		return "index";
	}
	
	@RequestMapping("/toRegister")
	public String register(){
		return "register";
	}
	@RequestMapping("/doRegister")
	public String doRegister(User user){
		System.out.println("----"+user);
		return "index";
	}
	
	
	
}
