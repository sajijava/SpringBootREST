package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
	private Team team;
	@PostConstruct
	public void init()
	{
		Set<Players> players = new HashSet();
		players.add(new Players("Snoopy","Pitcher"));
		players.add(new Players("Charle Brown","Shortstop"));
		
		team = new Team("Peanuts","California", players);
		
		
	}
	@RequestMapping("/hi")
	public  Team hiThere() {
		return team;
	}
}
