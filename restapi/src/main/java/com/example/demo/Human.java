package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "human")
public class Human {
	private String name;
	private String address;
	private Set<Drink> drinks = new HashSet<>();
	
	@Id
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@ManyToMany(mappedBy = "humans")
	@JsonManagedReference
	public Set<Drink> getDrinks() {
		return drinks;
	}
	public void setDrinks(Set<Drink> drinks) {
		this.drinks = drinks;
	}
}
