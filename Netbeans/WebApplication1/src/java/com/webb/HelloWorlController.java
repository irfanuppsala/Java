/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webb;
 

/**
 *
 * @author elev4
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorlController {
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(ModelMap map){
        map.addAttribute("Hi", "Hello from Spring MVC Netbeans");
        return"index";
    }
}
