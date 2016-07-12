/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbottle.hellospring.controllers;

/**
 *
 * @author elev4
 */

import com.outbottle.hellospring.entities.Person;
import com.beans.Users;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.activation.DataSource;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class DefaultController {

    private DataSource dataSource;
    
    public void setDatasource(DataSource dataSource){
        this.dataSource=dataSource;
    }
    
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String index(ModelMap map) {
        Users user = new Users();
        map.addAttribute("user", user);
        
//        Date date = new Date();
//        map.addAttribute("hello", dateFormat.format(date));
        return "main";
    }
    
//    @RequestMapping(value="/", method= RequestMethod.GET)
//    public String index(ModelMap map) {
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        Date date = new Date();
//        map.addAttribute("hello", dateFormat.format(date));
//        return "index";
//    }
    
//    @RequestMapping(value="/createUser", method= RequestMethod.POST)
//    public ModelAndView createUser(@ModelAttribute("user") User newUser,ModelMap map) throws SQLException {
//        try{
//            String query = "insert into users(email,password)values" + "(?,?)";
//            System.out.println(query);
//            Class.forName("com.mysql.jdbc.Driver");
//            try(Connection con = this.dataSource.getConnection()){
//                PreparedStatement preparedStatement=con.preparedStatement(query);
//                preparedStatement.setString(1, newUser.getEmail());
//                preparedStatement.setString(1, newUser.getPassword());
//                preparedStatement.executeUpdate();
//            }
//        }catch(ClassNotFoundException | SQLDataException e) {
//            int i=0;
//        }
//        map.addAttribute("email", newUser.getPassword());
//        return new ModelAndView("profile");
//    }
    
    @RequestMapping(value="/viewdemo", method= RequestMethod.GET)
    public String demo(ModelMap map) {
        Person person = new Person();
        person.setName("Jack");
        person.setAge(52);
        map.put("personObject", person);
        map.addAttribute("helloAgain", "Hello (Again) Spring from Netbeans!!");
        return "demo";
    }

}
