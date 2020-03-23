package io.mulshankar13.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "cart")
@Table(name="cart")
public class Cart implements Serializable {

	private static final long serialVersionUID = 6373834658640858131L;

	@Id
	@GeneratedValue
	private long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer__id", nullable = false)
	private Customer customer;

}
