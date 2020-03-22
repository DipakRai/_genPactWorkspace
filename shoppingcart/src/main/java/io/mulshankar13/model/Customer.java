package io.mulshankar13.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="CUSTOMER")
@Table(name="CUSTOMER")
public class Customer implements Serializable {

	private static final long serialVersionUID = -2529070437909716795L;

	@Id
	@GeneratedValue
	private long id;
	
	public Customer() {
	
	}
	
	public Customer (String name, String address) {
		super();
		this.name=name;
		this.address=address;
	}
	@Column(name="name")
	private String name;

	@Column(name="address")
	private String address;
	
	//@OneToMany(mappedBy = "customer")
	//private List<CartOrder> orders = new ArrayList<CartOrder>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + "]";
	}

}