package br.com.taking.ProjetoGestaoRH.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="state")

public class State {
	
	
	@Id
	@Column (name= "state_id")
	private int state_id;
	
	@Column (name = "state")
	private String stateName;
	
	
	@ManyToOne
	@JoinColumn(name= "country_id")
	private Country country;


	

	public int getState_id() {
		return state_id;
	}


	public void setState_id(int state_id) {
		this.state_id = state_id;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	public Country getCountry() {
		return country;
	}


	public void setCountry(Country country) {
		this.country = country;
	}


	


}
