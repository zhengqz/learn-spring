package com.hz.ssm.controller;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.hz.ssm.pojo.Items;

public class ItemsController1 implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		List<Items> items = new ArrayList<Items>();
		
		Items items_1 = new Items();
		items_1.setName("联想笔记本");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430联想笔记本电脑！");
		
		Items items_2 = new Items();
		items_2.setName("苹果手机");
		items_2.setPrice(5000f);
		items_2.setDetail("IPhone SE");
		
		items.add(items_1);
		items.add(items_2);
		
		ModelAndView modelAndView = new ModelAndView();
		//request setAttribute
		modelAndView.addObject("itemsList", items);
		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		ClassLoader sysClassLoader = ClassLoader.getSystemClassLoader();
		 
        //Get the URLs
        URL[] urls = ((URLClassLoader)sysClassLoader).getURLs();
 
        for(int i=0; i< urls.length; i++)
        {
            System.out.println(urls[i].getFile());
        }     
		
		return modelAndView;
	}

}
