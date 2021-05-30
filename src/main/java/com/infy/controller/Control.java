package com.infy.controller;

import com.infy.services.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Control {
    @Autowired
    private SomeService service;
    @RequestMapping(value = "/myapi",method = RequestMethod.GET)
    public String someMethod(ModelMap model)
    {
        model.addAttribute("message",service.someval());
        /*ModelAndView modelAndView=new ModelAndView("welcome");*/
        return "hello";
    }
}