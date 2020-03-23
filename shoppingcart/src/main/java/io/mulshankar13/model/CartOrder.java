
package io.mulshankar13.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.SerializedName;

@Entity(name = "cartorder")
@Table(name = "cartorder")
public class CartOrder implements Serializable {

	private static final long serialVersionUID = -8779900999023178004L;

	@Id
	@GeneratedValue
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column
	private long totalValue;

	public CartOrder() {
	}

	public CartOrder(long totalValue) {
		super();
		this.totalValue = totalValue;

	}

	@ManyToOne(fetch = FetchType.LAZY)
	@SerializedName(value = "customer")
	@JsonBackReference
	private Customer customer;

	/*
	 * TODO
	 * 
	 * @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	 * 
	 * @JoinTable(name = "order_discount", joinColumns = {
	 * 
	 * @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false,
	 * updatable = false) }, inverseJoinColumns = {
	 * 
	 * @JoinColumn(name = "discount_id", referencedColumnName = "id", nullable =
	 * false, updatable = false) }) private Set<Discount> discounts = new
	 * HashSet<>();
	 */

	public long getTotalValue() {
		return totalValue;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setTotalValue(long totalValue) {
		this.totalValue = totalValue;
	}

	/*
	 * public Set<Discount> getDiscounts() { return discounts; }
	 * 
	 * public void setDiscounts(Set<Discount> discounts) { this.discounts =
	 * discounts; }
	 */

	@Override
	public String toString() {
		return "CartOrder [totalValue=" + totalValue + "]";
	}

}
