
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.port;
import com.example.demo.repository.portrepository;

@Service
public class portservice {
	@Autowired
	
	private portrepository rep; 
	public void add(port b) {
		rep.save(b);
	}
	
}
