package io.mulshankar13.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "discount")
public class Discount implements Serializable{

	private static final long serialVersionUID = -8158158214463264991L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private long discountPercentage;
	
	private String discountDescription;

	public long getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(long discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public String getDiscountDescription() {
		return discountDescription;
	}

	public void setDiscountDescription(String discountDescription) {
		this.discountDescription = discountDescription;
	}

	@Override
	public String toString() {
		return "Discount [discountPercentage=" + discountPercentage + ", discountDescription=" + discountDescription
				+ "]";
	}
	
}
