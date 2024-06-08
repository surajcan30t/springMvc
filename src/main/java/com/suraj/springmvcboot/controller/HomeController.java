package com.suraj.springmvcboot.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }
//    @RequestMapping("add")
//    public String add(HttpServletRequest request){
//
//        int num1 = Integer.parseInt(request.getParameter("num1"));
//        int num2 = Integer.parseInt(request.getParameter("num2"));
//        int num3 = num1 + num2;
//        HttpSession session = request.getSession();
//        session.setAttribute("num3", num3);
//        return  "result.jsp";
//    }

    //Another Method
//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int n1, @RequestParam("num2") int n2, HttpSession session){
//
//
//        int num3 = n1 + n2;
//        session.setAttribute("num3", num3);
//        return  "result.jsp";
//    }

    //Another Method Using ModelAndViewer
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int n1, @RequestParam("num2") int n2){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("result.jsp");

        int num3 = n1 + n2;
        mv.addObject("num3",num3);

        return mv;
    }
}
