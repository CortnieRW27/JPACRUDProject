package com.skilldistillery.cupcakes.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cupcake {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String type;
	
	@Column(name="cake_flavor")
	private String cakeFlavor;
	
	@Column(name="icing_flavor")
	private String icingFlavor;
	

	private String description;
	
	private String theme;
	
	private Integer amount;
	
	private Double price;

	public Cupcake() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCakeFlavor() {
		return cakeFlavor;
	}

	public void setCakeFlavor(String cakeFlavor) {
		this.cakeFlavor = cakeFlavor;
	}

	public String getIcingFlavor() {
		return icingFlavor;
	}

	public void setIcingFlavor(String icingFlavor) {
		this.icingFlavor = icingFlavor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cupcake [id=" + id + ", type=" + type + ", cakeFlavor=" + cakeFlavor + ", icingFlavor=" + icingFlavor
				+ ", description=" + description + ", theme=" + theme + ", amount=" + amount + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, cakeFlavor, description, icingFlavor, id, price, theme, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cupcake other = (Cupcake) obj;
		return Objects.equals(amount, other.amount) && Objects.equals(cakeFlavor, other.cakeFlavor)
				&& Objects.equals(description, other.description) && Objects.equals(icingFlavor, other.icingFlavor)
				&& id == other.id && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(theme, other.theme) && Objects.equals(type, other.type);
	}

	

	}	