package com.by.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author supercoder
 */
@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String showHomePage(){
        return "main-menu";
    }
    
}
