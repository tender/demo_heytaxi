package com.demo.heytaxi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.heytaxi.model.entity.User;
import com.demo.heytaxi.service.DriverService;

@Controller
public class DriverController {
    @Autowired
    private DriverService driverService;
 
    @RequestMapping("/")
    public ModelAndView handleRequest() throws Exception {
        List<User> listUsers = driverService.list();
        ModelAndView model = new ModelAndView("UserList");
        model.addObject("userList", listUsers);
        return model;
    }
     
    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public ModelAndView newUser() {
        ModelAndView model = new ModelAndView("UserForm");
        model.addObject("user", new User());
        return model;      
    }
     
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editUser(HttpServletRequest request) {
        Long userId = Long.parseLong(request.getParameter("id"));
        User user = driverService.get(userId);
        ModelAndView model = new ModelAndView("UserForm");
        model.addObject("user", user);
        return model;      
    }
     
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView deleteUser(HttpServletRequest request) {
        Long userId = Long.parseLong(request.getParameter("id"));
        driverService.delete(userId);
        return new ModelAndView("redirect:/");     
    }
     
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView saveUser(@ModelAttribute User user) {
    	driverService.saveOrUpdate(user);
        return new ModelAndView("redirect:/");
    }   
}
