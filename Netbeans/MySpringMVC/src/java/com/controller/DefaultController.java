/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author elev4
 */

@Controller
public class DefaultController {
    
    @RequestMapping
    public ModelAndView index(){
    
    ModelAndView mv = new ModelAndView("index");
        mv.addObject("message", "This is Spring MVC");
        
        return mv;
    }
}
