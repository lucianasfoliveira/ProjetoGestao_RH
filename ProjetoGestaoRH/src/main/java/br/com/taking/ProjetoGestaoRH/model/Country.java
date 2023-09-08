package br.com.taking.ProjetoGestaoRH.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="country")

public class Country {
	
	
	@Id
	@Column (name= "country_id")
	private int country_id;
	
	@Column (name = "country")
	private String countryName;

	

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	
	

}
