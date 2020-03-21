
package io.mulshankar13.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "cartorder")
@Table(name = "cartorder")
public class CartOrder implements Serializable {

	private static final long serialVersionUID = -8779900999023178004L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private long totalValue;

	public CartOrder() {
	}

	public CartOrder(long totalValue) {
		super();
		this.totalValue = totalValue;

	}

	// TODO List<Item> items

	// TODO Customer customer

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
