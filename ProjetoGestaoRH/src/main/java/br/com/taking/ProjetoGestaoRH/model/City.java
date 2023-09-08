package br.com.taking.ProjetoGestaoRH.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="city")

public class City {
	
	
	@Id
	@Column (name= "city_id")
	private int city_id;
	
	@Column (name = "city")
	private String cityName;
		
	@ManyToOne
	@JoinColumn(name= "state_id")
	private State state_id;

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public State getState_id() {
		return state_id;
	}

	public void setState_id(State state_id) {
		this.state_id = state_id;
	}

	



}
