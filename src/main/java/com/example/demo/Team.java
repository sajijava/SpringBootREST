package com.example.demo;

import java.io.Serializable;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Team implements Serializable {
	private String name;
	private String location;
	private String mascot;
	private Set<Players> players;
	

	
	public Team() {
		super();
	}
	
	public Team(String name, String location,  Set<Players> players) {
		super();
		this.name = name;
		this.location = location;
		this.mascot = mascot;
		this.players = players;
	}
	public Set<Players> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Players> players) {
		this.players = players;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMascot() {
		return mascot;
	}
	public void setMascot(String mascot) {
		this.mascot = mascot;
	}
	
	
	

}
