/**
 * 
 */
package com.example.demo.model;

/**
 * @author eliezer
 *
 */
public class Item {
	private int itemId;
	private String name, type, genre, procedencia, country;
	public Item(int itemId, String name, String type, String genre, String procedencia, String country) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.type = type;
		this.genre = genre;
		this.procedencia = procedencia;
		this.country = country;
	}
	
	public Item() {
		super();
	}

	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
