/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journaldev.dao;

import java.util.List;
import com.journaldev.model.Person;

/**
 *
 * @author elev4
 */
public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
	
}
